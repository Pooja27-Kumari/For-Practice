package assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetDiseaseAlets {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		WebElement statemap = driver.findElement(By.xpath("//div[@class =\"forecast-map-container\"]//div[1]//iframe"));
		 driver.switchTo().frame(statemap);
		
		driver.findElement(By.name("North Dakota")).click();

		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text() = \"Sign up\"]")).click();
		
		WebElement signupHeading = driver.findElement(By.xpath("//h1[text() = \"Step 1: Sign Up for Customized Alerts\"]"));
		String signupText = signupHeading.getText();
		System.out.println(signupText);
		
	}
}
