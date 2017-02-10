package web.dao.server.login.setup;

import java.util.Map;

import javax.sql.DataSource;

import web.shared.LoginSetupBean;

public interface LoginSetupDao {

	public Map<String,String> getOfficeList() throws IllegalArgumentException;
	
	public Map<String,String> getEnvironmentList() throws IllegalArgumentException;
	
	public LoginSetupBean saveLoginSetupForm(LoginSetupBean loginSetupBean) throws IllegalArgumentException;
}
