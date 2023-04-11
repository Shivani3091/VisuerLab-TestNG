package POM_VisuerLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import UtilityClass_VisuerLab.Utility_V;

public class HomePage 
{
	@FindBy(xpath="(//span[@class='menu-text'])[10]")private WebElement getBtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void ClickButton() throws InterruptedException
	{
		getBtn.click();
		Thread.sleep(500);
		Reporter.log("clicking on Get Started button");
	}

}
