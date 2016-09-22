package web.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.comstant.SpringNameBean;
import web.dao.server.TotalSalesReport.TotalSalesReportJDBCTemplate;
import web.dao.server.TotalSalesReportByOffice.TotalSalesReportByOfficeJDBCTemplate;
import web.shared.TotalSalesReportByOfficeBean;

public class TotalSalesReportByOfficeService {

	
	@Autowired
	TotalSalesReportByOfficeJDBCTemplate jdbcTemplate;
	
	public TotalSalesReportByOfficeService() {

		ApplicationContext context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);

		jdbcTemplate = (TotalSalesReportByOfficeJDBCTemplate) context.getBean(SpringNameBean.TOTAL_SALES_REPORT_BY_OFFICE);

	}
	
	public List<TotalSalesReportByOfficeBean> fetchTotalSalesReportByOfficeData(String branch,String site){
		
		List<TotalSalesReportByOfficeBean> reportByOfficeBeans =jdbcTemplate.fetchTotalSalesReportByOfficeData(branch, site);
		
		
		return reportByOfficeBeans;
		
	}
	
	
	
}
