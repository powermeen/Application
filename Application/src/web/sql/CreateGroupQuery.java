package web.sql;

public class CreateGroupQuery {

	public String getAllGroup (){
		String query = "select i_group_id as Id , s_name as name ,i_status as status from group_table ";
		return query;
		
	}

	public String addGroup() {
		String query = "insert into group_table (s_name   ,i_status) values (?,0); ";
		return query;
	}

	public String updateGroup() {
		String query = "update group_table set s_name = ? where i_group_id =  ? ";
		return query;
	}

	public String deleteGroupById() {
		String query = "delete from group_table  where i_group_id  = ?";
		return query;
	}
	
	public String getGroupById(){
		String query = "select i_group_id as Id , s_name as name ,i_status as status from group_table where i_group_id = ? ";
		return query;
	}

	public String updateGroupInStep() {
		String query = "update setup_table set s_reference = ? where s_reference = ? ";
		return query;
	}
	
	
}
