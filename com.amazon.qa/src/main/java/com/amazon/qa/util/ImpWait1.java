package com.amazon.qa.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImpWait1 {

	
	
	
	public static WebDriver driver ;

	public  void implwait() {
			
		driver = new ChromeDriver();	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  ///TestUtil.IMPLICIT_WAIT
	System.out.println("===== login successfull======");
	driver.quit();
}


}
