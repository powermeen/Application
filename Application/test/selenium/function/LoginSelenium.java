package selenium.function;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import selenium.common.BuildUrl;
import selenium.common.WebDriverChrome;
import selenium.common.constant.SeleniumConstant;
import selenium.datacontrol.shared.PrepareTestDataBean;
import selenium.service.PrepareDataTestCaseService;

public class LoginSelenium extends WebDriverChrome {

	private WebDriver driver = null;

	private BuildUrl buildUrl = new BuildUrl(SeleniumConstant.OPTION_STAGING);

	@Test

	public void loadIndexPage() {

		driver = super.getWedDriver();

		String indexUrl = buildUrl.getBaseUrl();

		driver.get(indexUrl);
		
		PrepareDataTestCaseService caseService = new PrepareDataTestCaseService();

		List<PrepareTestDataBean>  login = caseService.getPrepareDataTestCaseByTestCase("login");
		
		
		
		
		
		super.process(login);
		
		
	//	super.close();

	}

//	@Test
//	public void loadLoginPage() {
//
//		driver = super.getWedDriver();
//
//		String loginUrl = buildUrl.getLoginUrl();
//
//		driver.get(loginUrl);
//
//		WebElement webElement = driver.findElement(By.id("loginForm"));
//
//		String loginFormLabel = webElement.getText();
//
//		Assert.assertEquals("Login Form", loginFormLabel);
//
//		super.close();
//	}
//
//	@Test
//	public void loginFunctionByCasePass() {
//
//		driver = super.getWedDriver();
//
//		String loginUrl = buildUrl.getLoginUrl();
//
//		driver.get(loginUrl);
//		
//		PrepareDataTestCaseService caseService = new PrepareDataTestCaseService();
//		
//		List<PrepareTestDataBean>  case_0000001 = caseService.getPrepareDataTestCaseByTestCase("case_0000001");
//		
//		super.process(case_0000001);
//
//
////		super.close();
//		
//		
//		
//		
//		
//
//	}
}
