package web.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.comstant.SpringNameBean;
import web.dao.server.site.sales.report.SiteSalesReportJDBCTemplate;
import web.dao.server.total.sales.report.TotalSalesReportJDBCTemplate;
import web.shared.SitelSalesReportBean;

public class SiteSalesReportService {

	
	@Autowired
	SiteSalesReportJDBCTemplate jdbcTemplate;
	
	public SiteSalesReportService() {

		ApplicationContext context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);

		jdbcTemplate = (SiteSalesReportJDBCTemplate) context.getBean(SpringNameBean.SITE_SALES_REPORT_BY_OFFICE);

	}
	
	public List<SitelSalesReportBean> fetchTotalSalesReportByOfficeData(String branch,String site){
		
		List<SitelSalesReportBean> reportByOfficeBeans =jdbcTemplate.getDataBySite(branch, site);
		
		
		return reportByOfficeBeans;
		
	}
	
	
	
}
