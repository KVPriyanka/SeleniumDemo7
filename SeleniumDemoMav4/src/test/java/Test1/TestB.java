package Test1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestB {
	@Test
	public void testAssert1() {
		Reporter.log("Step1",true);
		Assert.assertEquals("abc", "abc");
		Reporter.log("Step2",true);
		Assert.assertEquals("abc", "xyz");
		Reporter.log("Step3",true);
	}

}
