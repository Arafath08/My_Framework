package com.amazon.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.util.TestUtil;

public class PaymentPage extends TestBase {
	
	@FindBy(xpath="//body/div[contains(@class,'checkout checkout-as checkout-as-desktop')]/div[contains(@class,'a-container')]/div[contains(@class,'clearfix')]/form[1]/div[1]/div[1]/div[2]/span[1]/a[1]")
	WebElement deleverybutton;
	
	@FindBy(xpath="//div[contains(@class,'a-row a-spacing-medium')]//span[1]//span[1]//input[1]")
	WebElement delcontinuebtn;
public PaymentPage() {
		
		PageFactory.initElements(driver, this);
			
	}
public void	payment() {
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	deleverybutton.click();
	
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	delcontinuebtn.click();
}
	
}
