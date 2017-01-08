package web.dao.server.creategroup;

import java.util.List;

import javax.sql.DataSource;

import web.shared.GroupBean;

public interface CreateGroupDao {

	
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException;
	
	public List<GroupBean> getAllGroup()throws IllegalArgumentException;
	
	public int addGroup(GroupBean groupBean)throws IllegalArgumentException;
	
	public void updateGroup(GroupBean groupBean)throws IllegalArgumentException;
}
