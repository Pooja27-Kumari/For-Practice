package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopperStack {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.shoppersstack.com/");
		 WebElement iphone = driver.findElement(By.xpath("//img[@alt =\"APPLE iPhone 14 Pro\"]"));
		 Actions act = new Actions(driver);
		 act.scrollToElement(iphone).perform();
		 iphone.click();
		 
		//driver.findElement(By.xpath("//*[@data-testid=\"InfoOutlinedIcon\"]")).submit();
		 
		 WebElement compare = driver.findElement(By.name("compare"));
		 act.scrollToElement(compare).perform();
		 compare.click();
		 
		 
		 //WebElement amazon = driver.findElement(By.xpath("//html[@data-platform=\"Win32\"]"));
		
		 Set<String> allWids = driver.getWindowHandles();
		for(String wid :allWids) {
			System.out.println(wid);
			// if(wid.equals(amazon)) {
				// driver.switchTo().window(wid); 
				// act.scrollByAmount(0, 500);
				// act.scrollByAmount(500, 0);
		
			 
			

			  

			  
	
		
		 }
		
		 
	}

