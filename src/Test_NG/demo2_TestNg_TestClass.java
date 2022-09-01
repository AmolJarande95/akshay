package Test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo2_TestNg_TestClass 
{
	@Test
	public void m1() throws InterruptedException
	{
		System.setProperty("webdriver chrome driver","C:\\Users\\User\\OneDrive\\Desktop\\selenium file\\chrome file new\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
