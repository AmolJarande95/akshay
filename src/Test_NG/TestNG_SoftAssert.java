package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_SoftAssert 
{

	@Test
	public void TC5()
	{
		SoftAssert soft=new SoftAssert();
		
		String actResult="amol";
		String exptresult="avi";
		
		Assert.assertEquals(actResult, exptresult,"failed; both statments are diff");
		
		boolean actResult1=false;
		soft.assertTrue(actResult1,"failed:actresult is false");
		
		
		soft.assertAll();
	}
	
	
	
	
	
	
}
