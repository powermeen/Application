package web.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.shared.TotalSalesReportBean;

public class TotalSalesReportMapper implements RowMapper<TotalSalesReportBean> {

	@Override
	public TotalSalesReportBean mapRow(ResultSet resultSet, int arg1) throws SQLException {
		TotalSalesReportBean totalSalesReportBean = new TotalSalesReportBean();
		
		
		String site = resultSet.getString("site");
		String quality = resultSet.getString("quality");
		String liter = resultSet.getString("liter");
		String money = resultSet.getString("money");
		
		totalSalesReportBean.setSite(site);
		totalSalesReportBean.setQuality(quality);
		totalSalesReportBean.setLiter(liter);
		totalSalesReportBean.setMoney(money);
		

		return totalSalesReportBean;
	}

}
