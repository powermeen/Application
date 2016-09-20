package selenium.function;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import selenium.common.BuildUrl;
import selenium.common.WebDriverChrome;
import selenium.common.constant.SeleniumConstant;

public class LoginSelenium {

	private WebDriver driver = null;
	
	private BuildUrl buildUrl = new  BuildUrl(SeleniumConstant.OPTION_LOCAL);
	
	WebDriverChrome driverChrome = new WebDriverChrome();
	
	
	
	@Test
	public void loadIndexPage() {
		
		driver = driverChrome.getWedDriver();
		
		String undexUrl = buildUrl.getIndexUrl();
		
		driver.get(undexUrl);
		
		
		
		
	}
	
	@Test
	public void loadLoginPage(){
		
	}
}
