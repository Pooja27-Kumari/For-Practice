import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		 Thread.sleep(3000);
		 Alert alertpopup = driver.switchTo().alert();
		 System.out.println(alertpopup.getText());
		 alertpopup.accept();
		 

	}

}
