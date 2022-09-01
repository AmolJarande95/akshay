package Test_NG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_multibrowserTesting 
{
    @Parameters("browserName")
	@Test
	public void TC(String browserName) throws InterruptedException
	{
		WebDriver driver=null;
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\OneDrive\\Desktop\\selenium file\\chrome file new\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\OneDrive\\Desktop\\firefox browser\\Firefox Installer.exe");
		
		driver=new FirefoxDriver();
		}
		
		else if(browserName.equals("opera"))
		{
			System.setProperty("webdriver.opera.driver","C:\\Users\\User\\OneDrive\\Desktop\\opera browser\\OperaSetup.exe");
			driver=new OperaDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
		driver.close();
	}
	
	
}
