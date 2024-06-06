package assignmentsFlipkart;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroceryLogo {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement grocerylogo = driver.findElement(By.xpath("//img[@alt = \"Grocery\"]"));
		File tempFile = grocerylogo.getScreenshotAs(OutputType.FILE);
		File permFile = new File("./Screenshots/grocerylogo.png");
		FileUtils.copyFile(tempFile, permFile);
		
	}

}
