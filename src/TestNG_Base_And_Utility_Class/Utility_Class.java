package TestNG_Base_And_Utility_Class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

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
	
	
}
