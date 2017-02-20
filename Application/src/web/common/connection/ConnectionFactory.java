package web.common.connection;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import web.comstant.SpringNameBean;

public class ConnectionFactory {

	private JdbcTemplate jdbcTemplate;
	
	

	



	protected JdbcTemplate getJdbcTemplateFromHSQLConnection() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("org.hsqldb.jdbcDriver");
		basicDataSource.setUrl("jdbc:hsqldb:hsql://localhost/");
		basicDataSource.setUsername("SA");
		basicDataSource.setPassword("");
		jdbcTemplate = new JdbcTemplate(basicDataSource);
		return jdbcTemplate;
	}
	


	
}
