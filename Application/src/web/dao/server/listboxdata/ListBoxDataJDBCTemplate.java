package web.dao.server.listboxdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import web.dao.mapper.WidgetsCollectionRowmapper;
import web.dao.service.connection.ConnectionFactory;
import web.shared.WidgetsCollectionBean;
import web.sql.ListBoxDataQuery;

public class ListBoxDataJDBCTemplate extends ConnectionFactory implements ListBoxDataDao {

	private JdbcTemplate jdbcTemplate;

	private ListBoxDataQuery query = new ListBoxDataQuery();

	public ListBoxDataJDBCTemplate() {

		this.jdbcTemplate = super.getJdbcTemplateFromHSQLConnection();
	}

	@Override
	public Map<String, String> getWidgetsIdByModule(String module) throws IllegalArgumentException {
		
		Object[] objects = new Object[1];
		objects[0] = module;
		String sql = query.getWidgetsIdByModule();
		
		List<WidgetsCollectionBean> beans = new ArrayList<>();
		beans = jdbcTemplate.query(sql, objects, new WidgetsCollectionRowmapper());
		
		Map<String , String > widgetMap = new HashMap<>();
		for (WidgetsCollectionBean widgetsCollectionBean : beans) {
			String key = widgetsCollectionBean.getWidgetId();
			String[] displayKey = key.split("_");
			String value = widgetsCollectionBean.getWidgetId();
			
			widgetMap.put(displayKey[1], value);
		}
		
		return widgetMap;
	}

}
