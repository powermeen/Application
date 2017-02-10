package web.dao.server.login;

import javax.sql.DataSource;

import web.shared.LoginSetupBean;

public interface LoginDao {

	public boolean authentication(LoginSetupBean loginSetupBean)throws IllegalArgumentException;
}
