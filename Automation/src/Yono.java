import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Yono {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		 Actions act = new Actions(driver);
		driver.findElement(By.id("password")).sendKeys("1223456");
		 act.moveByOffset(1179, 315).clickAndHold().perform();
	}

}
