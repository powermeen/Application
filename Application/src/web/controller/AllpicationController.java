package web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import web.comstant.PageRegister;
import web.dao.service.LoginService;
import web.dao.service.TotalSalesReportService;
import web.shared.LoginBean;
import web.shared.TotalSalesReportBean;

@Controller
public class AllpicationController {

	@RequestMapping(value = "/", method = RequestMethod.GET )
	public String welcomeDemo(ModelMap model) {
		
		String 	viewName =PageRegister.INDEX.getPath();
		return viewName;

	}

	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {

		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("msg", name);
//		return "redirect:"+ viewName;
		return model;

	}
	
	@RequestMapping(value = "/DemoColumn", method = RequestMethod.GET)
	public String demoColumn(){
		
		String 	viewName = PageRegister.DEMO_COLUMN.getPath();
		return  viewName;
	}
	
	@RequestMapping(value = "/TotalSalesReport" ,produces = "application/json" )
	public ModelAndView totalSalesReport(){
		ModelAndView modelAndView = new ModelAndView();
		TotalSalesReportService reportService =new TotalSalesReportService();
		List<TotalSalesReportBean> reportBeans = reportService.fetchDataTotalSalesReportByBranch("�÷Ծ");
		String 	viewName = PageRegister.TOTAL_SALES_REPORT.getPath();
		
		modelAndView.setViewName(viewName);
		modelAndView.addObject("reportBeans", reportBeans);
		 String json = new Gson().toJson(reportBeans);	
		 modelAndView.addObject("jsonBean", json);
		return  modelAndView;
	}
	
	@RequestMapping(value = "/TotalSalesReportByOffice")
	public String totalSalesReportByOffice(@RequestParam("side") String side){
		
		String 	viewName = PageRegister.TOTAL_SALES_REPORT_BY_OFFICE.getPath();
		return  viewName;
	}
	
	@RequestMapping(value = "/TestMappingData" )
	public String testMappingData(){
		
		String 	viewName = PageRegister.TEST_MAPPING_DATA.getPath();
		
		return  viewName;
	}
	
	@ResponseBody
	@RequestMapping(value = "/TestMappingDataReset" ,produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String  testMappingDataReset(){
		
		TotalSalesReportBean  bean = new TotalSalesReportBean();
		bean.setSite("1");
		bean.setLiter("500");
		bean.setMoney("10000.000");
		bean.setQuality("50");
		List<TotalSalesReportBean>beans = new ArrayList<TotalSalesReportBean>();
		beans.add(bean);

		String data = new Gson().toJson(beans);
		return  data;
	}
	
	
	

	
	@RequestMapping(value = "/loginForm")
	public ModelAndView executeLogin(@ModelAttribute("loginModel") LoginBean loginBean ){
		
		LoginService loginService = new LoginService();
		boolean isAuthentication = loginService.authentication(loginBean);
		String path = null;
		ModelAndView modelAndView = new ModelAndView();
		if(isAuthentication){
			path = PageRegister.TOTAL_SALES_REPORT.getPath();
		}else {
			path = PageRegister.LOGIN.getPath();
		}
		modelAndView.setViewName(path);
		return modelAndView;
	}
	
	

}