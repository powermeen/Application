package web.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.comstant.SpringNameBean;
import web.dao.server.login.LoginJDBCTemplate;
import web.shared.LoginSetupBean;

public class LoginService {

	@Autowired
	LoginJDBCTemplate loginJDBCTemplate;

	public LoginService() {
		ApplicationContext context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);

		 loginJDBCTemplate = (LoginJDBCTemplate) context.getBean(SpringNameBean.LOGIN);
	}

	public boolean authentication(LoginSetupBean loginSetupBean) {
		boolean isCkeck = loginJDBCTemplate.authentication(loginSetupBean);
		return isCkeck;
	}

}
