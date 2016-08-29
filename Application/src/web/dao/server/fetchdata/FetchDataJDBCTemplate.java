package web.dao.server.fetchdata;

import javax.sql.DataSource;

public class FetchDataJDBCTemplate implements FetchDataDao{

	
	private DataSource dataSource;
	
	
	@Override
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException {
		this.dataSource = dataSource;
		
	}

}
