package web.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.shared.TotalSalesReportByOfficeBean;

public class TotalSalesReportByOfficeRowMapper implements RowMapper<TotalSalesReportByOfficeBean>{

	@Override
	public TotalSalesReportByOfficeBean mapRow(ResultSet resultSet, int arg1) throws SQLException {
		
		TotalSalesReportByOfficeBean reportByOfficeBean = new TotalSalesReportByOfficeBean();
		
		String dispenserNo = resultSet.getString("dispenserNo");
		String product = resultSet.getString("product");
		String liter = resultSet.getString("liter");
		String money = resultSet.getString("money");
		
		reportByOfficeBean.setDispenserNo(dispenserNo);
		reportByOfficeBean.setProduct(product);
		reportByOfficeBean.setLiter(liter);
		reportByOfficeBean.setMoney(money);
		
		return reportByOfficeBean;
	}

}
