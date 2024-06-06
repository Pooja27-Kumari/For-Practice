package AdvanceTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kia {

	@Test
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kia.com/in/home.html");
		Reporter.log("KIa Launched successfully", true);
	}
	
	
	
}
