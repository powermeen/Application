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
	
	public String getDataByReference(){
		String query = "select i_setup_id as setupId , s_module as module , s_widget_id as widgetId ,s_name_widget";
		return query ;
	}
}
