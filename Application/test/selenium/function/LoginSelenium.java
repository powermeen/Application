package selenium.function;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import selenium.common.BuildUrl;
import selenium.common.WebDriverChrome;
import selenium.common.constant.SeleniumConstant;

public class LoginSelenium extends WebDriverChrome {

	private WebDriver driver = null;

	private BuildUrl buildUrl = new BuildUrl(SeleniumConstant.OPTION_LOCAL);

	@Test

	public void loadIndexPage() {

		driver = super.getWedDriver();

		String indexUrl = buildUrl.getIndexUrl();

		driver.get(indexUrl);

		super.close();

	}

	@Test
	public void loadLoginPage() {

		driver = super.getWedDriver();

		String loginUrl = buildUrl.getLoginUrl();

		driver.get(loginUrl);

		WebElement webElement = driver.findElement(By.id("loginForm"));

		String loginFormLabel = webElement.getText();

		Assert.assertEquals("Login Form", loginFormLabel);

		super.close();
	}

	@Test
	public void loginFunctionByCasePass() {

		driver = super.getWedDriver();

		String loginUrl = buildUrl.getLoginUrl();

		driver.get(loginUrl);

		WebElement webElement = driver.findElement(By.id("userName"));

		webElement.sendKeys("meen");

		super.close();

	}
}
