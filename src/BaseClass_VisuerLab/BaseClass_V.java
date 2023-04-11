package BaseClass_VisuerLab;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass_V
{
	protected WebDriver driver;
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		ChromeOptions cp=new ChromeOptions();
		
		cp.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(cp);
		
		driver.get("https://www.visuerlab.com/");
		driver.manage().window().maximize();
		
		
		
	}

}
