import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demowebshop.tricentis.com/");
		Actions act = new Actions(driver);
		WebElement computerLink = driver.findElement(By.partialLinkText("COMPUTERS"));
		act.moveToElement(computerLink).perform();
	 driver.findElement(By.partialLinkText("Desktops")).click();
		

	}

}
