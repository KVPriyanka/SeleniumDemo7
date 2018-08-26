package Pack;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class Test {
	@org.testng.annotations.Test
	public void test() {
		Reporter.log("Step1",true);
		Assert.assertEquals("abc", "abc");
		Reporter.log("Step2",true);
		Assert.assertEquals("abc", "xyz");
		Reporter.log("Step3",true);
	}


}
