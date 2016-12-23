package web.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.comstant.SpringNameBean;
import web.dao.server.createloginstep.CreateLoginStepJDBCTemplate;
import web.dao.server.login.LoginJDBCTemplate;
import web.shared.GroupBean;
import web.shared.SetupBean;

public class CreateLoginStepService {

	
	@Autowired
	CreateLoginStepJDBCTemplate jdbcTemplate;
	
	
	public CreateLoginStepService() {
		ApplicationContext context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);

		jdbcTemplate = (CreateLoginStepJDBCTemplate) context.getBean(SpringNameBean.CREATE_LOGIN_SETUP);
	}
	
	public List<SetupBean> getStepByReference(SetupBean setupBean){
		List<SetupBean> setupBeans = 	jdbcTemplate.getStepByReference(setupBean);
		return setupBeans;
		
	}

	public List<GroupBean> getGroupReference() {

		List<GroupBean> groupBeans = jdbcTemplate.getGroupReference();
		return groupBeans;
	}
}
