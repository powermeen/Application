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
	
}
