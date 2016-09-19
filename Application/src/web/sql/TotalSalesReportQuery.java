package web.sql;

public class TotalSalesReportQuery {

	
	public String getTotalSalesReportAllSideQuery(){
		String query = "select Delivery_Volume as liter , Delivery_value as money  from Hose_Delivery ";
		
		return query;
		
	}
}
