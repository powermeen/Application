package test.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.Test;
import junit.framework.TestSuite;
import test.junit.LoginJunit;


@RunWith(Suite.class)
@SuiteClasses({ LoginJunit.class })
public class AllTests {
	
	

	

}
