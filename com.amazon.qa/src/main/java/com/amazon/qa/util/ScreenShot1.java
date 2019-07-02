package com.amazon.qa.util;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot1 {

	
	
	
	
	
	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

		  

		  //Convert web driver object to TakeScreenshot

		     TakesScreenshot MyShot =((TakesScreenshot)webdriver);

		     

		     //Call getScreenshotAs method to create image file

		     File SrcFile=MyShot.getScreenshotAs(OutputType.FILE);



		         //Move image file to new destination

		             File DestFile=new File(fileWithPath);



		             //Copy file at destination

		             FileUtils.copyFile(SrcFile, DestFile );

		             }
}
