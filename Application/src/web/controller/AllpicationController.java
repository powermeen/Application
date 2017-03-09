package web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import web.action.ActiveGroupAction;
import web.action.CreateGroupAction;
import web.action.CreateLoginStepAction;
import web.action.CreateWidgetsCollectionAction;
import web.action.AssistToolAction;
import web.action.LoginSetupAction;
import web.action.RunTestCaseAction;
import web.common.util.StringUtils;
import web.comstant.Action;
import web.comstant.PageRegister;
import web.shared.GroupBean;
import web.shared.LoginSetupBean;
import web.shared.SetupBean;
import web.shared.WidgetsCollectionBean;

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

	
	
	@RequestMapping(value = "/LoginSetup")
	public ModelAndView loginSetup(@ModelAttribute("loginModel") LoginSetupBean loginSetupBean ){
		ModelAndView modelAndView = new ModelAndView();
		
		if(loginSetupBean !=null){
			LoginSetupAction loginSetupAction =new LoginSetupAction(loginSetupBean);
//			loginSetupAction.saveLoginSetupForm();
			modelAndView = loginSetupAction.getSetupModelAndView();
		}
			
		
		
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
	public ModelAndView CreateGroup(@ModelAttribute("GroupModel") GroupBean groupBean){
		ModelAndView modelAndView = new ModelAndView();
		
		CreateGroupAction createGroupAction = new CreateGroupAction(groupBean );
		
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
	
	@RequestMapping(value = "/ActiveGroup" )
	public ModelAndView activeGroup(HttpServletRequest request){
		String id = request.getParameter("id");
		String status = request.getParameter("status");
		String direction = request.getParameter("direction");
		
		boolean isChecked = StringUtils.isNotNullAndEmpty(id) && StringUtils.isNotNullAndEmpty(status) && StringUtils.isNotNullAndEmpty(direction);
		
		GroupBean groupBean; 
		if(isChecked){
			 groupBean = new GroupBean(id,status,direction);
		}else {
			groupBean = new GroupBean();
		}
		
		
		
		
		ModelAndView modelAndView = new ModelAndView();
		
		ActiveGroupAction activeGroupAction = new ActiveGroupAction(groupBean);
		
		activeGroupAction.action();
		modelAndView = activeGroupAction.getSetupModelAndView();
		 
		return modelAndView;
		
	}
	
	
	@RequestMapping(value = "/RunTestCase" )
	public ModelAndView runTestCase(HttpServletRequest request){
		String name  = request.getParameter("name");
		String direction = request.getParameter("direction");
		
		boolean isChecked = StringUtils.isNotNullAndEmpty(name) && StringUtils.isNotNullAndEmpty(direction) ;
		
		GroupBean groupBean; 
		if(isChecked){
			 groupBean = new GroupBean(name,direction);
		}else {
			groupBean = new GroupBean();
		}
		
		ModelAndView modelAndView = new ModelAndView();
		
		RunTestCaseAction runTestCaseAction = new RunTestCaseAction(groupBean);
		
		runTestCaseAction.action();
		modelAndView = runTestCaseAction.getSetupModelAndView();
		 
		return modelAndView;
		
	}
	
	@RequestMapping(value = "/CreateWidgetsCollection" )
	public ModelAndView createWidgetsCollection(@ModelAttribute("WidgetsCollectionModel") WidgetsCollectionBean collectionBean  ){
		
		ModelAndView modelAndView = new ModelAndView();
		CreateWidgetsCollectionAction collectionAction = new CreateWidgetsCollectionAction(collectionBean);
		
		collectionAction.action();
		modelAndView = collectionAction.getSetupModelAndView();
		
		return modelAndView;
	}

	@RequestMapping(value = "/FileGenerator"  ,method = RequestMethod.GET )
	public @ResponseBody String assistTool(HttpServletRequest request){
		
		AssistToolAction assistToolAction = new AssistToolAction();
		List<String> list = assistToolAction.generateFileNumber();
		
		Gson gson = new Gson();
		String json = gson.toJson(list);
		
		return json;
		
	}
	

}