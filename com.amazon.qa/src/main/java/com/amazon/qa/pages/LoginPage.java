package com.amazon.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.util.TestUtil;

public class LoginPage extends TestBase{
	@FindBy(xpath="//a[@id='nav-link-yourAccount']")
	WebElement accountbtn;
	
	@FindBy(xpath="//span[@class='nav-line-3']")
	WebElement signinbtn;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement usercontinuebtn;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//input[@placeholder='Type characters']")
	WebElement captchaip;
	
	@FindBy(xpath="//span[@class='nav-sprite nav-logo-base']")
	WebElement amazonlogo;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement continueshopingbtn;
	
	
	
	//Initializing the page Objects	
	public LoginPage() {
			
			PageFactory.initElements(driver, this);
			
			
		}
	//Actions
	 public String ValidateLoginPageTitle() {
			
			return driver.getTitle();
			
			
		}
	 
	 public boolean validateamazoniamge(){
		 return amazonlogo.isDisplayed();
	 }
	 
	 public HomePage login(String un, String pwd) { 
		
		 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		username.sendKeys(un); 
		usercontinuebtn.click();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
	 }
	
}
