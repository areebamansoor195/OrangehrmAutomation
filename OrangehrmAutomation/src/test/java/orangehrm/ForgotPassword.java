package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ForgotPassword extends BaseClass
{
	@Test
	public void forgot()
	{
		WebElement forgotLink=driver.findElement(By.linkText("Forgot your password?"));
		forgotLink.click();
		System.out.println("Forgot password link clicked successfully");
		
		WebElement resetBtn=driver.findElement(By.id("btnSearchValues"));
		resetBtn.click();
		System.out.println("Reset button clicked successfully");
	}
}
