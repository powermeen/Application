package web.dao.server.login.setup;

import javax.sql.DataSource;

public interface LoginSetupDao {

	public void setDataSource(DataSource dataSource) throws IllegalArgumentException;
	
	public void getOfficeList() throws IllegalArgumentException;
}
