package web.action;

import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

import web.common.interfaces.SetupModelAndView;
import web.comstant.PageRegister;
import web.dao.service.LoginSetupService;
import web.shared.LoginSetupBean;

public class LoginSetupAction implements SetupModelAndView {

	private ModelAndView modelAndView = new ModelAndView();

	private LoginSetupService loginSetupService = new LoginSetupService();
	
	private LoginSetupBean loginSetupBean;

	public LoginSetupAction(LoginSetupBean loginSetupBean) {

		this.loginSetupBean = loginSetupBean;
		setupPage();
		setupData();
	}

	@Override
	public ModelAndView getSetupModelAndView() {

		return modelAndView;
	}

	@Override
	public void setupPage() {
		String viewName = PageRegister.LOGIN_SETUP.getPath();
		modelAndView.setViewName(viewName);

	}

	@Override
	public void setupData() {

		setOfficeList();
		setEnvironmentList();

	}
	
	public void saveLoginSetupForm() {
		loginSetupBean = loginSetupService.saveLoginSetupForm(loginSetupBean);
		modelAndView.addObject("loginSetupBean",loginSetupBean );	
		
	}

	private void setOfficeList() {

		Map<String, String> officeBeans = loginSetupService.getOfficeList();
		modelAndView.addObject("officeBeans", officeBeans);
	}

	private void setEnvironmentList() {

		Map<String, String> environmentList = loginSetupService.getEnvironment();
		modelAndView.addObject("environmentList", environmentList);
	}

	

}
