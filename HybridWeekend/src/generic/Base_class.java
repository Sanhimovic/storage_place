package generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class implements Framework_Constants
{
	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		wait=new WebDriverWait(driver, 10);
		driver.get(URL);
	}
	
	@AfterMethod
	public void closeapp(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
			{
			   Generic_Screenshot.getPhoto(driver);
			}
		driver.close();
	}
}