package web.sql;

public class LoginQuery {

	public String getAuthenticationQuery() {
		String query = "select  c_user_name as username , c_password as password , c_user_role as userrole from gen_user where c_user_name =? and c_password = ?";
		return query;
	}
}
