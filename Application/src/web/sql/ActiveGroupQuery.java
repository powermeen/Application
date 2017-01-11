package web.sql;

public class ActiveGroupQuery {

	public String getAllGroup (){
		String query = "select i_group_id as Id , s_name as name ,  s_module as module ,i_status as status from group_table ";
		return query;
		
	}

	public String changeStatus() {
		String query = "update group_table set i_status = ? where i_group_id =  ?";
		return query;
	}
}
