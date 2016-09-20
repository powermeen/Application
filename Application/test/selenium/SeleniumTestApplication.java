package selenium;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import selenium.function.LoginSelenium;

@RunWith(Suite.class)
@SuiteClasses({ LoginSelenium.class })
public class SeleniumTestApplication {




}
