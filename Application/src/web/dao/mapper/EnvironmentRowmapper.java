package web.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.shared.EnvironmentBean;

public class EnvironmentRowmapper implements RowMapper<EnvironmentBean>{

	@Override
	public EnvironmentBean mapRow(ResultSet resultSet, int arg1) throws SQLException {

		EnvironmentBean environmentBean = new EnvironmentBean();
		
		String code = resultSet.getString("code");
		String name = resultSet.getString("name");
		String url = resultSet.getString("url");
		
		environmentBean.setCode(code);
		environmentBean.setName(name);
		environmentBean.setUrl(url);
		
		return environmentBean;
	}

}
