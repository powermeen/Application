package web.dao.server.login;

import javax.sql.DataSource;

import web.shared.LoginBean;

public interface LoginDao {

	
	
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException;
	
	public boolean authentication(LoginBean loginBean)throws IllegalArgumentException;
}
