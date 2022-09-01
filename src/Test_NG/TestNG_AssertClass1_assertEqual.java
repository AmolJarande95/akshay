package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_AssertClass1_assertEqual 
{

	@Test
	public void TC1()
	{
		String actResult="amol";
		String exptResult="avinash";
		
		Assert.assertEquals(actResult, exptResult,"failed:both result are diff ");
	}
	
	
	
	
	
	
	
}
