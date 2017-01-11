package web.dao.server.activegroup;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import web.dao.mapper.GroupRowMapper;
import web.shared.GroupBean;
import web.sql.ActiveGroupQuery;

public class ActiveGroupJDBCTemplate implements ActiveGroupDao{

	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;
	
	private ActiveGroupQuery activeGroupQuery = new ActiveGroupQuery();

	
	@Override
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
		
	}

	@Override
	public List<GroupBean> getAllGroup() throws IllegalArgumentException {
		
		String query = activeGroupQuery.getAllGroup();
		List<GroupBean> groupBeans = new ArrayList<>();
		groupBeans = jdbcTemplate.query(query, new GroupRowMapper());
		return groupBeans;
	}

	public int changeStatus(GroupBean groupBean) {
		
		Object[] objects = new Object[2];
		objects[0] = groupBean.getStatus();
		objects[1] = groupBean.getId();
		
		String query = activeGroupQuery.changeStatus();
		
		int success = jdbcTemplate.update(query, objects);
		return 0;
	}

}
