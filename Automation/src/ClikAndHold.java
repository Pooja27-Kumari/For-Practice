import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClikAndHold {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("Pooja1234");
		WebElement eyeIcon = driver.findElement(By.xpath("//div[@class =\"showPassword shownhide\"]"));
		Actions act = new Actions(driver);
		act.clickAndHold(eyeIcon).perform();

	}

}
