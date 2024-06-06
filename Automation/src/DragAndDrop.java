import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		 WebElement photoframe = driver.findElement(By.xpath("//iframe[@class =\"demo-frame lazyloaded\"]"));
		 driver.switchTo().frame(photoframe);
		 WebElement img = driver.findElement(By.xpath("//img[@alt = \"The peaks of High Tatras\"]"));
		 WebElement trash =driver.findElement(By.id("trash"));
		 Actions act = new Actions(driver);
		 act.dragAndDrop(img, trash).perform();
		//act.dragAndDrop(img, imp).perform();
		 
		 WebElement scrol = driver.findElement(By.partialLinkText("Platform & Database"));
		 

	}

}
