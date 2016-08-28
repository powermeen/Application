package web.dao.server;

import javax.sql.DataSource;

public interface FetchDataDao {
	
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException;

}
