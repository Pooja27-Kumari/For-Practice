package CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingTextFields
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
	    WebElement FirstNameTextField = driver.findElement(By.name("firstname"));
	    int FirstNameWidth = FirstNameTextField.getSize().getWidth();
	    System.out.println("FirstNameWidth:"+FirstNameWidth);
	    int FirstNameHeight = FirstNameTextField.getSize().getHeight();
	    System.out.println("FirstNameHeight:"+FirstNameHeight);
	    WebElement SurnameTextField = driver.findElement(By.name("lastname"));
	    int SurNameWidth  = SurnameTextField.getSize().getWidth();
	    System.out.println("SurNameWidth:"+SurNameWidth);
	    int SurNameHeight  = SurnameTextField.getSize().getHeight();
	    System.out.println("SurNameHeight:"+SurNameHeight);
	    
	    if(FirstNameWidth==SurNameWidth && FirstNameHeight==SurNameHeight)
	    {
	    	System.out.println("The size of the Textfields are same");
	    }
	    else
	    {
	    	System.out.println("The size of the Textfields are  not same");

	    }

	    driver.manage().window().minimize();
	    driver.quit();
	    
	}
	
}
