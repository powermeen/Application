package web.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.shared.OfficeBean;

public class OfficeRowmapper implements RowMapper<OfficeBean>{

	@Override
	public OfficeBean mapRow(ResultSet resultSet, int arg1) throws SQLException {
		OfficeBean officeBean = new OfficeBean();
		
		String code = resultSet.getString("code");
		String name = resultSet.getString("name");
		
		
		officeBean.setCode(code);
		officeBean.setName(name);
		
		
		return officeBean;

	}

}
