package webdrivermethod;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithWindows {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.goibibo.com/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.skyscanner.co.in/");
	Set<String> allWids = driver.getWindowHandles();
	System.out.println(allWids);
	for(String wid : allWids) {
		String widurl = driver.switchTo().window(wid).getCurrentUrl();
		System.out.println(widurl);
		if (widurl.equals("https://www.goibibo.com/")) {
		}
		else if(widurl.equals("https://www.skyscanner.co.in/")) {
			String SkyscannerHP = driver.getTitle();
			System.out.println("Skyscanner home page ="+ SkyscannerHP);
	 int childwindowHeight = driver.manage().window().getSize().getHeight();
	 System.out.println("childwindowHeight ="+ childwindowHeight);
	 int childwindowHidth = driver.manage().window().getSize().getWidth();
	 System.out.println("childwindowHidth =" + childwindowHidth);
	 int childwindowXAsis = driver.manage().window().getPosition().getX();
	 System.out.println("childwindowXAsis ="+ childwindowXAsis);
	 int childwindowYAsis = driver.manage().window().getPosition().getY();
	 System.out.println("childwindowYAsis ="+ childwindowYAsis);
	 
	}
	
	
}
}
}
