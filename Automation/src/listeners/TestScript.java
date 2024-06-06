package listeners;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

// @Listeners(ListenersImplementation.class)
public class TestScript extends BaseClass{

	@Test
	public void login( ) {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		  driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		  driver.findElement(By.id("Password")).sendKeys("abhi@1234");
		  driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		Assert.assertEquals(driver.getTitle(), "Demo web shop", "home page is not displayed ");
		Reporter.log("Home page is displayed ", true);
		
		
	}
	}

