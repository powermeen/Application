package web.dao.server.createloginstep;

import java.util.List;

import javax.sql.DataSource;

import web.shared.GroupBean;
import web.shared.LoginSetupBean;
import web.shared.SetupBean;

public interface CreateLoginStepDao {

	public void setDataSource(DataSource dataSource) throws IllegalArgumentException;

	public List<SetupBean> getStepByReference(SetupBean setupBean) throws IllegalArgumentException;
	
	public List<GroupBean> getGroupReference ()  throws IllegalArgumentException;
}
