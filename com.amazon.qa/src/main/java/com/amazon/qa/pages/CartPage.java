package com.amazon.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.util.TestUtil;

public class CartPage extends TestBase {
	
	@FindBy(xpath="//a[@id='hlb-ptc-btn-native']")
	WebElement proceedbuybtn;
	
	@FindBy(xpath="//a[@id='nav-cart']")
	WebElement cartbtn;

	
	
	
	
public CartPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public void clickproduct() {
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	proceedbuybtn.click();
}
}
