import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
 public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.facebook.com/signup");
	 WebElement daydropdown =  driver.findElement(By.id("day"));
	 Select daySelect = new Select(daydropdown);
	 daySelect.selectByIndex(0);
	 
	 WebElement monthdropdown = driver.findElement(By.id("month"));
	 Select monthSelect = new Select(monthdropdown);
	 monthSelect.selectByValue("3");

	 WebElement yeardropdown =driver.findElement(By.id("year"));
	 Select yearSelect = new Select(yeardropdown);
	 yearSelect.selectByVisibleText("2021");
}
}
