package web.dao.service;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import web.common.connection.ConnectionFactory;
import web.common.util.SpringContextUtils;
import web.comstant.SpringNameBean;
import web.dao.server.listboxdata.ListBoxDataJDBCTemplate;
import web.dao.server.login.LoginJDBCTemplate;

public class ListBoxDataService {

	@Autowired
	ListBoxDataJDBCTemplate jdbcTemplate;

	public ListBoxDataService() {
		ApplicationContext context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);

		jdbcTemplate = (ListBoxDataJDBCTemplate) context.getBean(SpringNameBean.LIST_BOX_DATA);
	}

	public Map<String, String> getWidgetsIdByModule(String module) {
		Map<String, String> widgetMap =jdbcTemplate.getWidgetsIdByModule(module);
		return widgetMap;
	}
	

}
