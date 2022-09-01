package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Grouping2 
{

	@Test(groups="profile")
	public void TC5()
	{
		Reporter.log("running TC5",true);
	}
	
	@Test(groups="login")
	public void TC6()
	{
		Reporter.log("running TC6",true);
	}
	
	@Test(groups="login")
	public void TC7()
	{
		Reporter.log("running TC7",true);
	}
	
	@Test(groups="wishlist")
	public void TC8()
	{
		Reporter.log("running TC8",true);
	}
}
