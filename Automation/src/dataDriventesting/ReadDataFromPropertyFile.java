package dataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		// Step 1- Create File InputStream object
		FileInputStream fis = new FileInputStream("./Testdata/Commondata.properties");
		
		//create respective file type object
		Properties prop = new Properties();
		
		//call read methods
		prop.load(fis);
		String url =prop.getProperty("url");
		System.out.println(url);
		String email = prop.getProperty("email");
		System.out.println(email);
		String password = prop.getProperty("password");
		System.out.println(password);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys(email);
		

	}

}
