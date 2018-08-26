package Test1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestE {
	@Test(priority=1, groups="smoke")
	public void testCaseOne() {
		Reporter.log("TestCase 1",true);
	}
	@Test(priority=2, groups="regression")
	public void testCaseTwo() {
		Reporter.log("TestCase 2",true);
	}
	@Test(priority=3, groups="regression")
	public void testCaseThree() {
		Reporter.log("TestCase 3",true);
	}
	@Test(priority=4, groups="regression")
	public void testCaseFour() {
		Reporter.log("TestCase 4",true);
	}


}
