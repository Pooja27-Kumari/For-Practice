package assignments;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class PlayWithWindows 
{
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.get("https://www.flipkart.com/");
	String secondpage = driver.getTitle();
	System.out.println(secondpage);
	driver.get("https://www.myntra.com/");
	driver.get("https://www.amazon.in/");
	driver.get("https://www.ajio.com/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	Set<String> allWids = driver.getWindowHandles();
	for(String wid :allWids) {
		String widTitle = driver.switchTo().window(wid).getTitle();
		System.out.println(widTitle);
		if (widTitle.equals(secondpage)) {
			System.out.println(driver.getCurrentUrl());
		}
	}

}
}
