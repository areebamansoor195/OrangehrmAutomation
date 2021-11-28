package orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Logout extends BaseClass
{
	public void logout() throws InterruptedException
	{
	WebElement welcome=driver.findElement(By.id("welcome"));
	welcome.click();
	System.out.println("Welcome clicked successfully");
	
	Actions obj = new Actions(driver);
	
	WebElement locator= driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
	System.out.println("Logout clicked successfully");
	
	Thread.sleep(200);
	obj.moveToElement(locator).perform();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
