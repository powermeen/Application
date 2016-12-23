package web.common.interfaces;

import org.springframework.web.servlet.ModelAndView;

public interface SetupModelAndView {

	public ModelAndView getSetupModelAndView();
	
	public void setupPage();
	
	public void setupData();
	
	public void action();
}
