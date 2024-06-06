package listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersImplementation extends BaseClass implements ITestListener,ISuiteListener

{

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TestScript is failed", true);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Temp = ts.getScreenshotAs(OutputType.FILE); 
		File dest = new File ("./Screenshots/listerners.png");
		try {
			FileHandler.copy(Temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	
	
}
