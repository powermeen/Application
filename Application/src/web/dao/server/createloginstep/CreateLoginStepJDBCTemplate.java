package web.dao.server.createloginstep;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import web.dao.mapper.GroupRowMapper;
import web.dao.mapper.SetupRowMapper;
import web.dao.service.connection.ConnectionFactory;
import web.shared.GroupBean;
import web.shared.SetupBean;
import web.sql.CreateLoginStepQuery;

public class CreateLoginStepJDBCTemplate extends ConnectionFactory implements CreateLoginStepDao {

	private JdbcTemplate jdbcTemplate;

	private CreateLoginStepQuery createLoginStepQuery = new CreateLoginStepQuery();

	public CreateLoginStepJDBCTemplate() {
		jdbcTemplate = super.getJdbcTemplateFromHSQLConnection();
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

	@Override
	public int addLoginStep(SetupBean setupBean) {
		Object[] objects = new Object[6];
		objects[0] = setupBean.getWidgetId();
		objects[1] = setupBean.getWidgetName();
		objects[2] = setupBean.getData();
		objects[3] = setupBean.getActionType();
		objects[4] = setupBean.getSequence();
		objects[5] = setupBean.getReference();
		String query = createLoginStepQuery.addLoginStep();
		int success = jdbcTemplate.update(query, objects);

		return 0;
	}

	@Override
	public int updateLoginStep(SetupBean setupBean) {

		Object[] objects = new Object[7];
		objects[0] = setupBean.getWidgetId();
		objects[1] = setupBean.getWidgetName();
		objects[2] = setupBean.getData();
		objects[3] = setupBean.getActionType();
		objects[4] = setupBean.getSequence();
		objects[5] = setupBean.getReference();
		objects[6] = setupBean.getSetupId();
				
		String query = createLoginStepQuery.updateLoginStep();
		int success = jdbcTemplate.update(query, objects);
		return 0;
	}

	@Override
	public int deleteLoginStep(SetupBean setupBean) throws IllegalArgumentException {
		Object[] objects = new Object[1];
		objects[0] = setupBean.getSetupId();
				
		String query = createLoginStepQuery.deleteLoginStep();
		int success = jdbcTemplate.update(query, objects);
		return 0;
	}

}
