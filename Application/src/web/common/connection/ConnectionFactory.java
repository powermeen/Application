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
		basicDataSource.setUsername("sa");
		basicDataSource.setPassword("sa");
		jdbcTemplate = new JdbcTemplate(basicDataSource);
		return jdbcTemplate;
	}
	
	protected JdbcTemplate getJdbcTemplateFromMySQLConnection(){
		BasicDataSource basicDataSource = new BasicDataSource();
		
		
		basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/snow");
		basicDataSource.setUsername("sa");
		basicDataSource.setPassword("sa");
		jdbcTemplate = new JdbcTemplate(basicDataSource);
		return jdbcTemplate;
	}
	


	
}
