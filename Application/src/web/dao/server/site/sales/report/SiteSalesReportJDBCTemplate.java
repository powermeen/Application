package web.dao.server.site.sales.report;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import web.dao.mapper.SiteSalesReportRowMapper;
import web.shared.SiteSalesReportBean;
import web.sql.SiteSalesReportQuery;

public class SiteSalesReportJDBCTemplate implements SiteSalesReportDao {

	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;
	
	private SiteSalesReportQuery siteSalesReportQuery= new SiteSalesReportQuery();
	
	@Override
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException {

		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
		
	}
	
	@Override
	public List<SiteSalesReportBean> getDataBySite(String branch,String site){
		String query = siteSalesReportQuery.getSiteSalesReportBySite();
		
		Object[] objects = new Object[2];
		objects[0] = branch;
		objects[1] = site;
		List<SiteSalesReportBean> siteSalesReportBeans = new ArrayList<SiteSalesReportBean>();
		siteSalesReportBeans = jdbcTemplate.query(query, objects, new SiteSalesReportRowMapper());
		
		return siteSalesReportBeans;
		
	}

}
