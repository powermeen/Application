package web.dao.server.site.sales.report;

import java.util.List;

import javax.sql.DataSource;

import web.shared.SitelSalesReportBean;

public interface SiteSalesReportDao {

	public void setDataSource(DataSource dataSource) throws IllegalArgumentException;
	
	public List<SitelSalesReportBean> getDataBySite(String branch,String site)throws IllegalArgumentException;
	
}
