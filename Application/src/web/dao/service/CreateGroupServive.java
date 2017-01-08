package web.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.comstant.SpringNameBean;
import web.dao.server.creategroup.CreateGroupJDBCTemplate;
import web.dao.server.createloginstep.CreateLoginStepJDBCTemplate;
import web.shared.GroupBean;

public class CreateGroupServive {

	@Autowired
	CreateGroupJDBCTemplate jdbcTemplate;
	
	public CreateGroupServive() {
		ApplicationContext context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);

		jdbcTemplate = (CreateGroupJDBCTemplate) context.getBean(SpringNameBean.CREATE_GROUP);
	}

	public List<GroupBean> getAllGroup() {

		List<GroupBean> groupBeans = jdbcTemplate.getAllGroup();
		return groupBeans;
	}

	public void addGroup(GroupBean groupBean) {

		jdbcTemplate.addGroup(groupBean);
		
	}

	public void updateGroup(GroupBean groupBean) {

		jdbcTemplate.updateGroup(groupBean);	
		
	}
}
