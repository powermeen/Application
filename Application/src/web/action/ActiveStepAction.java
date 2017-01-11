package web.action;

import org.springframework.web.servlet.ModelAndView;

import web.common.interfaces.SetupModelAndView;
import web.comstant.PageRegister;

public class ActiveStepAction implements SetupModelAndView{

	private ModelAndView modelAndView = new ModelAndView();
	
	
	public ActiveStepAction() {
		setupPage();
		setupData();
	}
	@Override
	public ModelAndView getSetupModelAndView() {
		return modelAndView;
	}

	@Override
	public void setupPage() {
		String viewName = PageRegister.ACTIVE_STEP.getPath();
		modelAndView.setViewName(viewName);
		
	}

	@Override
	public void setupData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}

}
