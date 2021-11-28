package orangehrm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class validateTitle extends BaseClass
{
	@Test
	public void Title()
	{
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "OrangeHRM";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Title fetch successfully");
	}
}
