package web.dao.server.login;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import web.dao.mapper.LoginBeanRowMapper;
import web.shared.LoginBean;
import web.sql.LoginQuery;

public class LoginJDBCTemplate implements LoginDao{

	
	
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	private LoginQuery loginQuery = new LoginQuery();
	
	@Override
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException {
		
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
		
	}


	@SuppressWarnings("unchecked")
	public boolean authentication(LoginBean loginBean) {
		Object[] objects = new Object[2];
		objects[0] = loginBean.getUserName();
		objects[1] = loginBean.getPassword();
		String query = loginQuery.getAuthenticationQuery();
		
		List<LoginBean> loginBeans = new ArrayList<LoginBean>();
		loginBeans = jdbcTemplate.query(query, objects, new LoginBeanRowMapper());
		System.out.println("Found item is >> "+loginBeans.size());
		
		if(!loginBeans.isEmpty()){
			return true;
		}
		
		return false;
	}

}
