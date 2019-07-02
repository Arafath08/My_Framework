package com.amazon.qa.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.util.TestUtil;

public class HomePage extends TestBase{

	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement globalsearch;
	
	@FindBy(xpath="//span[contains(text(),'Hello, Arafath')]")
	WebElement myname;
	
	@FindBy(xpath="//input[@value='Go']")
	WebElement globalsearchbtn;
	
	@FindBy(xpath="//li[@id='result_1']//img[contains(@class,'s-access-image cfMarker')]")
	WebElement searchitem;
	
	@FindBy(xpath="//span[contains(text(),'Choice')]")
	WebElement amazonchoice;
	
	@FindBy(xpath="//div[@id='feature-bullets']")
	WebElement gettingproducttext;
	
	@FindBy(xpath="//input[@title='Add to Shopping Cart']")
	WebElement addtocartbtn;
	
	
	
	
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
public HomePage searchproduct( ) {
	
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	globalsearch.sendKeys("one plus 6");
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	globalsearchbtn.click();
	
	
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	amazonchoice.click();
		
	
	
	return new HomePage();
	
}
	
public boolean validateamazonchoice(){
	 return amazonchoice.isDisplayed();
}	

public void tabproduct() {
	
	 String oldTab = driver.getWindowHandle();
	 ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	 newTab.remove(oldTab);
	 driver.switchTo().window(newTab.get(0));
	 
	 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		gettingproducttext.getText();
		System.out.println("Printing "+ gettingproducttext);
		System.out.println();  
		
		addtocartbtn.click();
		
		
	// driver.close();
	// driver.switchTo().window(oldTab);
	
}


}
	

