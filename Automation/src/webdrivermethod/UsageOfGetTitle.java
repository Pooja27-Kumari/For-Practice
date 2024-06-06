package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String FlipkartLoginPage = driver.getTitle();
	System.out.println("Flipkart Login Page =" + FlipkartLoginPage);
}
}
