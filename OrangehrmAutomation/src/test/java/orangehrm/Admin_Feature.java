package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Admin_Feature extends BaseClass
{
	@Test
	public void Admin() throws InterruptedException
	{
		//Menu handling
		//Create object on Action class
		WebElement admin=driver.findElement(By.id("menu_admin_viewAdminModule"));
		new Actions(driver).moveToElement(admin).perform();
		System.out.println("Admin selected successfully");
		
		Thread.sleep(2000);
	
		WebElement userManagement=new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.id("menu_admin_UserManagement")));
		new Actions(driver).moveToElement(userManagement).perform();
		System.out.println("User Management hover successfully");
		
		WebElement users =new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.id("menu_admin_viewSystemUsers")));
		users.click();
		System.out.println("Users clicked successfully");
	}
}
