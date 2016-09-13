package web.database;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public interface ConnectionDB {

	
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException;
	
	public JdbcTemplate getJdbcTemplate ();
	
	
}
