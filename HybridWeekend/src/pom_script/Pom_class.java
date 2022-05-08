package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class 
{
	@FindBy(id="firstName")
	private WebElement fname;
	
	@FindBy(id="lastName")
	private WebElement lname;
	
	@FindBy(id="userEmail")
	private WebElement email;
	
	@FindBy(xpath="//label[.='Male']")
	private WebElement mradio;
	
	@FindBy(xpath="//label[.='Female']")
	private WebElement fradio;
	
	@FindBy(xpath="//label[.='Other']")
	private WebElement oradio;
	
	@FindBy(id="userNumber")
	private WebElement usermobile;
	
	@FindBy(id="dateOfBirthInput")
	private WebElement dob;
	
	@FindBy(xpath="//label[.='Sports']")
	private WebElement sports;
	
	@FindBy(xpath="//label[.='Reading']")
	private WebElement reading;
	
	@FindBy(xpath="//label[.='Music']")
	private WebElement music;
	
	@FindBy(xpath="//input[@id='uploadPicture']")
	private WebElement file;
	
	@FindBy(id="currentAddress")
	private WebElement add;
	
	@FindBy(xpath="//div[@id='state']")
	private WebElement statesel;
	
	@FindBy(xpath="//div[@id='city']")
	private WebElement citysel;
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement sub_button;

	@FindBy(xpath="//div[.='15']")
	private WebElement date;
	
	public Pom_class(WebDriver driver)

	{
		PageFactory.initElements(driver, this);
	}
	
	public void first(String datafname)
	{
		
		fname.sendKeys(datafname);
	}
	
	public void last(String datalname)
	{
		lname.sendKeys(datalname);
	}
	
	public void mail(String dataemail)
	{
		email.sendKeys(dataemail);
	}
	
	public void rmale()
	{
		mradio.click();
	}
	
	public void fem()
	{
		fradio.click();
	}
	
	public void oth()
	{
		oradio.click();
	}
	
	public void mob(String mobinum)
	{
		usermobile.sendKeys(mobinum);
	}
	
	public void dateOfbirth()
	{
		dob.click();
	}
	
	public void datesel()
	{
		date.click();
	}
	
	public void scbox()
	{
		sports.click();
	}
	
	public void mcbox()
	{
		music.click();
	}
	
	public void rcbox()
	{
		reading.click();
	}
	
	public void uploadFile(String filedest)
	{
		file.sendKeys(filedest);
	}
	
	public void address(String addres)
	{
		add.sendKeys(addres);
	}
}
