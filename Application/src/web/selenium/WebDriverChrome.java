package web.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import selenium.datacontrol.shared.PrepareTestDataBean;
import web.common.interfaces.WebDriverMain;
import web.comstant.SeleniumConstant;
import web.shared.SetupBean;

public class WebDriverChrome implements WebDriverMain {

	private WebDriver driver = null;

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
	
	public void waitTime(int time){
		try {
			Thread.sleep(time);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void process(List<SetupBean> setupBeans) {
		
		
		for (SetupBean setupBean : setupBeans) {
			
			String widgetsId = setupBean.getWidgetId();
			
			Boolean isPresent = false;
			
			while (!isPresent) {
				isPresent = driver.findElements(By.id(widgetsId)).size() > 0;
				
				if(isPresent){
					process(setupBean);
					break;
				}else {
					waitTime(1000);
				}
			}
			
		}
		
	}

	private void process(SetupBean setupBean) {
		String widgetsId = setupBean.getWidgetId();
		String widgetData = setupBean.getData();
		String actionType = setupBean.getActionType();
		
		WebElement webElement  = driver.findElement(By.id(widgetsId)) ;
		
		
		
		if(SeleniumConstant.ACTION_TYPE_INPUT.equalsIgnoreCase(actionType)){
			
			webElement.sendKeys(widgetData);
			
		}else if(SeleniumConstant.ACTION_TYPE_CLICK.equalsIgnoreCase(actionType)) {
			
			webElement.click();
			
		}else if (SeleniumConstant.ACTION_TYPE_SELECT.equalsIgnoreCase(actionType)) {
			
			Select select = new Select(webElement);
			select.selectByVisibleText(widgetData);
		}
		
	}

	public WebDriver getDriver() {
		return driver;
	}

}
