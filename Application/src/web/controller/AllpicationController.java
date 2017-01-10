package web.controller;

import java.io.UnsupportedEncodingException;
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

import web.action.CreateGroupAction;
import web.action.CreateLoginStepAction;
import web.action.LoginSetupAction;
import web.comstant.Action;
import web.comstant.PageRegister;
import web.dao.service.LoginService;
import web.dao.service.SiteSalesReportService;
import web.dao.service.TotalSalesReportService;
import web.shared.GroupBean;
import web.shared.LoginSetupBean;
import web.shared.SetupBean;
import web.shared.SiteSalesReportBean;
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
	
	@RequestMapping(value = "/loginForm")
	public ModelAndView executeLogin(@ModelAttribute("loginModel") LoginSetupBean loginSetupBean ){
		
		LoginService loginService = new LoginService();
		boolean isAuthentication = loginService.authentication(loginSetupBean);
		String path = null;
		ModelAndView modelAndView = new ModelAndView();
		if(isAuthentication){
			path = "redirect:"+ PageRegister.TOTAL_SALES_REPORT.getPath();
		}else {
			path = PageRegister.LOGIN.getPath();
		}
		modelAndView.setViewName(path);
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/TotalSalesReport"  )
	public ModelAndView executeTotalSalesReport(){
		ModelAndView modelAndView = new ModelAndView();
		TotalSalesReportService reportService =new TotalSalesReportService();
		List<TotalSalesReportBean> reportBeans = reportService.getDataByBranch("�÷Ծ");
		String 	viewName = PageRegister.TOTAL_SALES_REPORT.getPath();
		
		modelAndView.setViewName(viewName);
		modelAndView.addObject("reportBeans", reportBeans);	
		 
		return  modelAndView;
	}
	
	@ResponseBody
	@RequestMapping(value = "/TotalSalesReportReset" ,produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String  executeTotalSalesReportReset(){
		
		TotalSalesReportBean  bean = new TotalSalesReportBean();
		bean.setSite("1");
		bean.setLiter("500");
		bean.setMoney("10000.000");
		bean.setQuality("50");
		List<TotalSalesReportBean>beans = new ArrayList<TotalSalesReportBean>();
		beans.add(bean);
		TotalSalesReportService reportService =new TotalSalesReportService();
		List<TotalSalesReportBean> reportBeans = reportService.getDataByBranch("�÷Ծ");
		

		String data = new Gson().toJson(reportBeans);
		return  data;
	}
	
	@RequestMapping(value = "/SiteSalesReport" ,produces = "text/plain;charset=TIS-620")
	public ModelAndView executeSiteSalesReport(@RequestParam("site") String site ) throws UnsupportedEncodingException{
//		String newBranch = new String(branch.getBytes("ISO-8859-1"), "UTF-8");
		ModelAndView modelAndView = new ModelAndView();
		String 	viewName = PageRegister.SITE_SALES_REPORT.getPath();
		
		SiteSalesReportService reportByOfficeService = new SiteSalesReportService();
		
		List<SiteSalesReportBean> reportBeans = reportByOfficeService.getDataBySite("�÷Ծ", site );
		
		modelAndView.setViewName(viewName);
		modelAndView.addObject("reportBeans", reportBeans);	
		
		return  modelAndView;
	}
	
	@RequestMapping(value = "/SiteSalesReportxxxxx" ,produces = "text/plain;charset=TIS-620")
	public ModelAndView executeSiteSalesReportxxxx(
			@RequestParam("site") String site ,
			@RequestParam("branch") String branch ,
			@RequestParam("pastTime") String pastTime ) throws UnsupportedEncodingException{
		String newBranch = new String(branch.getBytes("ISO-8859-1"), "UTF-8");
		ModelAndView modelAndView = new ModelAndView();
		String 	viewName = PageRegister.SITE_SALES_REPORT.getPath();
		
		SiteSalesReportService reportByOfficeService = new SiteSalesReportService();
		
		List<SiteSalesReportBean> reportBeans = reportByOfficeService.getDataBySite(newBranch, site );
		
		modelAndView.setViewName(viewName);
		modelAndView.addObject("reportBeans", reportBeans);	
		
		return  modelAndView;
	}
	
	@RequestMapping(value = "/DemoColumn", method = RequestMethod.GET)
	public String demoColumn(){
		
		String 	viewName = PageRegister.DEMO_COLUMN.getPath();
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
	
	@RequestMapping(value = "/LoginSetup")
	public ModelAndView loginSetup(@ModelAttribute("loginModel") LoginSetupBean loginSetupBean ){
		ModelAndView modelAndView = new ModelAndView();
		
		if(loginSetupBean !=null){
			LoginSetupAction loginSetupAction =new LoginSetupAction(loginSetupBean);
//			loginSetupAction.saveLoginSetupForm();
			modelAndView = loginSetupAction.getSetupModelAndView();
		}
		
		
		
		
	
		
		
//		{
//			loginSetupBean = loginSetupService.saveLoginSetupForm(loginSetupBean);
//			modelAndView.addObject("loginSetupBean",loginSetupBean );	
//		}
		
		
		
		
		
		return  modelAndView;
	}
	

	
	@RequestMapping(value = "/CreateLoginStep")
	public ModelAndView CreateLoginStep(@ModelAttribute("SetupModel") SetupBean setupBean){
		ModelAndView modelAndView = new ModelAndView();
		
		CreateLoginStepAction loginStepAction = new CreateLoginStepAction(setupBean);
		
		loginStepAction.action();
		
		
		modelAndView = loginStepAction.getSetupModelAndView();
		
		return modelAndView;
		
	}
	
	@RequestMapping(value = "/CreateGroup" )
	public ModelAndView CreateGroup(@ModelAttribute("GroupModel") GroupBean groupBean, ModelMap model){
		ModelAndView modelAndView = new ModelAndView();
		
		CreateGroupAction createGroupAction = new CreateGroupAction(groupBean , model);
		
		createGroupAction.action();
		modelAndView = createGroupAction.getSetupModelAndView();
		 
		return modelAndView;
		
	}
	
	
	@RequestMapping(value = "/DataTable")
	public ModelAndView dataTable(){
		ModelAndView modelAndView = new ModelAndView();
		String viewName = PageRegister.DATA_TABLE.getPath();
		
		List<SetupBean> setupBeans = new ArrayList<>();

		for (int index = 0; index < 200; index++) {
			
			SetupBean bean = new SetupBean();
			bean.setSetupId("id_"+index);
			bean.setModule("module_"+index);
			bean.setWidgetId("widget_id_"+index);
			bean.setWidgetName("nameWidget_"+index);
			bean.setData("data_"+index);
			bean.setActionType(Action.SELECT);
			bean.setReference("reference_"+index);
			bean.setStatus("status_"+index);
			
			setupBeans.add(bean);
		}
		String data = new Gson().toJson(setupBeans);
		modelAndView.addObject("data", data);
		modelAndView.addObject("dataBean", setupBeans);
		modelAndView.setViewName(viewName);
		return modelAndView;
	}

	

}