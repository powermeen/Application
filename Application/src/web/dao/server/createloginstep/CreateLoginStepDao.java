package web.dao.server.createloginstep;

import java.util.List;

import javax.sql.DataSource;

import web.shared.GroupBean;
import web.shared.LoginSetupBean;
import web.shared.SetupBean;

public interface CreateLoginStepDao {

	public List<SetupBean> getStepByReference(SetupBean setupBean) throws IllegalArgumentException;
	
	public List<GroupBean> getGroupReference ()  throws IllegalArgumentException;
	
	public int addLoginStep(SetupBean setupBean) throws IllegalArgumentException;
	
	public int updateLoginStep(SetupBean setupBean) throws IllegalArgumentException;
	
	public int deleteLoginStep(SetupBean setupBean) throws IllegalArgumentException;
}
