package web.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.shared.LoginSetupBean;

public class LoginSetupRowMapper implements RowMapper<LoginSetupBean>{

	@Override
	public LoginSetupBean mapRow(ResultSet resultSet, int arg1) throws SQLException {

		LoginSetupBean loginSetupBean = new LoginSetupBean();
		
		String reference = resultSet.getString("reference");
		String userName = resultSet.getString("userName");
		String password = resultSet.getString("password");
		String office = resultSet.getString("office");
		String environment = resultSet.getString("environment");
		
		loginSetupBean.setReference(reference);
		loginSetupBean.setUserName(userName);
		loginSetupBean.setPassword(password);
		loginSetupBean.setOffice(office);
		loginSetupBean.setEnvironment(environment);
		
		
		return loginSetupBean;
	}

}
