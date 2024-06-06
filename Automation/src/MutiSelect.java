import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MutiSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		 WebElement price =  driver.findElement(By.id("cars"));
		 Select multiSelect = new Select(price);
		 multiSelect.selectByIndex(0);
		 multiSelect.selectByValue("199");
		 multiSelect.selectByVisibleText("INR 200 - INR 299 ( 3 )");
		 
		 //multiSelect.deselectByIndex(0);
		// multiSelect.deselectByValue("199");
		// multiSelect.deselectByVisibleText("INR 200 - INR 299 ( 3 )");
		 multiSelect.deselectAll();
		 
		 System.out.println(multiSelect.isMultiple());
		 //one more way is when there is a multiple attribute in the 

	}

}
