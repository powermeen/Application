package web.dao.server.creategroup;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import web.dao.mapper.GroupRowMapper;
import web.shared.GroupBean;
import web.sql.CreateGroupQuery;

public class CreateGroupJDBCTemplate implements CreateGroupDao{

	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;
	
	private CreateGroupQuery createGroupQuery = new CreateGroupQuery();
	@Override
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException {
		
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);

		
	}
	public List<GroupBean> getAllGroup() {
		String query = createGroupQuery.getAllGroup();
		List<GroupBean> groupBeans = new ArrayList<>();
		groupBeans = jdbcTemplate.query(query, new GroupRowMapper());
		return groupBeans;
	}
	public int addGroup(GroupBean groupBean) {
		
		Object[] objects = new Object[1];
		objects[0] = groupBean.getName();
		
		String query = createGroupQuery.addGroup();
		int success = jdbcTemplate.update(query, objects);
		 return 0 ;
	}

}
