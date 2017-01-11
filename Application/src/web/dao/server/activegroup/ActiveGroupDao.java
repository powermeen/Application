package web.dao.server.activegroup;

import java.util.List;

import javax.sql.DataSource;

import web.shared.GroupBean;

public interface ActiveGroupDao {

	public void setDataSource(DataSource dataSource) throws IllegalArgumentException;

	public List<GroupBean> getAllGroup() throws IllegalArgumentException;
}
