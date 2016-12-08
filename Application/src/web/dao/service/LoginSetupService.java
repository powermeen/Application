package web.dao.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.comstant.SpringNameBean;
import web.dao.server.login.setup.LoginSetupJDBCTemplate;
import web.shared.LoginSetupBean;

public class LoginSetupService {

	@Autowired
	LoginSetupJDBCTemplate jdbcTemplate;

	public LoginSetupService() {
		ApplicationContext context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);

		jdbcTemplate = (LoginSetupJDBCTemplate) context.getBean(SpringNameBean.LOGIN_SETUP);
	}

	public Map<String, String> getOfficeList() {
		Map<String, String> officeMap = new LinkedHashMap<String, String>();

		officeMap = jdbcTemplate.getOfficeList();
		
		return officeMap;

	}

	public Map<String, String> getEnvironment() {
		Map<String, String> environmentMap = new LinkedHashMap<String, String>();
	
		environmentMap = jdbcTemplate.getEnvironmentList();
		
		return environmentMap;
	}

	public LoginSetupBean saveLoginSetupForm(LoginSetupBean loginSetupBean) {

		loginSetupBean = jdbcTemplate.saveLoginSetupForm(loginSetupBean);
		return loginSetupBean;
	}
}
