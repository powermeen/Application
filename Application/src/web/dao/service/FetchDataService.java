package web.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import web.comstant.SpringNameBean;
import web.dao.server.fetchdata.FetchDataDao;
import web.dao.server.fetchdata.FetchDataJDBCTemplate;
import web.database.ConnectionDataBaseMSSQL;

@Service
public class FetchDataService {

	
	@Autowired
	FetchDataJDBCTemplate fetchDataJDBCTemplate;
	
	public FetchDataService() {

		ApplicationContext  context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);
		FetchDataJDBCTemplate fetchDataJDBCTemplate = (FetchDataJDBCTemplate)context.getBean(SpringNameBean.FETCH_DATA);
	}
}
