package web.dao.server.run.test.cases;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.google.common.base.Objects;

import web.dao.mapper.GroupRowMapper;
import web.dao.mapper.SetupRowMapper;
import web.shared.GroupBean;
import web.shared.SetupBean;
import web.sql.RunTestCaseQuery;

public class RunTestCaseJDBCTemplate implements RunTestCaseDao{

	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;
	
	private RunTestCaseQuery runTestCaseQuery = new RunTestCaseQuery();
	
	@Override
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);		
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

}
