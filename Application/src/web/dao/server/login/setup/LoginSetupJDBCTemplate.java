package web.dao.server.login.setup;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import web.shared.LoginBean;
import web.shared.OfficeBean;
import web.sql.LoginSetupQuery;

public class LoginSetupJDBCTemplate implements LoginSetupDao{

	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;
	
	private LoginSetupQuery loginSetupQuery  = new LoginSetupQuery();

	@Override
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException {
		
		this.dataSource = dataSource;
		
		jdbcTemplate = new JdbcTemplate(dataSource);
		
	}

	@Override
	public void getOfficeList() throws IllegalArgumentException {


		List<OfficeBean> officeBeans = new ArrayList<OfficeBean>();
		
	}
}
