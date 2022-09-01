package Page_Object_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//main class/test class
public class demo4_KiteLoginTest 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Desktop\\selenium file\\chromedriver_win32\\chromedriver.exe");			
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://kite.zerodha.com/");
		
		demo1_KiteLogin1Page login1=new demo1_KiteLogin1Page(driver);
		login1.enterUN();
		login1.enterPWD();
		login1.clickOnLoginBtn();
		
		demo2_KiteLogin2Page login2=new demo2_KiteLogin2Page(driver);
		login2.enterPIN();
		login2.clickOnCntBtn();
		
		demo3_KiteHomePage home=new demo3_KiteHomePage(driver);
		home.VerifyUserID();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}
	
}
