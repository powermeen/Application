package web.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.shared.WidgetsCollectionBean;

public class WidgetsCollectionRowmapper implements RowMapper<WidgetsCollectionBean>{

	@Override
	public WidgetsCollectionBean mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		WidgetsCollectionBean collectionBean = new WidgetsCollectionBean();
		
		String id = resultSet.getString("id");
		String module = resultSet.getString("module");
		String widgetId = resultSet.getString("widgetId");
		String description = resultSet.getString("description");
		String status = resultSet.getString("status");
		
		collectionBean.setId(id);
		collectionBean.setModule(module);
		collectionBean.setWidgetId(widgetId);
		collectionBean.setDescription(description);
		collectionBean.setStatus(status);
		
		return collectionBean;
	}

}
