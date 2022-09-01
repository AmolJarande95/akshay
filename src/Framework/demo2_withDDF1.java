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

public class demo2_withDDF1 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	
	{	
			
		FileInputStream file=new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\framework exsel\\DDF.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF1");
		
  	     System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\OneDrive\\Desktop\\selenium file\\chromedriver_win32\\chromedriver.exe"); 
         WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.get("https://kite.zerodha.com/");
		

		//enter UN
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(username);
		
		//enter PWD
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
				
		//click on login btn
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		//enter PIN
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
						
		//click on continue btn
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
				
		String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String exptUserID=sh.getRow(0).getCell(3).getStringCellValue();
		
		if(actUserID.equals(exptUserID))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		Thread.sleep(2000);
		driver.close();		
		
		
		
	}
}