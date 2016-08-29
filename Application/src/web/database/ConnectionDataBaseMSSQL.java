package web.database;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionDataBaseMSSQL {
	

	private static ApplicationContext  context = new ClassPathXmlApplicationContext("Spring-Module.xml");
	
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	
	
	public static ApplicationContext getApplicationContext (){
		
		return context;
		
	}
	
	protected JdbcTemplate getJDBCTemplate() {
		
		jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate;
	}
}