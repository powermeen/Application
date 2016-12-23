package web.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.shared.SetupBean;

public class SetupRowMapper implements RowMapper<SetupBean>{

	@Override
	public SetupBean mapRow(ResultSet resultSet, int arg1) throws SQLException {

		SetupBean setupBean = new SetupBean();
		
		String widgetId = resultSet.getString("widgetId");
		String module = resultSet.getString("module");
		String widgetName = resultSet.getString("widgetName");
		String data = resultSet.getString("data");
		String actionType = resultSet.getString("actionType");
		String sequence = resultSet.getString("sequence");
		String reference = resultSet.getString("reference");
		
		setupBean.setWidgetId(widgetId);
		setupBean.setModule(module);
		setupBean.setWidgetName(widgetName);
		setupBean.setData(data);
		setupBean.setActionType(actionType);
		setupBean.setSequence(sequence);
		setupBean.setReference(reference);
		
		return setupBean;
	}

}
