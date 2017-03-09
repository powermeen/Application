package web.dao.server.creategroup;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import web.common.connection.ConnectionFactory;
import web.common.util.DaoStatus;
import web.dao.mapper.GroupRowMapper;
import web.shared.GroupBean;
import web.sql.CreateGroupQuery;

public class CreateGroupJDBCTemplate extends ConnectionFactory implements CreateGroupDao {

	private JdbcTemplate jdbcTemplate;

	private CreateGroupQuery createGroupQuery = new CreateGroupQuery();

	public CreateGroupJDBCTemplate() {
		jdbcTemplate = super.getJdbcTemplateFromMySQLConnection();
	}
	
	@Override
	public List<GroupBean> getAllGroup() {
		String query = createGroupQuery.getAllGroup();
		List<GroupBean> groupBeans = new ArrayList<>();
		groupBeans = jdbcTemplate.query(query, new GroupRowMapper());
		return groupBeans;
	}

	@Override
	public boolean addGroup(GroupBean groupBean) {

		Object[] objects = new Object[2];
		objects[0] = groupBean.getName();
		objects[1] = groupBean.getModule();

		String query = createGroupQuery.addGroup();
		int status = jdbcTemplate.update(query, objects);
		
		return DaoStatus.isCheckTransectionsStatus(status);
	}

	@Override
	public boolean updateGroup(GroupBean groupBean) {

		int status = 0 ; 
		
		 boolean  success = updateGroupInStep(groupBean);
		
		Object[] objects = new Object[2];
		objects[0] = groupBean.getName();
		objects[1] = groupBean.getId();
		
		String query = createGroupQuery.updateGroup();

		status = jdbcTemplate.update(query, objects);
		
		return DaoStatus.isCheckTransectionsStatus(status);
		

	}

	@Override
	public boolean deleteGroup(GroupBean groupBean) {
		
		Object[] objects = new Object[1];
		objects[0] = groupBean.getId();
		String query = createGroupQuery.deleteGroupById();
		int status = jdbcTemplate.update(query, objects);
		
		return DaoStatus.isCheckTransectionsStatus(status);
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
	

	
	private boolean updateGroupInStep(GroupBean groupBean){
		String id = groupBean.getId();
		
		String oldGroup = getGroupById(id);
		String newGroup = groupBean.getName();
		
		Object[] objects = new Object[2];
		objects[0] = newGroup;
		objects[1] = oldGroup;
		String query = createGroupQuery.updateGroupInStep();
		
		int status = jdbcTemplate.update(query, objects);
		return DaoStatus.isCheckTransectionsStatus(status);
		
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
