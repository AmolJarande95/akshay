package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo4_TestNG_Annotation 
{

	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("Open Browser",true);
	}
	
@BeforeMethod 	
	public void loginToApp()
	{
	Reporter.log("login to app",true);
	}
	
	@Test
	public void VerifyUserID1()
	{
		Reporter.log("--running verify user ID1--",true);
	}
	
	@Test
	public void VerifyUserID2()
	{
		Reporter.log("--verify user ID2--",true);
	}
	
	@AfterMethod
	public void logoutFromApp()
	{
		Reporter.log("logout from app",true);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("close browser",true);
	}


}
