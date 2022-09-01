package TestNG_Base_And_Utility_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demo1_KiteLogin1Page 
{

	//step1:declaration
	@FindBy(xpath="//input[@id='userid']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(xpath="//button[text()='Login ']")private WebElement LoginBtn;
	
	//step2:initialization
	public demo1_KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//step3:usage
	public void inpKiteLogin1PageUsername(String username)
	{
		UN.sendKeys(username);
	}
	
	public void inpKiteLogin1PagePassword(String password)
	{
		PWD.sendKeys(password);
	}
	
	public void ClickKiteLogin1PageLoginBtn()
	{
		LoginBtn.click();
	}
	
	
	
	
	
	
	
	
}
