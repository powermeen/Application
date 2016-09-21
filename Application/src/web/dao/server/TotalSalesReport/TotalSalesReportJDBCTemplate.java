package web.dao.server.TotalSalesReport;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import web.dao.mapper.TotalSalesReportMapper;
import web.shared.TotalSalesReportBean;
import web.sql.TotalSalesReportQuery;

public class TotalSalesReportJDBCTemplate implements TotalSalesReportDao {

	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;

	private TotalSalesReportQuery totalSalesReportQuery = new TotalSalesReportQuery();

	@Override
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException {

		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);

	}

	
	@Override
	public List<TotalSalesReportBean> fetchDataTotalSalesRepByBranch(String branch) {
		
		String query = totalSalesReportQuery.getTotalSalesReportAllSideQuery();
		
		Object[] objects = new Object[1];
		objects[0] = branch;
		
		List<TotalSalesReportBean> totalSalesReportBeans = new ArrayList<TotalSalesReportBean>();
		
		totalSalesReportBeans = jdbcTemplate.query(query, objects, new TotalSalesReportMapper());
		System.out.println("Found item is >> "+totalSalesReportBeans.size());
		
		return totalSalesReportBeans;
	}

}
