package web.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.comstant.SpringNameBean;
import web.dao.server.login.setup.LoginSetupJDBCTemplate;
import web.dao.server.run.test.cases.RunTestCaseJDBCTemplate;
import web.shared.EnvironmentBean;
import web.shared.GroupBean;
import web.shared.SetupBean;

public class RunTestCaseService {

	@Autowired
	RunTestCaseJDBCTemplate jdbcTemplate ; 
	
	public RunTestCaseService() {
		ApplicationContext context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);

		jdbcTemplate = (RunTestCaseJDBCTemplate) context.getBean(SpringNameBean.RUN_TEST_CASE);
	}

	public List<GroupBean> getAllGroup() {
		List<GroupBean> groupBeans = jdbcTemplate.getAllGroup();
		return groupBeans;
	}

	public void runTestCase(GroupBean groupBean) {

		jdbcTemplate.runTestCase(groupBean);
		
	}

	public List<SetupBean> getLoginSetupByReference(String name) {
		
		List<SetupBean> setupBeans = jdbcTemplate.getLoginSetupByReference(name);
		return setupBeans;
	}

	public List<EnvironmentBean> genEnvironmentActive() {
		List<EnvironmentBean> environmentBeans = jdbcTemplate.genEnvironmentActive();
		return environmentBeans;
	}
}
