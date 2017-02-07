package web.dao.server.listboxdata;

import java.util.Map;

import javax.sql.DataSource;

public interface ListBoxDataDao {

	
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException;
	
	public Map<String, String> getWidgetsIdByModule(String module)throws IllegalArgumentException;
}
