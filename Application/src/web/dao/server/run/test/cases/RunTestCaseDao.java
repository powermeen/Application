package web.dao.server.run.test.cases;

import java.util.List;

import javax.sql.DataSource;

import web.shared.GroupBean;
import web.shared.SetupBean;

public interface RunTestCaseDao {

	public void setDataSource(DataSource dataSource) throws IllegalArgumentException;

	public List<GroupBean> getAllGroup() throws IllegalArgumentException;
	
	public void runTestCase(GroupBean groupBean) throws IllegalArgumentException;
	
	public List<SetupBean> getLoginSetupByReference(String name) throws IllegalArgumentException;
}
