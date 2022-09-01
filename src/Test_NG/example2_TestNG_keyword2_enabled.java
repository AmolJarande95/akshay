package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example2_TestNG_keyword2_enabled 
{

	@Test
	public void TC1()
	{
		Reporter.log("--running TC1--",true);
	}
	
	@Test(enabled=false)
	public void TC2()
	{
		Reporter.log("--running TC2--",true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("--running TC3--",true);
	}
	
	
}
