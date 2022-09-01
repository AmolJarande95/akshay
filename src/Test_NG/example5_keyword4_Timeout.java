package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_keyword4_Timeout
{

	@Test(timeOut=5000)
	public void TC1() throws InterruptedException
	{
		Thread.sleep(4999);
		Reporter.log("running TC1",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
