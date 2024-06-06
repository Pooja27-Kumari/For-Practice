package CSS;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-testid ='open-registration-form-button']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("Pooja");
		//convert webdriver object to TakesS interfacecreenshot
		TakesScreenshot ts = ((TakesScreenshot)driver);
		//call getScreenshotAs method to create image file
		File scr = ts.getScreenshotAs(OutputType.FILE);  
		//create a destination path where we need to save the image
		File dest = new File("./Screenshots/facebookloginpagescreenshot.png");
		
		FileUtils.copyFile(scr, dest);
		
		
		
		
		     //driver.findElement(By.xpath("//a[@data-testid ='open-registration-form-button']")).click();
		     //driver.findElement(By.cssSelector("//input[@name ='firstname']")).sendKeys("PallaviPriya");
		
	}

}
