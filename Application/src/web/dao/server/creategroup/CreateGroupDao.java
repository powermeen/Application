package web.dao.server.creategroup;

import javax.sql.DataSource;

public interface CreateGroupDao {

	
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException;
}
