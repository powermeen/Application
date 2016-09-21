package web.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.shared.PeriodBean;

public class PeriodRowMapper implements RowMapper<PeriodBean> {

	@Override
	public PeriodBean mapRow(ResultSet resultSet, int arg1) throws SQLException {

		PeriodBean periodBean = new PeriodBean();

		String periodId = resultSet.getString("Period_ID");
		String periodCreateTS = resultSet.getString("Period_Create_TS");
		String periodType = resultSet.getString("Period_Type");
		String periodCloseDT = resultSet.getString("Period_Close_DT");
		String periodState = resultSet.getString("Period_State");
		String periodName = resultSet.getString("Period_Name");
		String periodNumber = resultSet.getString("Period_Number");
		String tankDipsEntered = resultSet.getString("Tank_Dips_Entered");
		String tankDropsEntered = resultSet.getString("Tank_Drops_Entered");
		String pumpMeterEntered = resultSet.getString("Pump_Meter_Entered");
		String exported = resultSet.getString("Exported");
		String exportRequired = resultSet.getString("Export_Required");
		String wetStockOutOfVariance = resultSet.getString("WetStock_Out_Of_Variance");
		String wetStockApprovalId = resultSet.getString("WetStock_Approval_ID");

		periodBean.setPeriodId(periodId);
		periodBean.setPeriodCreateTS(periodCreateTS);
		periodBean.setPeriodType(periodType);
		periodBean.setPeriodCloseDT(periodCloseDT);
		periodBean.setPeriodState(periodState);
		periodBean.setPeriodName(periodName);
		periodBean.setPeriodNumber(periodNumber);
		periodBean.setTankDipsEntered(tankDipsEntered);
		periodBean.setTankDropsEntered(tankDropsEntered);
		periodBean.setPumpMeterEntered(pumpMeterEntered);
		periodBean.setExported(exported);
		periodBean.setExportRequired(exportRequired);
		periodBean.setWetStockOutOfVariance(wetStockOutOfVariance);
		periodBean.setWetStockApprovalId(wetStockApprovalId);

		return periodBean;
	}

}
