package web.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.shared.LoginBean;

public class LoginBeanRowMapper implements RowMapper<LoginBean>{

	@Override
	public LoginBean mapRow(ResultSet resultSet, int arg1) throws SQLException {

		LoginBean loginBean = new LoginBean();
		
		String userName = resultSet.getString(loginBean.USERNAME);
		String password = resultSet.getString(loginBean.PASSWORD);
		
		loginBean.setUserName(userName);
		loginBean.setPassword(password);
		
		
		
		return loginBean;
	}

}
