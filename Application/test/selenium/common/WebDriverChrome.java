package selenium.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.common.constant.SeleniumConstant;

public class WebDriverChrome implements WebDriverMain {

	
	public WebDriverChrome() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public WebDriver getWedDriver() {
		String webDriver = SeleniumConstant.WEB_DRIVER;
		String webDriverPath = SeleniumConstant.WEB_DRIVER_PATH;
		System.setProperty(webDriver, webDriverPath);
		WebDriver driver = new ChromeDriver();
		System.out.println("getWedDriver");
		driver.manage().window().maximize();

		return driver;
	}

}
