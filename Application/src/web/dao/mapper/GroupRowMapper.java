package web.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.shared.GroupBean;

public class GroupRowMapper implements RowMapper<GroupBean>{

	@Override
	public GroupBean mapRow(ResultSet resultSet, int arg1) throws SQLException {
		GroupBean groupBean = new GroupBean();
		
		String id = resultSet.getString("id");
		String name = resultSet.getString("name");
		String status = resultSet.getString("status");
		
		
		groupBean.setId(id);
		groupBean.setName(name);
		groupBean.setStatus(status);
		
		return groupBean;
	}

}
