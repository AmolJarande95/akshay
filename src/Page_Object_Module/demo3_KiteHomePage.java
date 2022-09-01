package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class3

public class demo3_KiteHomePage 
{

	//step1:declaration
	@FindBy(xpath="//span[@class='user-id']")private WebElement UserID;//private WebElement UserID=FindElement(By.xpath(xpression));
	
	
	//step2:initialization
	public  demo3_KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3:usage
	public void VerifyUserID()
	{
		String actUserID=UserID.getText();
		String exptUserID="EJ0587";
		
		if(actUserID.equals(exptUserID))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	
	
	
	
	
}
