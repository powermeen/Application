package web.dao.server.widgets.collection;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import web.common.connection.ConnectionFactory;
import web.common.util.DaoStatus;
import web.common.util.NotificationUtil;
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

	@Override
	public boolean addWidgetId(WidgetsCollectionBean collectionBean) throws IllegalArgumentException {

		String sql = query.addWidgetId();
		String module =  collectionBean.getModule();
		String widgetId =  collectionBean.getWidgetId();
		String description =  collectionBean.getDescription();
		
		Object[] objects = new Object[3];
		objects[0] = module;
		objects[1] = widgetId;
		objects[2] = description;
		int status = jdbcTemplate.update(sql, objects);
		return DaoStatus.isCheckTransectionsStatus(status);
	}

	public WidgetsCollectionBean getWidgetsCollectionByWidgetId(String widgetId) {
	
		WidgetsCollectionBean bean = null; 
		String sql = query.getWidgetsCollectionByWidgetId();
		List<WidgetsCollectionBean> beans = new ArrayList<>();
		beans = jdbcTemplate.query(sql, new WidgetsCollectionRowmapper());
		
		if(!beans.isEmpty()){
			bean = beans.get(0);
		}
		return bean;
	}

}
