package web.sql;

public class CreateGroupQuery {

	public String getAllGroup (){
		String query = "select i_group_id as Id , c_name as name ,  c_module as module ,i_status as status from group_table ";
		return query;
		
	}

	public String addGroup() {
		String query = "insert into group_table (c_name , c_module ,i_status) values (?,?,0); ";
		return query;
	}

	public String updateGroup() {
		String query = "update group_table set c_name = ? where i_group_id =  ? ";
		return query;
	}

	public String deleteGroupById() {
		String query = "delete from group_table  where i_group_id  = ?";
		return query;
	}
	
	public String getGroupById(){
		String query = "select i_group_id as Id , c_name as name , c_module as module ,i_status as status from group_table where i_group_id = ? ";
		return query;
	}

	public String updateGroupInStep() {
		String query = "update setup_table set c_reference = ? where c_reference = ? ";
		return query;
	}

	public String getGroupByName() {
		String query = "select i_group_id as Id , c_name as name , c_module as module ,i_status as status from group_table where c_name = ?";
		return query;
	}
	
	
}
