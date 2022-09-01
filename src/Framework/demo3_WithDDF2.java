 package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3_WithDDF2 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{		
	FileInputStream file=new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\framework exsel\\DDF.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF1");	
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Desktop\\selenium file\\New folder\\chromedriver_win32\\chromedriver.exe");			
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
	Thread.sleep(2000);
	
	driver.get("https://kite.zerodha.com/");
	
	//enter UN
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
	
	//enter password
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
	
	//click on login btn
	driver.findElement(By.xpath("//button[text()='Login ']")).click();
	
	//enter pin
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(sh.getRow(0).getCell(2).getStringCellValue());
	
	//click on continue btn
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	
	String actUserID=driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	String exptUserID=sh.getRow(0).getCell(3).getStringCellValue();
	
	if(actUserID.equals(exptUserID))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	Thread.sleep(5000);
	driver.close();
	}
}
	
