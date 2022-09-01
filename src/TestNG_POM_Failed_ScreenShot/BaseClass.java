package TestNG_POM_Failed_ScreenShot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass 
{
	
	WebDriver driver;
public void initializeBrowser() throws InterruptedException, IOException
{
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notification");
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Desktop\\selenium file\\chrome file new\\chromedriver_win32\\chromedriver.exe");			
	 driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.get(Utility_Class.getPFdata("URL"));
	
	
}
}
