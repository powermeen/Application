package web.sql;

public class SiteSalesReportQuery {

	
	public String getSiteSalesReportBySite(){
		String query = "SELECT Site as dispenserNo ,Delivery_type as  product ,  Delivery_Volume AS liter , Delivery_value AS money   from Hose_Delivery  where branch = ? and Site = ? ";
		return query;
	}
}
