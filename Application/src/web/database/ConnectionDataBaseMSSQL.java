package web.database;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import web.comstant.SpringNameBean;

public class ConnectionDataBaseMSSQL {
	

	private static ApplicationContext  context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);
	
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
