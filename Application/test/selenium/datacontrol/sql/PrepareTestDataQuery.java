package selenium.datacontrol.sql;

public class PrepareTestDataQuery {

	public String getPrepareTestDataByTestCase(String testCase){
		
		String query = "select c_widget_id as widgetId , c_widget_data as widgetData ,c_widget_type as widgetType , c_test_case_name as testCaseName from gen_prepare_test_data where c_test_case_name = ? ";
		
		return query;
		
	}
}
