package POM_VisuerLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import UtilityClass_VisuerLab.Utility_V;

public class FormPage 
{
	@FindBy(name="FullName")private WebElement nameField;
	@FindBy(name="CompanyName")private WebElement comField;
	@FindBy(name="EmailAddress")private WebElement eField;
	@FindBy(name="PhoneNumber")private WebElement NumField;
	@FindBy(name="Industry")private WebElement industryDropDown;
	@FindBy(name="Project-type")private WebElement projectDropDown;
	@FindBy(name="Program-covers")private WebElement programDropDown;
	@FindBy(name="eLearning-utilise[]")private WebElement echeckBox;
	@FindBy(name="Budget-range")private WebElement budgetDropDown;
    @FindBy(name="Project-Timeline")private WebElement timelineDropDown;
    @FindBy(name="Content-Development")private WebElement contentDropDown;
    @FindBy(name="Vendor-Approval-Process")private WebElement approvalDropDown;
    @FindBy(name="Message")private WebElement message;
    @FindBy(xpath="(//div[@class='wpb_wrapper'])[5]") private WebElement moveTo;
    @FindBy(name="acceptance-449")private WebElement CheckBox;
    @FindBy(xpath="//input[@type='submit']")private WebElement subBtn;
    
    public FormPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void enterName(String name)
    {
    	nameField.sendKeys(name);
    	Reporter.log("Entering Name");
    }
    
    public void enterCompany(String name)
    {
    	comField.sendKeys(name);
    	Reporter.log("Entering company name");
    }
    
    public void enterEmail(String email)
    {
    	eField.sendKeys(email);
    	Reporter.log("Entering Email");
    }
    
    public void NumField(String no)
    {
    	NumField.sendKeys(no);
    	Reporter.log("Entering number");
    }
    
    public void SelectIndustry() throws InterruptedException
    {
    	industryDropDown.click();
    	Select s=new Select(industryDropDown);
    	s.selectByValue("Education");
    	Thread.sleep(500);
    	Reporter.log("Selecting Indutry from drop down");
    }
    
    public void SelectProject() throws InterruptedException
    {
    	projectDropDown.click();
    	Select s=new Select(projectDropDown);
    	s.selectByValue("Update existing eLearning program");
    	Thread.sleep(500);
    	Reporter.log("Selecting project from drop down");
    }
    
    public void SelectProgram() throws InterruptedException
    {
    	programDropDown.click();
    	Select s=new Select(programDropDown);
    	s.selectByVisibleText("Soft Skills");
    	Thread.sleep(500);
    	Reporter.log("Selecting program from drop down");
    }
    
    public void SelectECheckBox()
    {
    	echeckBox.click();
    	Reporter.log("Selecting checkbox");
    }
    
    public void SelectBudget(WebDriver driver) throws InterruptedException
    {
    	Utility_V.scrollIntoView(driver,moveTo);
    	Thread.sleep(1000);
    	budgetDropDown.click();
    	Select s=new Select(budgetDropDown);
    	s.selectByIndex(2);
    	Reporter.log("Selecting budget from drop down");
    }
    
    public void SelectTimeline(WebDriver driver) throws InterruptedException
    {
    	Utility_V.scrollIntoView(driver,moveTo);
    	Thread.sleep(1000);
    	timelineDropDown.click();
    	Select s=new Select(timelineDropDown);
    	s.selectByVisibleText("4 to 8 weeks");
    	Reporter.log("Selecting Timeline");
    	
    }
    
    public void SelectContent(WebDriver driver) throws InterruptedException
    {
    	Utility_V.scrollIntoView(driver, CheckBox);
    	Thread.sleep(1000);
    	contentDropDown.click();
    	Select s=new Select(contentDropDown);
    	s.selectByIndex(1);
    	Reporter.log("Selecting content");
    }
    
    public void SelectApproval(WebDriver driver) throws InterruptedException
    {
    	Utility_V.scrollIntoView(driver, CheckBox);
    	Thread.sleep(1000);
    	approvalDropDown.click();
    	Select s=new Select(approvalDropDown);
    	s.selectByValue("Yes, my company does have a vendor approval process");
    	Reporter.log("Selecting approval");
    }
    
    public void enterMessage(WebDriver driver, String msg) throws InterruptedException
    {
    	Utility_V.scrollIntoView(driver, CheckBox);
    	Thread.sleep(1000);
    	message.sendKeys(msg);
    	Reporter.log("Entering message");
    }
    
    public void clickSubmit()
    {
    	subBtn.click();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
