package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_AssertClass3_assertTrue 
{

	
	
	@Test
	public void TC3()
	{
		boolean actResult=false;
		
		Assert.assertTrue(actResult,"failed:actResult is false");
	}
	
	
	
	
	
	
}
