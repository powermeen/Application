package selenium.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.common.constant.SeleniumConstant;

public abstract class WebDriverChrome implements WebDriverMain {

	WebDriver driver = null;

	@Override
	public WebDriver getWedDriver() {
		String webDriver = SeleniumConstant.WEB_DRIVER;
		String webDriverPath = SeleniumConstant.WEB_DRIVER_PATH;
		System.setProperty(webDriver, webDriverPath);
		driver = new ChromeDriver();
		System.out.println("getWedDriver");
		driver.manage().window().maximize();

		return driver;
	}

	@Override
	public void close() {

		try {
			Thread.sleep(2000);
			driver.close();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
