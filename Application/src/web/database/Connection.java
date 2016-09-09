package web.database;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import web.comstant.SpringNameBean;

public abstract class Connection {

	private DataSource dataSourceMSSQL;
	private DataSource dataSourceHQSQL;

	

	protected JdbcTemplate getJDBCConnectMSSQL() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSourceMSSQL);
		return jdbcTemplate;

	}

	protected JdbcTemplate getJDBCConnectHQSQL() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSourceHQSQL);
		return jdbcTemplate;
	}

}
