package web.sql;

public class LoginSetupQuery {

	public String getOfficeListQuery() {
		String query = "select  s_office_code as officecode , s_office_name as officename  from office_table where i_status = 1 ";
		return query;
	}
}
