package Test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Parallel_Execution1 
{

	@Test
	public void openfacebookapp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\OneDrive\\Desktop\\selenium file\\chrome file new\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
				driver.get("https://www.facebook.com/");
	
	Thread.sleep(3000);
	
	driver.close();
	}
	
	
	
	
	
	
	
	
	
	
}
