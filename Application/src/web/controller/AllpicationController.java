package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import web.comstant.PageRegister;

@Controller
public class AllpicationController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcomeDemo(ModelMap model) {

		
		return PageRegister.INDEX;

	}

	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {

		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("msg", name);

		return model;

	}
	
	@RequestMapping(value = "/selectDemo" ,  method = RequestMethod.GET)
	public String selectDemo(@RequestParam("demoPage") String demoPage) {
		String page = null;
		
		switch (demoPage) {
		case PageRegister.LOGIN:
			
			page = PageRegister.LOGIN;
			
			break;
			
		default:
			page = PageRegister.INDEX;
			break;
		}
	

		return page;

	}
	
	

}