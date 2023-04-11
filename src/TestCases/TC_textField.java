package TestCases;

import org.testng.annotations.Test;

import BaseClass_VisuerLab.BaseClass_V;
import POM_VisuerLab.FormPage;
import POM_VisuerLab.HomePage;
import UtilityClass_VisuerLab.Utility_V;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;

public class TC_textField extends BaseClass_V
{     
	HomePage hp;
	FormPage fp;
	
	@BeforeClass
   public void launchVisuer()
   {
		launchBrowser();
		hp=new HomePage(driver);
		fp=new FormPage (driver);
   }

  @BeforeMethod
  public void beforeMethod() throws InterruptedException
  {
	  hp.ClickButton();
	  Utility_V.ImplicitWait(500, driver);
	  
  }
  
  @Test
  public void validatingTextField() throws EncryptedDocumentException, IOException
  {
	  fp.enterName(Utility_V.readFromExcel(0, 0));
	  Utility_V.ImplicitWait(1000, driver);
	  
  }
  
@Test(priority=1)
public void validatingCompanyField() throws EncryptedDocumentException, IOException
{
	  fp.enterCompany(Utility_V.readFromExcel(1, 0));
	  Utility_V.ImplicitWait(1000, driver);
	  
 }

@Test(priority=2)
public void validatingEmailField() throws EncryptedDocumentException, IOException
{
	fp.enterEmail(Utility_V.readFromExcel(2, 0));
	Utility_V.ImplicitWait(1000, driver);
}

@Test(priority=3)
public void validatingNoField() throws EncryptedDocumentException, IOException
{
	fp.NumField(Utility_V.readFromExcel(3, 0));
	Utility_V.ImplicitWait(1000, driver);
}

@Test(priority=4)
public void validatingIndustryDropDown() throws InterruptedException
{
	fp.SelectIndustry();
	Utility_V.ImplicitWait(1000, driver);
}

@Test(priority=5)
public void validatingProjectDropDown() throws InterruptedException
{
	fp.SelectProject();
	Utility_V.ImplicitWait(1000, driver);
}

@Test(priority=6)
public void validatingProgramDropDown() throws InterruptedException
{
	fp.SelectProgram();
	Utility_V.ImplicitWait(1000, driver);
}

@Test(priority=7)
public void validatingCheckBox()
{
	fp.SelectECheckBox();
	Utility_V.ImplicitWait(1000, driver);
}

@Test(priority=8)
public void validatingBudgetDropDown() throws InterruptedException
{
	fp.SelectBudget(driver);
	Utility_V.ImplicitWait(1000, driver);
}

@Test(priority=9)
public void validatingTimelineDropDown() throws InterruptedException
{
	fp.SelectTimeline(driver);
	Utility_V.ImplicitWait(1000, driver);
}

@Test(priority=10)
public void validatingContentDropDown() throws InterruptedException
{
	fp.SelectContent(driver);
	Utility_V.ImplicitWait(1000, driver);
}

@Test(priority=11)
public void validatingApprovalDropDown() throws InterruptedException
{
	fp.SelectApproval(driver);
	Utility_V.ImplicitWait(1000, driver);
}

@Test(priority=12)
public void validatingMessageField() throws EncryptedDocumentException, IOException, InterruptedException
{
	fp.enterMessage(driver, Utility_V.readFromExcel(4, 0));
	Utility_V.ImplicitWait(1000, driver);
}
  

  
  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
