package Test1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestF {
	@Test(priority=1, groups="smoke")
	public void testCasefour() {
		Reporter.log("TestCase 4",true);
	}
	@Test(priority=2, groups="smoke")
	public void testCaseFive() {
		Reporter.log("TestCase 5",true);
	}
	@Test(priority=3, groups="regression")
	public void testCasesix() {
		Reporter.log("TestCase 6",true);
	}
	@Test(priority=4, groups="regression")
	public void testCaseSeven() {
		Reporter.log("TestCase 7",true);
	}

}
