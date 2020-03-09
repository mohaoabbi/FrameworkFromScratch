package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	@Test
	public void loginAsBankManager() throws InterruptedException {
		
		log.debug("Inside LoginTest");
		driver.findElement(By.xpath(OR.getProperty("bmlBtn"))).click();
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))), "Test not Successful");

		// Thread.sleep(3000);
		log.debug("Login successfully executed !!!");
		//Assert.fail("Login not Successful");
	}

}
