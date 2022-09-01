package TestNG_with_POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_With_DDF.demo1_KiteLogin1Page;
import POM_With_DDF.demo2_KiteLogin2Page;
import POM_With_DDF.demo3_KiteHomePage;

public class TestNG_POM_With_DDF1 
{
	demo1_KiteLogin1Page login1;
	demo2_KiteLogin2Page login2;
	demo3_KiteHomePage home;
	Sheet sh;
	WebDriver driver;
    @BeforeClass
    public void openBrowser() throws EncryptedDocumentException, IOException, InterruptedException
    {
    	FileInputStream file=new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\framework exsel\\DDF.xlsx");
		 sh=WorkbookFactory.create(file).getSheet("DDF1");
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Desktop\\selenium file\\chrome file new\\chromedriver_win32\\chromedriver.exe");			
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://kite.zerodha.com/");
		
		 login1=new demo1_KiteLogin1Page(driver);
		 login2=new demo2_KiteLogin2Page(driver);
		 home=new demo3_KiteHomePage(driver);
    }
    
    @BeforeMethod
    public void loginToApp()
    {
    	login1.inpKiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		login1.inpKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		login1.ClickKiteLogin1PageLoginBtn(); 
		
 		login2.inpKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
		login2.inpKiteLogin2PageContinueBtn();
		
    }
	@Test
	public void getTestNG_POM_With_DDF2ActUserID()
	{
		home.VerifyKiteHomePageUserID(sh.getRow(0).getCell(3).getStringCellValue());
		
//		String actUserID=home.VerifyKiteHomePageUserID(actUserID);
//		String expUserID=sh.getRow(0).getCell(3).getStringCellValue();
//		Assert.assertEquals(actUserID, expUserID,"Failed: both results are diff");
	}
	
	@AfterMethod
	public void logoutFromApp()
	{
		
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
