package Test_NG;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Parallel_Execution2 
{

	@Test
	public void openKiteApp() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\OneDrive\\Desktop\\selenium file\\chrome file new\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
	}
	
}
