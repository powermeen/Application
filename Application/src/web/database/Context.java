package web.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.comstant.SpringNameBean;

public class Context {

	ApplicationContext context = null;

	protected ApplicationContext getContext() {

		if (context == null) {
			
		}
		return context;
	}

}
