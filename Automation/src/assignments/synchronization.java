package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class synchronization {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		
	// using frame with index
		//driver.switchTo().frame(0);
		
	//using frame with name or Id
		//driver.switchTo().frame("send-sms-iframe");
		
	//	using frame with WebElement
		WebElement smsframe = driver.findElement(By.xpath("//iframe[@class = \"send-sms-iframe\"]"));
		driver.switchTo().frame(smsframe);
		
		driver.findElement(By.id("regEmail")).sendKeys("12345");
		driver.findElement(By.id("regUser")).click();
		
		//switch to the the main screen by 2 ways
		//driver.switchTo().defaultContent();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("hamburger")).click();
		
		
		

	}

}
