package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demo2_KiteLogin2Page 
{

	//step1:declaration
	
	@FindBy(xpath="//input[@id='pin']") private	WebElement Pin;
	@FindBy(xpath="//button[text()='Continue ']") private	WebElement CntBtn;
	
	//step2:initialization
	
	public demo2_KiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//step3:usage
	
	public void inpKiteLogin2PagePin(String PINInfo)
	{
	Pin.sendKeys(PINInfo);	
	}
	
	public void inpKiteLogin2PageContinueBtn()
	{
		CntBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
}
