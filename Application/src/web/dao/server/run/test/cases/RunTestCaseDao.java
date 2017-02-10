package web.dao.server.run.test.cases;

import java.util.List;

import javax.sql.DataSource;

import web.shared.GroupBean;
import web.shared.SetupBean;

public interface RunTestCaseDao {

	public List<GroupBean> getAllGroup() throws IllegalArgumentException;
	
	public void runTestCase(GroupBean groupBean) throws IllegalArgumentException;
	
	public List<SetupBean> getLoginSetupByReference(String name) throws IllegalArgumentException;
}
