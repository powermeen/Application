package web.dao.server.fetchdata;

import javax.sql.DataSource;

public interface FetchDao {

	
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException;
}
