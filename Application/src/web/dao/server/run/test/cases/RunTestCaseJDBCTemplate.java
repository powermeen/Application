package web.dao.server.run.test.cases;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.google.common.base.Objects;

import web.common.connection.ConnectionFactory;
import web.dao.mapper.EnvironmentRowmapper;
import web.dao.mapper.GroupRowMapper;
import web.dao.mapper.SetupRowMapper;
import web.shared.EnvironmentBean;
import web.shared.GroupBean;
import web.shared.SetupBean;
import web.sql.RunTestCaseQuery;

public class RunTestCaseJDBCTemplate extends ConnectionFactory implements RunTestCaseDao {

	private JdbcTemplate jdbcTemplate;

	private RunTestCaseQuery runTestCaseQuery = new RunTestCaseQuery();


	public RunTestCaseJDBCTemplate() {
		jdbcTemplate = super.getJdbcTemplateFromHSQLConnection();
	}
	@Override
	public List<GroupBean> getAllGroup() throws IllegalArgumentException {
		String query = runTestCaseQuery.getAllGroup();
		List<GroupBean> groupBeans = new ArrayList<>();
		groupBeans = jdbcTemplate.query(query, new GroupRowMapper());
		return groupBeans;
	}

	@Override
	public void runTestCase(GroupBean groupBean) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<SetupBean> getLoginSetupByReference(String name) {

		Object[] objects = new Object[1];
		objects[0] = name;
		String query = runTestCaseQuery.getLoginSetupByReference();

		List<SetupBean> setupBeans = new ArrayList<>();

		setupBeans = jdbcTemplate.query(query, objects, new SetupRowMapper());
		return setupBeans;
	}

	public List<EnvironmentBean> genEnvironmentActive() {

		String query = runTestCaseQuery.genEnvironmentActive();
		List<EnvironmentBean> environmentBeans = new ArrayList<>();
		environmentBeans = jdbcTemplate.query(query, new EnvironmentRowmapper());
		return environmentBeans;
	}

}
