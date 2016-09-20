package web.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import web.comstant.PageRegister;
import web.dao.service.FetchDataService;
import web.dao.service.LoginService;
import web.shared.LoginBean;

@Controller
public class AllpicationController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomeDemo(ModelMap model) {

//		FetchDataService dataService = new FetchDataService();
//		System.out.println(dataService);
//		dataService.selectTesting();
		

		return PageRegister.INDEX.getPath();

	}

	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {

		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("msg", name);

		return model;

	}

	@RequestMapping(value = "/selectDemo", method = RequestMethod.GET)
	public String selectDemo(@RequestParam("demoPage") String demoPage,HttpServletResponse httpServletResponse) {
		
		String viewName = null;
		ModelAndView modelAndView = new ModelAndView();
		

		if (PageRegister.LOGIN.getKey().equalsIgnoreCase(demoPage)) {

			viewName = PageRegister.LOGIN.getPath();
			
			

		} else if (PageRegister.DEMO_COLUMN.getKey().equalsIgnoreCase(demoPage)) {

			viewName = PageRegister.DEMO_COLUMN.getPath();

		} else if (PageRegister.TOTAL_SALES_REPORT.getKey().equalsIgnoreCase(demoPage)) {

			viewName = PageRegister.TOTAL_SALES_REPORT.getPath();

		} else if (PageRegister.TOTAL_SALES_REPORT_BY_OFFICE.getKey().equalsIgnoreCase(demoPage)) {

			viewName = PageRegister.TOTAL_SALES_REPORT_BY_OFFICE.getPath();

		} else if (PageRegister.TEST_MAPPING_DATA.getKey().equalsIgnoreCase(demoPage)) {
			
			viewName = PageRegister.TEST_MAPPING_DATA.getPath();
			
		}else {

			viewName = PageRegister.INDEX.getPath();
		}
		httpServletResponse.setHeader("Location", viewName);
		modelAndView.setViewName(viewName);
//		return "redirect:"+ viewName;
		return  viewName;

	}

	@RequestMapping(value = "/loginFormComment", method = RequestMethod.POST)
	public String executeLoginComment(@RequestParam("username") String username,@RequestParam("password") String password) {
		LoginBean loginBean = new LoginBean();
		loginBean.setUserName(username);
		loginBean.setPassword(password);
		LoginService loginService = new LoginService();
		String path = null;
		boolean isAuthentication = loginService.authentication(loginBean);
		
		if(isAuthentication){
			path = PageRegister.TOTAL_SALES_REPORT.getPath();
		}else {
			path = PageRegister.LOGIN.getPath();
		}
		return path;

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
	
	@RequestMapping(value = "/testMapping", method = RequestMethod.POST)
	public String testMappingData (@ModelAttribute("loginModel") LoginBean loginBean ){
		
		
		
		
		return PageRegister.TEST_MAPPING_DATA.getPath();
		
	}

}