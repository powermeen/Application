package web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import web.comstant.PageRegister;
import web.dao.service.LoginService;
import web.dao.service.TotalSalesReportService;
import web.shared.LoginBean;
import web.shared.TotalSalesReportBean;

@Controller
public class AllpicationController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
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
	
	@RequestMapping(value = "/TotalSalesReport", method = RequestMethod.GET)
	public ModelAndView totalSalesReport(){
		ModelAndView modelAndView = new ModelAndView();
		TotalSalesReportService reportService =new TotalSalesReportService();
		List<TotalSalesReportBean> reportBeans = reportService.fetchDataTotalSalesReportByBranch();
		String 	viewName = PageRegister.TOTAL_SALES_REPORT.getPath();
		
		modelAndView.setViewName(viewName);
		modelAndView.addObject("reportBeans", reportBeans);
		return  modelAndView;
	}
	
	@RequestMapping(value = "/TotalSalesReportByOffice", method = RequestMethod.GET)
	public String totalSalesReportByOffice(){
		
		String 	viewName = PageRegister.TOTAL_SALES_REPORT_BY_OFFICE.getPath();
		return  viewName;
	}
	
	@RequestMapping(value = "/TestMappingData", method = RequestMethod.GET)
	public String testMappingData(){
		
		String 	viewName = PageRegister.TEST_MAPPING_DATA.getPath();
		return  viewName;
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