package web.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import web.dao.server.fetchdata.FetchDataDao;
import web.dao.server.fetchdata.FetchDataJDBCTemplate;
import web.database.ConnectionDataBaseMSSQL;

@Service
public class FetchDataService {

	
	public FetchDataService() {

		ApplicationContext context = ConnectionDataBaseMSSQL.getApplicationContext();
		FetchDataDao fetchDataDao = (FetchDataDao)context.getBean("fetchData");
	}
}
