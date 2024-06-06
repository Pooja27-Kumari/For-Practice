package CSS;

	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Rcb
	{
		public static void main(String[] args) throws InterruptedException, IOException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.royalchallengers.com/");
			driver.manage().window().maximize();
			WebElement rcblogo = driver.findElement(By.xpath("//div[@class =\"hdr-logo\"]//img"));
			File tempFile =rcblogo.getScreenshotAs(OutputType.FILE);
			File perFile = new File ("./rcblogo.png");
			FileUtils.copyFile(tempFile, perFile);
}
}
