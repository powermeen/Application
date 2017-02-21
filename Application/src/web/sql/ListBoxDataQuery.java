package web.sql;

public class ListBoxDataQuery {

	public String getWidgetsIdByModule() {
		String sql = "select I_id as id , c_module as module , c_widget_id as widgetId , c_widget_description as description ,i_status as status from widgetc_collection where c_module = ? and i_status = 1";
		return sql;
	}

}
