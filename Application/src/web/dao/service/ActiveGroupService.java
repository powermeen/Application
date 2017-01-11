package web.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.comstant.SpringNameBean;
import web.dao.server.activegroup.ActiveGroupJDBCTemplate;
import web.dao.server.creategroup.CreateGroupJDBCTemplate;
import web.shared.GroupBean;

public class ActiveGroupService {
	
	@Autowired
	ActiveGroupJDBCTemplate jdbcTemplate ; 
	
	public ActiveGroupService() {
		ApplicationContext context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);

		jdbcTemplate = (ActiveGroupJDBCTemplate) context.getBean(SpringNameBean.ACTIVE_GROUP);
	}
	public List<GroupBean> getAllGroup() {

		List<GroupBean> groupBeans = jdbcTemplate.getAllGroup();
		return groupBeans;
	}
	public void changeStatus(GroupBean groupBean) {

		int success = jdbcTemplate.changeStatus(groupBean);
		
	}

}
