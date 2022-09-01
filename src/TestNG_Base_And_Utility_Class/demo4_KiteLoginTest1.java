package TestNG_Base_And_Utility_Class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4_KiteLoginTest1 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
	    FileInputStream file=new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\framework exsel\\DDF.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("DDF1");
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Desktop\\selenium file\\chrome file new\\chromedriver_win32\\chromedriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://kite.zerodha.com/");
		
		demo1_KiteLogin1Page login1=new demo1_KiteLogin1Page(driver);
		login1.inpKiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		login1.inpKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		login1.ClickKiteLogin1PageLoginBtn();
		
		demo2_KiteLoginPage2 login2=new demo2_KiteLoginPage2(driver);
		login2.inpKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
		login2.inpKiteLogin2PageContinueBtn();
		
		demo3_KiteHomePage home=new demo3_KiteHomePage(driver);
		//home.VerifyKiteHomePageUserID(sh.getRow(0).getCell(3).getStringCellValue());
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
	}
}
