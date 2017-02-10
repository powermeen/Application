package web.dao.server.creategroup;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import web.dao.mapper.GroupRowMapper;
import web.dao.service.connection.ConnectionFactory;
import web.shared.GroupBean;
import web.sql.CreateGroupQuery;

public class CreateGroupJDBCTemplate extends ConnectionFactory implements CreateGroupDao {

	private JdbcTemplate jdbcTemplate;

	private CreateGroupQuery createGroupQuery = new CreateGroupQuery();

	public CreateGroupJDBCTemplate() {
		jdbcTemplate = super.getJdbcTemplateFromHSQLConnection();
	}
	
	@Override
	public List<GroupBean> getAllGroup() {
		String query = createGroupQuery.getAllGroup();
		List<GroupBean> groupBeans = new ArrayList<>();
		groupBeans = jdbcTemplate.query(query, new GroupRowMapper());
		return groupBeans;
	}

	@Override
	public int addGroup(GroupBean groupBean) {

		Object[] objects = new Object[2];
		objects[0] = groupBean.getName();
		objects[1] = groupBean.getModule();

		String query = createGroupQuery.addGroup();
		int success = jdbcTemplate.update(query, objects);
		return 0;
	}

	@Override
	public void updateGroup(GroupBean groupBean) {

		
		
		int succress = updateGroupInStep(groupBean);
		
		Object[] objects = new Object[2];
		objects[0] = groupBean.getName();
		objects[1] = groupBean.getId();
		
		String query = createGroupQuery.updateGroup();

		int success = jdbcTemplate.update(query, objects);

	}

	@Override
	public void deleteGroup(GroupBean groupBean) {
		
		Object[] objects = new Object[1];
		objects[0] = groupBean.getId();
		String query = createGroupQuery.deleteGroupById();
		int success = jdbcTemplate.update(query, objects);
	}

	private String getGroupById(String id) {
		String query = createGroupQuery.getGroupById();
		Object[] objects = new Object[1];
		objects[0] = id;
		List<GroupBean> groupBeans = new ArrayList<>();
		groupBeans = jdbcTemplate.query(query, objects, new GroupRowMapper());

		String group = "";
		if (!groupBeans.isEmpty()) {
			GroupBean groupBean = groupBeans.get(0);
			group = groupBean.getName();
			return group;
		} else {
			return group;
		}

	}
	

	
	private int updateGroupInStep(GroupBean groupBean){
		String id = groupBean.getId();
		
		String oldGroup = getGroupById(id);
		String newGroup = groupBean.getName();
		
		Object[] objects = new Object[2];
		objects[0] = newGroup;
		objects[1] = oldGroup;
		String query = createGroupQuery.updateGroupInStep();
		
		int success = jdbcTemplate.update(query, objects);
		return success;
		
	}

	public GroupBean getGroupByName(GroupBean groupBean) {
		String name = groupBean.getName();
		
		Object[] objects = new Object[1];
		objects[0] = name;
		
		String query = createGroupQuery.getGroupByName();
		
		List<GroupBean> groupBeans = new ArrayList<>();
		groupBeans = jdbcTemplate.query(query, objects, new GroupRowMapper());
		GroupBean bean = null;
		if(!groupBeans.isEmpty()){
			bean = groupBeans.get(0);
		}
		
		return bean;
	}

}
