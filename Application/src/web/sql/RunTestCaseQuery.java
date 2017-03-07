package web.sql;

public class RunTestCaseQuery {

	
	private String selectSetupTable = "select i_setup_id as setupId , c_module as module , c_widget_id as widgetId , c_widget_name as widgetName , c_data as data , c_action_type as actionType , c_sequence as sequence ,c_reference as reference from setup_table";
	
	private String selectGroupTable = "select i_group_id as Id , c_name as name ,  c_module as module ,i_status as status from group_table";
	
	private String selectEnvironmentTable = "select  c_code as code , c_name as name,c_url as url  from environment_table";
	
	public String getAllGroup (){
		String query = selectGroupTable+" where i_status > 0 ";
		return query;
		
	}

	public String getLoginSetupByReference() {
		String query = selectSetupTable +  " where c_module = 'login'and c_reference = ?  ";
		return query;
	}

	public String genEnvironmentActive() {
		String query = selectEnvironmentTable +" where i_status = 1 ";
		return query;
	}
}
