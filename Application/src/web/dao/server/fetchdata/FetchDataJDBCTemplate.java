package web.dao.server.fetchdata;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import web.database.Connection;

public class FetchDataJDBCTemplate extends Connection implements FetchDataDao {

	
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException {
//		this.dataSource = dataSource;
//		jdbcTemplate = new JdbcTemplate(dataSource);
//		System.out.println("ds5");
		
	}
	
	
	public void checkConnect(){
		jdbcTemplate = super.getJDBCConnectHQSQL();
		
		System.out.println("test"+jdbcTemplate);
	}

}
