package web.dao.server.creategroup;

import java.util.List;

import javax.sql.DataSource;

import web.shared.GroupBean;

public interface CreateGroupDao {

	
	public List<GroupBean> getAllGroup()throws IllegalArgumentException;
	
	public boolean addGroup(GroupBean groupBean)throws IllegalArgumentException;
	
	public boolean updateGroup(GroupBean groupBean)throws IllegalArgumentException;
	
	public boolean deleteGroup(GroupBean groupBean)throws IllegalArgumentException;
}
