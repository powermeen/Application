package web.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.shared.SitelSalesReportBean;

public class SiteSalesReportRowMapper implements RowMapper<SitelSalesReportBean>{

	@Override
	public SitelSalesReportBean mapRow(ResultSet resultSet, int arg1) throws SQLException {
		
		SitelSalesReportBean sitelSalesReportBean = new SitelSalesReportBean();
		
		String dispenserNo = resultSet.getString("dispenserNo");
		String product = resultSet.getString("product");
		String liter = resultSet.getString("liter");
		String money = resultSet.getString("money");
		
		sitelSalesReportBean.setDispenserNo(dispenserNo);
		sitelSalesReportBean.setProduct(product);
		sitelSalesReportBean.setLiter(liter);
		sitelSalesReportBean.setMoney(money);
		
		return sitelSalesReportBean;
	}

}
