package web.dao.server.createloginstep;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import web.dao.mapper.GroupRowMapper;
import web.dao.mapper.SetupRowMapper;
import web.shared.GroupBean;
import web.shared.SetupBean;
import web.sql.CreateLoginStepQuery;

public class CreateLoginStepJDBCTemplate implements CreateLoginStepDao {

	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;

	private CreateLoginStepQuery createLoginStepQuery = new CreateLoginStepQuery();

	@Override
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);

	}

	@Override
	public List<SetupBean> getStepByReference(SetupBean setupBean) throws IllegalArgumentException {

		Object[] objects = new Object[1];
		objects[0] = setupBean.getReference();
		String query = createLoginStepQuery.getStepByReference();

		List<SetupBean> setupBeans = new ArrayList<>();
		setupBeans = jdbcTemplate.query(query, objects, new SetupRowMapper());

		return setupBeans;
	}

	@Override
	public List<GroupBean> getGroupReference() throws IllegalArgumentException {

		String query = createLoginStepQuery.getGroupReference();
		List<GroupBean> groupBeans = new ArrayList<>();
		groupBeans = jdbcTemplate.query(query, new GroupRowMapper());
		
		return groupBeans;
	}

}
