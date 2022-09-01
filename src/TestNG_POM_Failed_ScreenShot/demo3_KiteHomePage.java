package TestNG_POM_Failed_ScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demo3_KiteHomePage 
{

	//step1:declaration
	
	@FindBy(xpath="//span[@class='user-id']")private WebElement UserID;
	
	//step2:initialization
	
	public demo3_KiteHomePage(WebDriver driver)
	{
	  PageFactory.initElements(driver,this);	
	}
	
	//step3:usage
	
//	public void VerifyKiteHomePageUserID(String expUserID)
//	{
//		String actUserID=UserID.getText();
//		
//		if(actUserID.equals(expUserID))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
		
		public String getKiteHomePageActUserID()
		{
			String actUserID = UserID.getText();
			return actUserID;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

