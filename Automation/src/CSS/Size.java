package CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Size {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		driver.manage().window().maximize();
		WebElement emailTextfeild = driver.findElement(By.xpath("//input[@aria-label ='Email or phone']"));
		int emailYAxis =emailTextfeild.getRect().getY();
		System.out.println(emailYAxis);
		int emailwidth = emailTextfeild.getRect().getWidth();
		System.out.println(emailwidth);
		int passwordYaxis =emailTextfeild.getRect().getY();
		System.out.println(passwordYaxis);
		//int emailwidthA = emailTextfeild.getRect().getWidth();
		// System.out.println(emailwidth);
	} 

}
