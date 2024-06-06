package assignmentsFlipkart;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobileLogo {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement mobileslogo = driver.findElement(By.xpath("//img[@alt = \"Mobiles\"]"));
		File tempFile = mobileslogo.getScreenshotAs(OutputType.FILE);
		File permFile = new File("./Screenshots/mobileslogo.png");
		FileUtils.copyFile(tempFile, permFile);
	}
}