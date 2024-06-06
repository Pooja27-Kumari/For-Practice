package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demowebshop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demowebshop.tricentis.com/");
	
		// click on add to cart and click on register
		
		//driver.findElement(By.xpath("//div[@data-productid = \"31\"]//div[2]//div[3]//div[2]")).click();
		//driver.findElement(By.xpath("//a[@class =\"ico-register\"]")).click();
		
		//click on books and sort by price low to high by using text and check whether it is selected or not
		
		driver.findElement(By.xpath("//div[@class =\"header-menu\"]//ul//li//a")).click();
		WebElement sortBy = driver.findElement(By.id("products-orderby"));
		Select selectOp = new Select(sortBy);
		selectOp.selectByVisibleText("Price: Low to High");
		if(sortBy.isSelected()) {
			System.out.println("sortby is Selected");}else {
				System.out.println("sortby is not Selected");
		
		}
			
		
		
	

	}}