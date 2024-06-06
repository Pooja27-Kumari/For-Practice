import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/signup");
		 WebElement month =  driver.findElement(By.id("month"));
		 Select selectOption = new Select(month);
		 selectOption.selectByIndex(1);
		 
		 
		 List<WebElement> allOption = selectOption.getOptions(); 
		 System.out.println(allOption.size()); 
		 
		 for( WebElement ele : allOption) {
			 System.out.println(ele.getText());
			 
			 
	// last index
			 
			 WebElement yr =  driver.findElement(By.id("year"));
			 Select selectOp = new Select(yr);
		
			 List<WebElement> allOp = selectOption.getOptions(); 
			 System.out.println(allOp.size()); 
			 
			// for( WebElement elem : allOp) {
			//	 System.out.println(ele.getText())
						
				 
				 
			 
}

	}
}

