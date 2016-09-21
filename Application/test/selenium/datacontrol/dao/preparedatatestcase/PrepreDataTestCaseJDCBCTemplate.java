package selenium.datacontrol.dao.preparedatatestcase;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import selenium.datacontrol.mapper.PrepareDataTestCaseRowmapper;
import selenium.datacontrol.shared.PrepareTestDataBean;
import selenium.datacontrol.sql.PrepareTestDataQuery;

public class PrepreDataTestCaseJDCBCTemplate implements PrepareDataTestCaseDao{

	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;
	
	private PrepareTestDataQuery testDataQuery = new PrepareTestDataQuery();

	@Override
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException {
		
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
		
	}

	@Override
	public List<PrepareTestDataBean> getPrepareDataTestCaseByTestCase(String testCase) throws IllegalArgumentException {

		String query = testDataQuery.getPrepareTestDataByTestCase(testCase);
		Object[] objects = new Object[1];
		objects[0] = testCase;
		
		List<PrepareTestDataBean> prepareTestDataBeans = new ArrayList<PrepareTestDataBean>();
		prepareTestDataBeans = jdbcTemplate.query(query, objects, new PrepareDataTestCaseRowmapper());
		
		return prepareTestDataBeans;
	}
	
}
