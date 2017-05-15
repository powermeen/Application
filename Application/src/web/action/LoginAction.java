package web.action;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import web.common.interfaces.SetupModelAndView;
import web.common.util.SessionUtil;
import web.comstant.PageRegister;
import web.shared.LoginBean;

public class LoginAction implements SetupModelAndView {

	private ModelAndView modelAndView = new ModelAndView();

	private LoginBean loginBean;

	public LoginAction(LoginBean loginBean) {
		this.loginBean = loginBean;
	}

	@Override
	public ModelAndView getSetupModelAndView() {

		String viewName = PageRegister.LOGIN.getPath();
		modelAndView.setViewName(viewName);
		return modelAndView;
	}

	@Override
	public void setupPage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setupData() {
		// TODO Auto-generated method stub

	}

	@Override
	public void action() {
		// TODO Auto-generated method stub

	}
	private void authenticationUser(){
		HttpSession httpSession = SessionUtil.getSession();
		System.out.println("Session id  : "+httpSession.getId());
		
		System.out.println("isValidSession : "+SessionUtil.isValidSession(httpSession));
		
		SessionUtil.createSessionByPermission(SessionUtil.ADMIN);
		
		System.out.println("isValidSession : "+SessionUtil.isValidSession(httpSession));
	}

}
