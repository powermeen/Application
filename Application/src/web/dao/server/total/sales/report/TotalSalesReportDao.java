package web.dao.server.total.sales.report;

import java.util.List;

import javax.sql.DataSource;

import web.shared.TotalSalesReportBean;

public interface TotalSalesReportDao {

	
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException;
	
	public List<TotalSalesReportBean> getDataByBranch(String branch) throws IllegalArgumentException;
}
