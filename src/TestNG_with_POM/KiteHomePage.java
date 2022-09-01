package TestNG_with_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class 3
public class KiteHomePage 
{
	@FindBy(xpath="//span[@class='user-id']") private WebElement UserID;
	
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyKiteHomePageUserID(String expUserID) 
	{
		String actUserID = UserID.getText();
		
		if(actUserID.equals(expUserID)) 
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}		
	}
	
	
//	public String VerifyKiteHomePageUserID()
//	{
//		String actUserID = UserID.getText();
//		return actUserID;
//	}
	
	

}
