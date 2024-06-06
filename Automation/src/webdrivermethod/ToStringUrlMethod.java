package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToStringUrlMethod {
  public static void main(String[] args) throws InterruptedException
  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hcltech.com/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.hcltech.com/digital");
	Thread.sleep(2000);
	driver.navigate().to("https://www.hcltech.com/engineering");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().to("https://www.hcltech.com/cloud-services");
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().to("https://www.hcltech.com/ai");
	Thread.sleep(2000);
	driver.navigate().refresh();
}
}
