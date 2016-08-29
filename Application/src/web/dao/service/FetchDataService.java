package web.dao.service;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import web.database.ConnectionDataBaseMSSQL;

@Service
public class FetchDataService extends ConnectionDataBaseMSSQL{

	public FetchDataService() {

		ApplicationContext context =  (ApplicationContext) super.getApplicationContext();
		context.getBean("fetchData");
	}
}
