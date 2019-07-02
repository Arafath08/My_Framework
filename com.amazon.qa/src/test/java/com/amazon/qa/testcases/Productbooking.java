package com.amazon.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.CartPage;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.pages.PaymentPage;
import com.amazon.qa.util.ImpWait1;
import com.amazon.qa.util.ScreenShot1;
import com.amazon.qa.util.TestUtil;

public class Productbooking extends TestBase{

	
	
	
	LoginPage loginpage;
	HomePage homepage;//global variable
	CartPage cartpage;
	PaymentPage paymentpage;
	ImpWait1 impwait1;
	ScreenShot1 screenshot;
	
	public Productbooking() {
		super();
		}
	
	@BeforeClass
	public void setup() {
		initialization();
		
		 loginpage = new LoginPage();
		 homepage= new HomePage();
		 impwait1=new ImpWait1();
		 cartpage=new CartPage();
		 paymentpage=new PaymentPage();
		 screenshot=new ScreenShot1();
	}
	
	@Test
	public void e2eTest() throws Exception {

		
		impwait1.implwait();
		homepage.searchproduct();
		System.out.println("Search product done");
		
		//homepage.validateamazonchoice();
		System.out.println("validate amazonchoice logo done");
		homepage.tabproduct();
		
		cartpage.clickproduct();
		System.out.println("click done");
		
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		System.out.println("login done");
		
		paymentpage.payment();
		System.out.println("payment done");
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		screenshot.takeSnapShot(driver, "C:\\Users\\ap82\\com.amazon.qa\\screenshot_test_output\\test1.png") ;
		
		
	}
	

	@AfterClass
	public void teardown() {
		driver.quit();
	}
				
	
		
		
//		public  void implwait() {
//			
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  ///TestUtil.IMPLICIT_WAIT
//	}


	

}
