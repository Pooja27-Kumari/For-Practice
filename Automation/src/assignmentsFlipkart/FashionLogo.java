package assignmentsFlipkart;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FashionLogo {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement fashionlogo = driver.findElement(By.xpath("//img[@alt =\"Fashion\"]"));
		File temp = fashionlogo.getScreenshotAs(OutputType.FILE);
		File per = new File("./Screenshots/fashionlogo.png");
		FileUtils.copyFile(temp, per);
	}
}