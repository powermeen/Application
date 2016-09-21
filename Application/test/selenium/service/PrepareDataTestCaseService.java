package selenium.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import selenium.common.constant.SpringNameBean;
import selenium.datacontrol.dao.preparedatatestcase.PrepreDataTestCaseJDCBCTemplate;
import selenium.datacontrol.shared.PrepareTestDataBean;

public class PrepareDataTestCaseService {
	
	@Autowired
	PrepreDataTestCaseJDCBCTemplate jdcbcTemplate;

	public PrepareDataTestCaseService() {
		ApplicationContext context = new ClassPathXmlApplicationContext(SpringNameBean.SPRING_MODULE_XML);
		jdcbcTemplate = (PrepreDataTestCaseJDCBCTemplate) context.getBean(SpringNameBean.PREPARE_DATA_TEST);
	}
	
	public List<PrepareTestDataBean> getPrepareDataTestCaseByTestCase(String testCase){
		List<PrepareTestDataBean> beans = new ArrayList<PrepareTestDataBean>();
		
		beans = jdcbcTemplate.getPrepareDataTestCaseByTestCase(testCase);
		return beans;
		
	}
}
