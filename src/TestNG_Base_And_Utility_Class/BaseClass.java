package TestNG_Base_And_Utility_Class;

import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	
	WebDriver driver;
public void initializeBrowser() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Desktop\\selenium file\\chrome file new\\chromedriver_win32\\chromedriver.exe");			
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.get("https://kite.zerodha.com/");
	
	
}
}
