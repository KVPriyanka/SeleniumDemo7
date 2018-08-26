package actiTimeTest;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import actiTimeLib.BaseTest;
import actiTimePO.ActiTimeLoginPagePO;

public class TestLogin extends BaseTest{

	@Test(priority=1)
	public void testValidCredentials() {
		try {
			driver.get(TEST_URL);
			ActiTimeLoginPagePO loginPO=new ActiTimeLoginPagePO(driver);
			loginPO.login("gannianju", "yXeMaBeL");
			String eTitle="actiTIME - Login";
			loginPO.checkTitle(eTitle);
			String aTitle=driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {			 
			e.printStackTrace();
			Reporter.log("Exception generated", true);
			Assert.fail();
		}		
	}
	
	@Test(priority=2)
	public void testInvalidUn() {
		try {
			driver.get(TEST_URL);
			ActiTimeLoginPagePO loginPO=new ActiTimeLoginPagePO(driver);
			loginPO.login("gannianju1", "yXeMaBeL");
			loginPO.checkWebElement(loginPO.errormsg());
			boolean aStatus = loginPO.errormsg().isDisplayed();
			boolean eStatus= true;
			Assert.assertEquals(aStatus, eStatus);			
		} catch (Exception e) {			
			e.printStackTrace();
			Reporter.log("Exception generated", true);
			Assert.fail();
		}	
		
	}
	
	@Test(priority=3)
	public void testInvalidPw() {
		try {
			driver.get(TEST_URL);
			ActiTimeLoginPagePO loginPO=new ActiTimeLoginPagePO(driver);
			loginPO.login("gannianju", "yXeMaBeL1");
			loginPO.checkWebElement(loginPO.errormsg());
			boolean aStatus = loginPO.errormsg().isDisplayed();
			boolean eStatus= true;
			Assert.assertEquals(aStatus, eStatus);			
		} catch (Exception e) {			
			e.printStackTrace();
			Reporter.log("Exception generated", true);
			Assert.fail();
		}	
		
	}

	}

	