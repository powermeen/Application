package web.sql;

public class WidgetsCollectionQuery {

	private String selectWidgetsCollection = "select  i_collection_id as id , c_module as module , c_widget_id as widgetId ,c_description as description , i_status as status from  widgets_collection where";
	
	public String getWidgetsIdByModule(){
		String sql = selectWidgetsCollection + " c_module = ?";
		return sql;
		
	}

	public String addWidgetId() {
		String sql = "INSERT INTO widgets_collection (c_module ,c_widget_id ,c_description, i_status ) VALUES (?,?,?,1) ";
		return sql;
	}

	public String getWidgetsCollectionByWidgetId() {
		String sql = " selectWidgetsCollection " + "where c_widget_id = ?  " ;
		return null;
	}
}
