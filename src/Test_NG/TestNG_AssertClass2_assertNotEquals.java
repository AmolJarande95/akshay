package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_AssertClass2_assertNotEquals
{

	@Test
	public void TC2()
	{
		String actResult="amol";
		String exptResult="avinash";
		
		Assert.assertNotEquals(actResult, exptResult);
	}
	
	
	
	
	
}
