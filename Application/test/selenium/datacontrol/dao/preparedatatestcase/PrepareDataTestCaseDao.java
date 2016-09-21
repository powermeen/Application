package selenium.datacontrol.dao.preparedatatestcase;

import java.util.List;

import javax.sql.DataSource;

import selenium.datacontrol.shared.PrepareTestDataBean;

public interface PrepareDataTestCaseDao {

	public void setDataSource(DataSource dataSource) throws IllegalArgumentException;
	
	public List<PrepareTestDataBean> getPrepareDataTestCaseByTestCase(String testCase) throws IllegalArgumentException;
}
