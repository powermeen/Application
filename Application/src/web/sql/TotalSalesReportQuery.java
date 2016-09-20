package web.sql;

public class TotalSalesReportQuery {

	
	public String getTotalSalesReportAllSideQuery(){
		String query = "  SELECT Site  , COUNT(ID) as quality , SUM(Delivery_Volume) AS liter , SUM(Delivery_value) AS money   from Hose_Delivery  where branch = ? GROUP BY Site order by Site ASC ";
		
		return query;
		
	}
}
