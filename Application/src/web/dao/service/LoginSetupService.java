package web.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.comstant.SpringNameBean;
import web.dao.server.login.LoginJDBCTemplate;
import web.dao.server.login.setup.LoginSetupJDBCTemplate;

public class LoginSetupService {

	@Autowired
	LoginSetupJDBCTemplate jdbcTemplate;
	public LoginSetupService() {
		ApplicationContext context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);

		jdbcTemplate = (LoginSetupJDBCTemplate) context.getBean(SpringNameBean.LOGIN_SETUP);
	}
}
