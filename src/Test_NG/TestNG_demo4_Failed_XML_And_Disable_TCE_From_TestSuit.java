package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_demo4_Failed_XML_And_Disable_TCE_From_TestSuit 
{

	@Test
	public void TC4()
	{
		Reporter.log("running TC4",true);
	}
	
	@Test
	public void TC5()
	{
		Reporter.log("running TC5",true);
	}
	
	@Test
	public void TC6()
	{
		Reporter.log("running TC6",true);
	}
	
	
	
	
	
}
