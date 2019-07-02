package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.base.TestBase;

public class LoginPageTest extends TestBase{

	
	LoginPage loginpage;
	HomePage homepage;//global variable
	
	public LoginPageTest() {
		super();
		}
	@BeforeMethod
	public void setup() {
		initialization();
		
		 loginpage = new LoginPage();
		
	}
	
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		
		String title=loginpage.ValidateLoginPageTitle();;
		Assert.assertEquals(title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	@Test(priority=2)
	public void amazonlogoTest() {
		
		boolean flag=loginpage.validateamazoniamge();
		Assert.assertTrue(flag);
	}
	@Test(priority=0)
	public void loginTest() {
		
	  homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
