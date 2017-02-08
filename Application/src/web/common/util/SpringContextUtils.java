package web.common.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.comstant.SpringNameBean;

public class SpringContextUtils {

	private ApplicationContext context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);
	
	public Object getBeanFromContext(String beanName ){
		
		Object object = context.getBean(beanName);
		
		return object;
		
	}
	
}
