package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class2

public class demo2_KiteLogin2Page 
{
    // step1:declaration
	@FindBy(xpath="//input[@id='pin']")private WebElement PIN;//privetw WebElement PIN=driver.findelement(By.xpath(xpression));
	@FindBy(xpath="//button[text()='Continue ']")private WebElement CntBtn;//private WEbElement CntBtn=driver.findElement(By.xpath(xpression));
	
	//step2:initialization
	public demo2_KiteLogin2Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3:usage
	public void enterPIN()
	{
		PIN.sendKeys("080807");
	}
	
	public void clickOnCntBtn()
	{
		CntBtn.click();
	}
	
	
	
	
	
	
	
}
