package web.sql;

public interface FetchData {

	
	
	public static final String TEST_FETCH_DATA = "SELECT  Period_ID,Period_Create_TS ,Period_Type,Period_Close_DT ,Period_State,Period_Name ,Period_Number,Tank_Dips_Entered ,Tank_Drops_Entered,Pump_Meter_Entered,Exported,Export_Required,WetStock_Out_Of_Variance,WetStock_Approval_ID FROM new_db.dbo.Periods where Period_Type = ?";
}
