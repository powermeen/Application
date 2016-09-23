package web.dao.server.site.sales.report;

import java.util.List;

import javax.sql.DataSource;

import web.shared.SiteSalesReportBean;

public interface SiteSalesReportDao {

	public void setDataSource(DataSource dataSource) throws IllegalArgumentException;
	
	public List<SiteSalesReportBean> getDataBySite(String branch,String site)throws IllegalArgumentException;
	
}
