package Trello;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Condition {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://trello.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		String title = driver.getTitle();
		System.out.println(title);
		WebElement loginBtn=  driver.findElement(By.xpath("//a[@data-uuid= \"MJFtCCgVhXrVl7v9HA7EH_login\"]"));
	if (title.equals("Manage Your Team’s Projects From Anywhere | Trello")) {
			loginBtn.click();
		}else {
      System.out.println("cannot find the element");
	}
	WebElement emailId = driver.findElement(By.id("username"));
	emailId.sendKeys("Karthik.qspiders@gmail.com");
	String pageurl = driver.getCurrentUrl();
	System.out.println(pageurl);
	WebElement continuebtn = driver.findElement(By.id("login-submit"));
    if (pageurl.equals(driver.getCurrentUrl())) {
    	continuebtn.submit();
    }else {
    	System.out.println("page is not matching");
    }
    WebElement passwordtext =driver.findElement(By.id("password"));
	passwordtext.sendKeys("Qspy@123");
	WebElement loginbtn = driver.findElement(By.id("login-submit"));
	loginbtn.click();
	WebElement createlink = driver.findElement(By.xpath("//p[@class = \"remaining\"]"));
	createlink.click();
	WebElement Boradtext = driver.findElement(By.xpath("//input[@type =\"text\"]"));
	Boradtext.sendKeys("New Board");
	WebElement creatBtn = driver.findElement(By.xpath("//button[@data-testid = \"create-board-submit-button\"]"));
	Thread.sleep(3000);
	if(creatBtn.isEnabled()) {
		creatBtn.click();
	}else {
		System.out.println("Create button is not enabled");
	}	
	
}
}
