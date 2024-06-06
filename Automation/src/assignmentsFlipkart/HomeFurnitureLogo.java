package assignmentsFlipkart;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeFurnitureLogo {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement furnitureLogotronicsLogo = driver.findElement(By.xpath("//img[@alt =\"Home & Furniture\"]"));
		File temp = furnitureLogotronicsLogo.getScreenshotAs(OutputType.FILE);
		File per = new File("./Screenshots/FurnitureLogotronicsLogo.png");
		FileUtils.copyFile(temp, per);
	}
}
