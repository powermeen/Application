package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import web.comstant.PageRegister;
import web.dao.server.fetchdata.FetchDataJDBCTemplate;

@Controller
public class AllpicationController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomeDemo(ModelMap model) {

		
		
		
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
	public String selectDemo(@RequestParam("demoPage") String demoPage) {
		String page = null;

		
		if(PageRegister.LOGIN.getKey().equalsIgnoreCase(demoPage)){
			
			page = PageRegister.LOGIN.getPath();
			
		}else if (PageRegister.DEMO_COLUMN.getKey().equalsIgnoreCase(demoPage)) {
			
			page = PageRegister.DEMO_COLUMN.getPath();
			
		}else if (PageRegister.TOTAL_SALES_REPORT.getKey().equalsIgnoreCase(demoPage)) {
			
			page = PageRegister.TOTAL_SALES_REPORT.getPath();
			
		}else if (PageRegister.TOTAL_SALES_REPORT_BY_OFFICE.getKey().equalsIgnoreCase(demoPage)) {
			
			page = PageRegister.TOTAL_SALES_REPORT_BY_OFFICE.getPath();
			
		}else {
			page = PageRegister.INDEX.getPath();
		}
		return page;

	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String authenticationLogin(@RequestParam("username") String username,@RequestParam("password") String password) {
		String page = null;
		
		String string = username;
		String string2 = password;
		
		return page;
	}

}