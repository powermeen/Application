package web.sql;

public class CreateLoginStepQuery {

	private String selectSetupTable = "select i_setup_id as setupId , c_module as module , c_widget_id as widgetId , c_widget_name as widgetName , c_data as data , c_action_type as actionType , c_sequence as sequence ,c_reference as reference from setup_table ";
	
	private String selectGroupTable = "select i_group_id as id , c_name as name ,  c_module as module ,i_status as status from group_table";
	
	public String getStepByReference(){
		
		String query = selectSetupTable + "where c_module = 'login'and c_reference = ?  ";
		return query;
	}
	
	public String getGroupReference(){
		String query = selectGroupTable ;
		return query;
	}

	public String addLoginStep() {
		String query = " insert into setup_table (c_module ,c_widget_id ,c_widget_name ,c_data ,c_action_type , c_sequence, c_reference ,i_status) values ('login', ?,?,?,?,?,?,'1'); ";
		return query;
	}

	public String updateLoginStep() {
		String query = " update setup_table set c_widget_id = ? , c_widget_name = ? ,c_data = ? , c_action_type = ? ,c_sequence =? ,  c_reference = ? where i_setup_id  = ?";
		return query;
	}
	
	public String deleteLoginStep(){
		String query = "delete from setup_table  where i_setup_id  = ? ";
		return query;
		
	}
}
