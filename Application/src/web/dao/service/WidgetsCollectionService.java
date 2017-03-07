package web.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.comstant.SpringNameBean;
import web.dao.server.login.setup.LoginSetupJDBCTemplate;
import web.dao.server.widgets.collection.WidgetsCollectionJDBCTemplate;
import web.shared.WidgetsCollectionBean;

public class WidgetsCollectionService {
	
	@Autowired
	WidgetsCollectionJDBCTemplate jdbcTemplate;

	
	public WidgetsCollectionService() {
		ApplicationContext context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);

		jdbcTemplate = (WidgetsCollectionJDBCTemplate) context.getBean(SpringNameBean.WIDGETS_COLLECTION);
	}

	public List<WidgetsCollectionBean> getWidgetsCollectionByModule(String module) {
		
		 List<WidgetsCollectionBean> widgetsCollectionBeans = jdbcTemplate.getWidgetsCollectionByModule(module);
		 
		return widgetsCollectionBeans ;
	}
}
