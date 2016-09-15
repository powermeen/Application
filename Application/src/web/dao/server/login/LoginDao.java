package web.dao.server.login;

import javax.sql.DataSource;

public interface LoginDao {

	
	
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException;
}
