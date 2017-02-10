package web.dao.server.activegroup;

import java.util.List;

import javax.sql.DataSource;

import web.shared.GroupBean;

public interface ActiveGroupDao {

	public List<GroupBean> getAllGroup() throws IllegalArgumentException;
	
	public int changeStatus(GroupBean groupBean)throws IllegalArgumentException;
}
