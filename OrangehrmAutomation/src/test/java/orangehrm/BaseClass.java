package orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass 
{
	static WebDriver driver;
	@BeforeSuite
	public void setUp()
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("Browser launched successfully");
	}
	
	@AfterSuite
	public void tearDown()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.quit();
		System.out.println("Browser closed successfully");
	}
}
