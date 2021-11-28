package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login extends BaseClass
{
	SoftAssert obj=new SoftAssert();
	
	@Test
	public void login()
	{
		//Enter username
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		System.out.println("Username entered successfully");
		
		//Enter password
	    WebElement password= driver.findElement(By.id("txtPassword"));
	    password.sendKeys("admin123");
	    System.out.println("Password entered successfully");
	    
	    // Click on button
	    WebElement loginBtn=driver.findElement(By.id("btnLogin"));
	    loginBtn.click();
	    System.out.println("Login button clicked successfully");
	    obj.assertEquals("OrangeHRM", "OrangeHRM");
	    
	   
	    obj.assertAll();
	}
}
