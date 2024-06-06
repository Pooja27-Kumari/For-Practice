import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		 driver.switchTo().frame("iframeResult");
		 driver.findElement(By.xpath("//button[text()= 'Try it']")).click();
		 Alert prompt = driver.switchTo().alert();
		 prompt.sendKeys("Crew Members");
		 prompt.accept();

	}

}
