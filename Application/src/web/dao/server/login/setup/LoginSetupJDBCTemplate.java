package web.dao.server.login.setup;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import net.sourceforge.htmlunit.corejs.javascript.UniqueTag;
import web.common.connection.ConnectionFactory;
import web.dao.mapper.EnvironmentRowmapper;
import web.dao.mapper.LoginSetupRowMapper;
import web.dao.mapper.OfficeRowmapper;
import web.shared.EnvironmentBean;
import web.shared.LoginSetupBean;
import web.shared.OfficeBean;
import web.sql.LoginSetupQuery;

public class LoginSetupJDBCTemplate extends ConnectionFactory implements LoginSetupDao {

	private JdbcTemplate jdbcTemplate;

	private LoginSetupQuery loginSetupQuery = new LoginSetupQuery();

	public LoginSetupJDBCTemplate() {
		jdbcTemplate = super.getJdbcTemplateFromMySQLConnection();
	}

	@Override
	public Map<String, String> getOfficeList() throws IllegalArgumentException {

		String query = loginSetupQuery.getOfficeListQuery();

		Map<String, String> officeMap = new LinkedHashMap<String, String>();
		List<OfficeBean> officeBeans = jdbcTemplate.query(query, new OfficeRowmapper());

		for (OfficeBean officeBean : officeBeans) {
			String value = officeBean.getCode();
			String displayText = officeBean.getName();
			String code = "[" + value + "] ";
			officeMap.put(value, code + displayText);
		}

		return officeMap;

	}

	@Override
	public Map<String, String> getEnvironmentList() {
		String query = loginSetupQuery.getEnvironmentListQuery();
		Map<String, String> environmentMap = new LinkedHashMap<String, String>();
		List<EnvironmentBean> environmentBeans = jdbcTemplate.query(query, new EnvironmentRowmapper());

		for (EnvironmentBean environmentBean : environmentBeans) {
			String value = environmentBean.getUrl();
			String displayText = environmentBean.getName();

			environmentMap.put(value, displayText);
		}
		return environmentMap;
	}

	@Override
	public LoginSetupBean saveLoginSetupForm(LoginSetupBean loginSetupBean) throws IllegalArgumentException {
		String action = getAction(loginSetupBean);

		return loginSetupBean;
	}

	private String getAction(LoginSetupBean loginSetupBean) {
		String query = loginSetupQuery.getReferenceQuery();
		Object[] objects = new Object[1];
		objects[0] = loginSetupBean.getReference();
		List<LoginSetupBean> loginSetupBeans = jdbcTemplate.query(query, objects, new LoginSetupRowMapper());

		System.out.println(loginSetupBeans.size());

		return null;

	}
}
