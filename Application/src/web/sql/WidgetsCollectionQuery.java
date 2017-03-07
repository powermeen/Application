package web.sql;

public class WidgetsCollectionQuery {

	private String selectWidgetsCollection = "select  i_collection_id as id , c_module as module , c_widget_id as widgetId ,c_description as description , i_status as status from  widgets_collection where";
	
	public String getWidgetsIdByModule(){
		String sql = selectWidgetsCollection + " c_module = ?";
		return sql;
		
	}
}
