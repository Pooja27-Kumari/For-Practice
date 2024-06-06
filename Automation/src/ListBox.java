import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement price = driver.findElement(By.id("cars"));
		
		//For selecting First Selected Option (single Element)
		
		Select priceSelect = new Select(price);
		priceSelect.selectByIndex(0);
		priceSelect.selectByIndex(1);
		priceSelect.selectByIndex(2);
		
	   // WebElement FirstSelectedOption = priceSelect.getFirstSelectedOption();
	    //System.out.println(FirstSelectedOption.getText());
		System.out.println(priceSelect.getFirstSelectedOption().getText());
		
		//For selecting all Selected elements
		
		 List<WebElement> allSelectedOption = priceSelect.getAllSelectedOptions();
		 // System.out.println(allSelectedOption);//it will only give the address of the selected elements
		 for( WebElement element:allSelectedOption) {
			 System.out.println(element.getText());
			 
	// To Check the Options present in the list
			 List<WebElement> allOptions = priceSelect.getOptions(); 
			 System.out.println(allOptions.size()); 
			 
			 for( WebElement ele : allOptions) {
				 System.out.println(ele.getText());
			 }
			 
			 
			 
		 }
		
		
		

	}

}
