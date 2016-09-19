package web.dao.server.fetchdata;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import web.dao.mapper.PeriodRowMapper;
import web.dao.mapper.UserBeanRowMapper;
import web.shared.PeriodBean;
import web.shared.UserBean;
import web.sql.FetchData;

@SuppressWarnings("unchecked")
public class FetchDataJDBCTemplate  implements FetchDao{

	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void setDataSource(DataSource dataSource) throws IllegalArgumentException {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
		
	}


	
	public void selectSomething() {
		String query = FetchData.TEST_FETCH_DATA;
		List<PeriodBean> periodBeans = new ArrayList<PeriodBean>();
		Object[] objects = new Object[1];
		objects[0]= "1";
		periodBeans = jdbcTemplate.query(query, objects, new PeriodRowMapper());
		int size = periodBeans.size();
		System.out.println(size);
		
		
	}



	
	
	
	
	
	

}
