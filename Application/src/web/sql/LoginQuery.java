package web.sql;

public class LoginQuery {

	public String getAuthenticationQuery() {
		String query = "select  c_username as username , c_password as password , c_role as userrole from gen_user where c_username =? and c_password = ?";
		return query;
	}
}
