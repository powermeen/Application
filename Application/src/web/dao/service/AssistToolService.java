package web.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.common.util.SpringContextUtils;
import web.comstant.SpringNameBean;
import web.dao.server.assist.tool.AssistToolJDBCTemplate;
import web.dao.server.creategroup.CreateGroupJDBCTemplate;
import web.dao.server.listboxdata.ListBoxDataJDBCTemplate;

public class AssistToolService {
	
	@Autowired
	AssistToolJDBCTemplate jdbcTemplate;
	
	public AssistToolService() {
		ApplicationContext context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);

		jdbcTemplate = (AssistToolJDBCTemplate) context.getBean(SpringNameBean.ASSIST_TOOL);
	}
	
	public String generateFileNumber(){
		
		String fileNumber = jdbcTemplate.generateFileNumber();
		
		String lastFileNumber = generateLastFileNumber(fileNumber);
		addNewFileNumber(lastFileNumber);
		 fileNumber = "MEEN"+lastFileNumber;
		return fileNumber;
		
	}
	
	private String generateLastFileNumber(String number) {
		int newNumber = Integer.valueOf(number);
		newNumber = newNumber +1;
		
		String lastfile = String.valueOf(newNumber);
		while (lastfile.length() < 6) {
			lastfile = "0"+lastfile;
			
		}
		return lastfile;
	}
	
	
	private void addNewFileNumber(String lastFileNumber) {
		
		jdbcTemplate.addNewFileNumber(lastFileNumber);
		
		
	}


}
