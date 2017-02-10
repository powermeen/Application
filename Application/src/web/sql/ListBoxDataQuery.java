package web.sql;

public class ListBoxDataQuery {

	public String getWidgetsIdByModule() {
		String sql = "select I_id as id , s_module as module , s_widget_id as widgetId , s_widget_description as description ,i_status as status from widgets_collection where s_module = ? and i_status = 1";
		return sql;
	}

}
