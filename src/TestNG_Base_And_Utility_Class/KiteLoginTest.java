package TestNG_Base_And_Utility_Class;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class KiteLoginTest extends BaseClass
{

    demo1_KiteLogin1Page login1;	
	demo2_KiteLoginPage2 login2;
	demo3_KiteHomePage home;
	
	@BeforeClass
	public void openBrowser() throws InterruptedException
	{
		initializeBrowser();
		login1=new demo1_KiteLogin1Page(driver);
		login2=new demo2_KiteLoginPage2(driver);
		home=new demo3_KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException
	{
		login1.inpKiteLogin1PageUsername(Utility_Class.getTD(0, 0));
		login1.inpKiteLogin1PagePassword(Utility_Class.getTD(0,1));
		login1.ClickKiteLogin1PageLoginBtn();
		login2.inpKiteLogin2PagePin(Utility_Class.getTD(0,2));
	    login2.inpKiteLogin2PageContinueBtn();
	    }
	
	@Test
	public void verifyUserID() throws EncryptedDocumentException, IOException
	{
		//home.VerifyKiteHomePageUserID(sh.getRow(0).getCell(3).getStringCellValue());
		
		
		String actUserID=home.getKiteHomePageActUserID();
		String expUserID=Utility_Class.getTD(0, 3);
		Assert.assertEquals(actUserID, expUserID,"Failed: both results are diff");
	}
	
	@AfterMethod
	public void logoutfromApp()
	{
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
