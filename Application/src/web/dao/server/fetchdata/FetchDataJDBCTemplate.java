package web.dao.server.fetchdata;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class FetchDataJDBCTemplate implements FetchDataDao{

	
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("ds5");
		
	}

}