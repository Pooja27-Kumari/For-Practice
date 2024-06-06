package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.myntra.com/shop/men");
		 Actions act = new Actions(driver);
		 //WebElement menIcon = driver.findElement(By.partialLinkText("MEN"));
	
	    //File temp =menIcon.getScreenshotAs(OutputType.FILE);
	   // File per = new File("./Screenshots/MenSection.png");
	  // FileUtils.copyFile(temp, per);
		act.moveByOffset(158, 50).perform();

	}

}
