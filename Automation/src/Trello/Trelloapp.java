package Trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trelloapp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://trello.com/");
	driver.manage().window().maximize();
	WebElement loginBtn=  driver.findElement(By.xpath("//a[@data-uuid= \"MJFtCCgVhXrVl7v9HA7EH_login\"]"));
	loginBtn.click();
	Thread.sleep(3000);
	WebElement emailId = driver.findElement(By.id("username"));
	emailId.sendKeys("Karthik.qspiders@gmail.com");
	Thread.sleep(3000);
	WebElement continuebtn = driver.findElement(By.id("login-submit"));
	continuebtn.submit();
	Thread.sleep(3000);
	WebElement passwordtext =driver.findElement(By.id("password"));
	passwordtext.sendKeys("Qspy@123");
	Thread.sleep(3000);
	WebElement loginbtn = driver.findElement(By.id("login-submit"));
	loginbtn.click();
	Thread.sleep(1000);
	WebElement createlink = driver.findElement(By.xpath("//p[@class = \"remaining\"]"));
	createlink.click();
	Thread.sleep(1000);
	WebElement Boradtext = driver.findElement(By.xpath("//input[@type =\"text\"]"));
	Boradtext.sendKeys("New Board");
	Thread.sleep(1000);
	WebElement creatBtn = driver.findElement(By.xpath("//button[@data-testid = \"create-board-submit-button\"]"));
	if(creatBtn.isEnabled()) {
		creatBtn.click();
	}else {
		System.out.println("Create button is not enabled");
	}	
	Thread.sleep(5000);
	WebElement closeIcon = driver.findElement(By.xpath("//span[@data-testid=\"CloseIcon\"]"));
	closeIcon.click();
	Thread.sleep(5000);
	WebElement logoutIcon = driver.findElement(By.xpath("//div[@data-testid = \"header-member-menu-avatar\"]//span"));
	logoutIcon.click();
	Thread.sleep(1000);
	WebElement logout = driver.findElement(By.xpath("//button[@data-testid   = \"account-menu-logout\"]"));
	logout.click();
	Thread.sleep(1000);
	WebElement Logoutbtn = driver.findElement(By.id("logout-submit"));
	Logoutbtn.click();
	Thread.sleep(1000);
	//Qspy@123
	
}
}
