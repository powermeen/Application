package web.sql;

public class ListBoxDataQuery {

	private String selectWidgetsCollection = "select i_collection_id as id , c_module as module , c_widget_id as widgetId , c_description as description ,i_status as status from widgets_collection  ";
	
	public String getWidgetsIdByModule() {
		String sql = selectWidgetsCollection +"  where c_module = ? and i_status = 1";
		return sql;
	}

}
