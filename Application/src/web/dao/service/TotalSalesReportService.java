package web.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.comstant.SpringNameBean;
import web.dao.server.total.sales.report.TotalSalesReportJDBCTemplate;
import web.shared.TotalSalesReportBean;

public class TotalSalesReportService {

	
	@Autowired
	TotalSalesReportJDBCTemplate totalSalesReportJDBCTemplate ;
	
	public TotalSalesReportService() {
		ApplicationContext context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);

		totalSalesReportJDBCTemplate = (TotalSalesReportJDBCTemplate) context.getBean(SpringNameBean.TOTAL_SALES_REPORT);
	}
	
	public List<TotalSalesReportBean>  getDataByBranch(String branch){
		
		List<TotalSalesReportBean> totalSalesReportBeans = totalSalesReportJDBCTemplate.getDataByBranch(branch);
		
		return totalSalesReportBeans;
	}
}
