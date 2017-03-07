package web.sql;

public class ActiveGroupQuery {

	private String selectGroupTable = "select i_group_id as Id , c_name as name ,  c_module as module ,i_status as status from group_table";
	
	public String getAllGroup (){
		String query = selectGroupTable;
		return query;
		
	}

	public String changeStatus() {
		String query = "update group_table set i_status = ? where i_group_id =  ?";
		return query;
	}
}
