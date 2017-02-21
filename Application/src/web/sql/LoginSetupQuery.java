package web.sql;

public class LoginSetupQuery {

	public String getOfficeListQuery() {
		String query = "select  c_code as code , c_name as name  from office_table where i_status = 1 ";
		return query;
	}

	public String getEnvironmentListQuery() {
		String query = "select  c_code as code , c_name as name,c_url as url  from environment_table where i_status = 1 ";
		return query;
	}

	public String getReferenceQuery() {
		String query = "select  c_reference as reference   from setup_table  where c_reference = ? ";
		return query;
	}
	
	public String getDataByReference(){
		String query = "select i_setup_id as setupId , c_module as module , c_widget_id as widgetId ,c_name_widget";
		return query ;
	}
}
