package web.dao.server.listboxdata;

import java.util.Map;

import javax.sql.DataSource;

public interface ListBoxDataDao {

	
	
	public Map<String, String> getWidgetsIdByModule(String module)throws IllegalArgumentException;
}
