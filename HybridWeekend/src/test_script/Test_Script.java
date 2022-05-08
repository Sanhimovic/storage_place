package test_script;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import generic.Base_class;
import generic.Generic_readExcel;
import generic.Utility_Methods;
import pom_script.Pom_class;

public class Test_Script extends Base_class
{
	@Test
	public void test() throws EncryptedDocumentException, IOException, InterruptedException, AWTException
	{
		String firstname = Generic_readExcel.getData("Sheet1", 0, 0);
		String lastname = Generic_readExcel.getData("Sheet1", 1, 0);
		String emailid = Generic_readExcel.getData("Sheet1", 2, 0);
		String mobnum = Generic_readExcel.getData("Sheet1", 3, 0);
		
		Pom_class pmcl=new Pom_class(driver);
		pmcl.first(firstname);
		pmcl.last(lastname);
		pmcl.mail(emailid);
		pmcl.rmale();
		pmcl.fem();
		pmcl.oth();
		pmcl.mob(mobnum);
		
		Utility_Methods.javascriptexe(driver)
		       .executeScript("window.scrollBy(0,600)");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("dateOfBirthInput"))));
		pmcl.dateOfbirth();
		
		Utility_Methods.select_class(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")))
		           .selectByValue("4");
		
		Utility_Methods.select_class(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")))
		           .selectByValue("1995");
		
		pmcl.datesel();
		
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='submit']"))))
	              .click();
	    
	    String text = driver.findElement(By.xpath("(//div[.='Thanks for submitting the form'])[2]"))
	          .getText();
	    
	    Assert.assertEquals(text, "Thanks for submitting");
	    System.out.println("Framework ends");
	}
}