package test.junit;

import junit.framework.TestCase;
import web.dao.service.LoginService;
import web.shared.LoginBean;

public class LoginJunit extends TestCase {

	LoginService loginService = null;

	public LoginJunit() {

		loginService = new LoginService();

	}

	public void testAuthenticationPass() {
		LoginBean loginBean = new LoginBean();
		loginBean.setUserName("meen");
		loginBean.setPassword("meen");
		boolean isCheck = loginService.authentication(loginBean);
		assertEquals(true, isCheck);
	}

	public void testAuthenticationFailinput() {

		LoginBean loginBean = new LoginBean();
		loginBean.setUserName("XXXX");
		loginBean.setPassword("XXXX");
		boolean isCheck = loginService.authentication(loginBean);
		assertEquals(false, isCheck);
	}

	public void testAuthenticationEmptyUsernameAndPassword() {

		LoginBean loginBean = new LoginBean();
		loginBean.setUserName("");
		loginBean.setPassword("");
		boolean isCheck = loginService.authentication(loginBean);
		assertEquals(false, isCheck);
	}

	public void testAuthenticationNullUsernameEmptyPassword() {
		LoginBean loginBean = new LoginBean();
		loginBean.setUserName(null);
		loginBean.setPassword("");
		boolean isCheck = loginService.authentication(loginBean);
		assertEquals(false, isCheck);
	}
	
	public void testAuthenticationNullPasswordAndEmptyUsername() {
		LoginBean loginBean = new LoginBean();
		loginBean.setUserName("");
		loginBean.setPassword(null);
		boolean isCheck = loginService.authentication(loginBean);
		assertEquals(false, isCheck);
	}

}
