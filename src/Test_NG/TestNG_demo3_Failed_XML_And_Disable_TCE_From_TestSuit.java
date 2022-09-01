package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_demo3_Failed_XML_And_Disable_TCE_From_TestSuit 
{

	@Test
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("running TC3",true);
	}
	
	
	
	
}
