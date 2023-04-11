package UtilityClass_VisuerLab;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Utility_V
{
	// Excel
	// Screenshot
	//wait
	
	public static String readFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("C:\\Users\\91942\\Documents\\Auto.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet6");
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	public static void ImplicitWait(int time, WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
	
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\91942\\Documents\\Automation document\\screenshot.png");
		FileHandler.copy(scr, dest);
		
	}
	
	public static void scrollIntoView(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element);
		act.perform();
	}

}
