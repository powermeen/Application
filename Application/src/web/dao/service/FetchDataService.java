package web.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.comstant.SpringNameBean;
import web.dao.server.fetchdata.FetchDataJDBCTemplate;

public class FetchDataService {

	@Autowired
	FetchDataJDBCTemplate fetchDataJDBCTemplate;

	public FetchDataService() {

		ApplicationContext context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);

		fetchDataJDBCTemplate = (FetchDataJDBCTemplate) context.getBean(SpringNameBean.FETCH_DATA);
		fetchDataJDBCTemplate.selectSomething();
	}

	public void selectTesting() {

		if (fetchDataJDBCTemplate == null) {
			System.out.println("fetchDataJDBCTemplate null ");
		} else {
			System.out.println("fetchDataJDBCTemplate not null ");
		}

		// fetchDataJDBCTemplate.selectSomething ();
	}
}
