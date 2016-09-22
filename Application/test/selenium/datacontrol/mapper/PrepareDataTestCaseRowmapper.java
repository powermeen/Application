package selenium.datacontrol.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import selenium.datacontrol.shared.PrepareTestDataBean;

public class PrepareDataTestCaseRowmapper implements RowMapper<PrepareTestDataBean>{

	@Override
	public PrepareTestDataBean mapRow(ResultSet resultSet, int arg1) throws SQLException {

		PrepareTestDataBean prepareTestDataBean  = new PrepareTestDataBean();
		
		String widgetId = resultSet.getString("widgetId");
		String widgetData = resultSet.getString("widgetData");
		String widgetType = resultSet.getString("widgetType");
		String actionType = resultSet.getString("actionType");
		String testCaseName = resultSet.getString("testCaseName");
		
		prepareTestDataBean.setWidgetId(widgetId);
		prepareTestDataBean.setWidgetData(widgetData);
		prepareTestDataBean.setWidgetType(widgetType);
		prepareTestDataBean.setActionType(actionType);
		prepareTestDataBean.setTestCaseName(testCaseName);
		
		return prepareTestDataBean;
	}

}
