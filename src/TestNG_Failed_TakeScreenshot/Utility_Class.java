package TestNG_Failed_TakeScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class 
{
	    //@Author Name: amol
		//this method is use to get test data from excel sheet
		//need to pass 2 inputs: 1. rowIndex , 2.colIndex
		
	public static String getTD(int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\framework exsel\\DDF.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("DDF1");
		
		String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
	    return value;
	}
	
	public static void captureScreenShot(WebDriver driver,int TCID) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest=new File("C:\\Users\\User\\OneDrive\\Desktop\\Take Screenshot\\TestCaseID"+TCID+".jpg");
	    FileHandler.copy(src, dest);
	}





}
