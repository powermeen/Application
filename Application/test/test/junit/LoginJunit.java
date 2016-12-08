package test.junit;

import junit.framework.TestCase;
import web.dao.service.LoginService;
import web.shared.LoginSetupBean;

public class LoginJunit extends TestCase {

	LoginService loginService = null;

	public LoginJunit() {

		loginService = new LoginService();

	}

	public void testAuthenticationPass() {
		LoginSetupBean loginBean = new LoginSetupBean();
		loginBean.setUserName("meen");
		loginBean.setPassword("meen");
		boolean isCheck = loginService.authentication(loginBean);
		assertEquals(true, isCheck);
	}

	public void testAuthenticationFailinput() {

		LoginSetupBean loginBean = new LoginSetupBean();
		loginBean.setUserName("XXXX");
		loginBean.setPassword("XXXX");
		boolean isCheck = loginService.authentication(loginBean);
		assertEquals(false, isCheck);
	}

	public void testAuthenticationEmptyUsernameAndPassword() {

		LoginSetupBean loginBean = new LoginSetupBean();
		loginBean.setUserName("");
		loginBean.setPassword("");
		boolean isCheck = loginService.authentication(loginBean);
		assertEquals(false, isCheck);
	}

	public void testAuthenticationNullUsernameEmptyPassword() {
		LoginSetupBean loginBean = new LoginSetupBean();
		loginBean.setUserName(null);
		loginBean.setPassword("");
		boolean isCheck = loginService.authentication(loginBean);
		assertEquals(false, isCheck);
	}
	
	public void testAuthenticationNullPasswordAndEmptyUsername() {
		LoginSetupBean loginBean = new LoginSetupBean();
		loginBean.setUserName("");
		loginBean.setPassword(null);
		boolean isCheck = loginService.authentication(loginBean);
		assertEquals(false, isCheck);
	}

}
