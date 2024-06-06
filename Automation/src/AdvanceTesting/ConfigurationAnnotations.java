package AdvanceTesting;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("@beforeSuite", true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("@beforeTest", true);
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("@beforeClass", true);
	}
	
	@BeforeMethod
	public void beforeMethod( ) {
		Reporter.log("@beforeMethood", true);
	}
	
	@Test
	public void demo() {
		Reporter.log("@Test(demo), executed", true);
		
	}
	
	@Test
	public void demo1() {
		Reporter.log("@Test(demo1), executed", true);
		
	}
	
	
	@AfterMethod
	public void afterMethod( ) {
		Reporter.log("@afterMethood", true);
	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("@AfterClass", true);
	}
		
	@AfterTest
	public void afterTest() {
		Reporter.log("@AfterTest", true );
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("@afterSuite", true);
	}
}
