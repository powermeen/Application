package web.sql;

public class RunTestCaseQuery {

	
	public String getAllGroup (){
		String query = "select i_group_id as Id , s_name as name ,  s_module as module ,i_status as status from group_table where i_status > 0 ";
		return query;
		
	}

	public String getLoginSetupByReference() {
		String query = "select i_setup_id as setupId , s_module as module , s_widget_id as widgetId , s_widget_name as widgetName , s_data as data , s_action_type as actionType , s_sequence as sequence ,s_reference as reference from setup_table where s_module = 'login'and s_reference = ?  ";
		return query;
	}
}
