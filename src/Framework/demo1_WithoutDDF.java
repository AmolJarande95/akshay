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

public class demo1_WithoutDDF 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Desktop\\selenium file\\chromedriver_win32\\chromedriver.exe");			
         
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
		Thread.sleep(2000);
		
		driver.get("https://kite.zerodha.com/");

		//enter UN
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("EJ0587");
		
		//enter PWD
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pradip@0808");
	
		//click on login btn
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
	
		//enter PIN
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("080807");
			
		//click on continue btn
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
			
	    String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	    String exptUserID="EJ0587";
	
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
