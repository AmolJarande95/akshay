package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class1

public class demo1_KiteLogin1Page 
{

	//step1:declaration
	
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;//private webelement UN=driver.findElement(By.Xpath(""));
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;//private webelement PWD=driver.findElement(By.Xpath(""));
	@FindBy(xpath="//button[text()='Login ']") private WebElement LoginBtn;//private webelement LoginBtn=driver.findElement(By.Xpath(""));
	
	//step2:initialization
	public  demo1_KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//step3:usage
	public void enterUN()
	{
		UN.sendKeys("EJ0587");
	}
	
	public void enterPWD()
	{
		PWD.sendKeys("Pradip@0808");
	}
	
	public void clickOnLoginBtn()
	{
		LoginBtn.click();
	}
	
}
