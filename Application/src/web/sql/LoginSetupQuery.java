package web.sql;

public class LoginSetupQuery {

	public String getOfficeListQuery() {
		String query = "select  s_code as code , s_name as name  from office_table where i_status = 1 ";
		return query;
	}

	public String getEnvironmentListQuery() {
		String query = "select  s_code as code , s_name as name,s_url as url  from environment_table where i_status = 1 ";
		return query;
	}

	public String getReferenceQuery() {
		String query = "select  s_reference as reference   from setup_table  where s_reference = ? ";
		return query;
	}
}
