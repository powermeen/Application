package web.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.shared.UserBean;

public class UserBeanRowMapper implements RowMapper {

	@Override
	public UserBean mapRow(ResultSet resultSet, int arg1) throws SQLException {

		UserBean userBean = new UserBean();

		userBean.setUserId(resultSet.getString(userBean.USER_ID));
		userBean.setUserName(resultSet.getString(userBean.USER_NAME));
		userBean.setPassword(resultSet.getString(userBean.PASSWORD));
		userBean.setUserRole(resultSet.getString(userBean.USER_ROLE));

		return userBean;
	}

}
