package web.sql;

public class CreateLoginStepQuery {

	
	public String getStepByReference(){
		
		String query = "select i_setup_id as setupId , s_module as module , s_widget_id as widgetId , s_widget_name as widgetName , s_data as data , s_action_type as actionType , s_sequence as sequence ,s_reference as reference from setup_table where s_module = 'login'and s_reference = ?  ";
		return query;
	}
	
	public String getGroupReference(){
		String query = "select i_id as id , s_name as name , i_status as status from group_table ";
		return query;
	}
}
