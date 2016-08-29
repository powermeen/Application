package web.database;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionDataBaseMSSQL {
	
	private ApplicationContext context ; 
	
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	
	
	protected ApplicationContext getApplicationContext (){
		
		if(context == null ){
			 context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		}
		
		return context;
		
	}
	
	protected JdbcTemplate getJDBCTemplate() {
		
		jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate;
	}
}
