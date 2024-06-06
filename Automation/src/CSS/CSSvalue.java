package CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class CSSvalue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 WebElement createNewAccLink = driver.findElement(By.xpath("//a[@data-testid = \'open-registration-form-button\']"));
		 String createNewAccLinkcolor = createNewAccLink.getCssValue("background-color");
		System.out.println("Create new Account Link Color :" + createNewAccLinkcolor);
		String hexadecvalue = Color.fromString(createNewAccLinkcolor).asHex();
		System.out.println("Create new Account Link Color Hexadecimal value :" + hexadecvalue);
		
		
		
	}
}
