package web.dao.server.widgets.collection;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import web.common.connection.ConnectionFactory;
import web.dao.mapper.WidgetsCollectionRowmapper;
import web.shared.WidgetsCollectionBean;
import web.sql.WidgetsCollectionQuery;

public class WidgetsCollectionJDBCTemplate extends ConnectionFactory implements WidgetsCollectionDao{

	
	private JdbcTemplate jdbcTemplate;

	private WidgetsCollectionQuery query= new WidgetsCollectionQuery();
	
	public WidgetsCollectionJDBCTemplate() {
		jdbcTemplate = super.getJdbcTemplateFromMySQLConnection();
	}
	
	@Override
	public List<WidgetsCollectionBean> getWidgetsCollectionByModule(String module) throws IllegalArgumentException {
		
		String sql = query.getWidgetsIdByModule();
		Object[] objects = new Object[1];
		objects[0] = module;
		
		List<WidgetsCollectionBean> widgetsCollectionBeans = new ArrayList<WidgetsCollectionBean>();
		widgetsCollectionBeans = jdbcTemplate.query(sql, objects, new WidgetsCollectionRowmapper());
		
		return widgetsCollectionBeans;
	}

}
