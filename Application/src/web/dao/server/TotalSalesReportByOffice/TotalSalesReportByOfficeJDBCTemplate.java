package web.dao.server.TotalSalesReportByOffice;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import web.dao.mapper.TotalSalesReportByOfficeRowMapper;
import web.dao.mapper.TotalSalesReportMapper;
import web.shared.TotalSalesReportBean;
import web.shared.TotalSalesReportByOfficeBean;
import web.sql.TotalSalesReportByOfficeQuery;

public class TotalSalesReportByOfficeJDBCTemplate implements TotalSalesReportByOfficeDao {

	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;
	
	private TotalSalesReportByOfficeQuery reportByOfficeQuery= new TotalSalesReportByOfficeQuery();
	
	@Override
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException {

		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
		
	}
	
	public List<TotalSalesReportByOfficeBean> fetchTotalSalesReportByOfficeData(String branch,String site){
		String query = reportByOfficeQuery.getTotalSalesReportByOffice();
		
		Object[] objects = new Object[2];
		objects[0] = branch;
		objects[1] = site;
		List<TotalSalesReportByOfficeBean> totalSalesReportBeans = new ArrayList<TotalSalesReportByOfficeBean>();
		totalSalesReportBeans = jdbcTemplate.query(query, objects, new TotalSalesReportByOfficeRowMapper());
		
		System.out.println("Found item is >> "+totalSalesReportBeans.size());
		return totalSalesReportBeans;
		
	}

}
