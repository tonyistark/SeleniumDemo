package re_old_browser_backup;

import org.testng.annotations.Test;


import application_Controller.SignUpPageController;

import constants.IResourceConstant;
import integration.testrail.ExcelReportGenerator;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;


public class Trident_4_VerifyLogin_PasswordAndNoUsername_64504 {
	     
    private static Logger Log = Logger.getLogger(Trident_4_VerifyLogin_PasswordAndNoUsername_64504.class.getName());
       
  @Test
  public void PasswordAndNoUsername() {
     
	  SignUpPageController Controller = new SignUpPageController();
	
	   Controller.clickLogInBubble();
	   Controller.signIn("", "OCean" );
	   Assert.assertEquals(true, Controller.logInButtonDisplayed());
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
      DOMConfigurator.configure("log4j.xml");   
      SignUpPageController Controller = new SignUpPageController();
	  	String dpath = IResourceConstant.class.getClassLoader().getResource("./").getPath();
		dpath = dpath.replaceAll("bin", "chromedriver.exe");
		  System.setProperty("webdriver.chrome.driver",dpath); 

      Controller.openURL("Chrome");
      Log.info("Portal Application Launched");
     Controller.maximizeURL();        
     Controller.waitForLoad();
      Log.info("Implicit Wait applied on portal for 10 seconds");
      Controller.switchFrame();
      
      Log.info("Driver switched to correct frame");
}

  @AfterMethod
  public void afterMethod(ITestResult testResult) throws Exception {

	  if (testResult.getStatus() == ITestResult.FAILURE) {
	  System.out.println(testResult.getStatus());

	  File scrFile = ((TakesScreenshot) IResourceConstant.CURRENT_BROWSER).getScreenshotAs(OutputType.FILE);
	  String npath = ExcelReportGenerator.class.getClassLoader().getResource("./").getPath();
		npath = npath.replaceAll("bin", "src");
		System.out.println(npath);
		  String Path = npath + "../Screenshot/" +testResult.getName()+ new SimpleDateFormat("_dd-MM-yyyy_hh-mm-ss").format(new GregorianCalendar().getTime()) + ".jpg";
	  FileUtils.copyFile(scrFile, new File(Path));
	  }
	  //Close Browser
	  SignUpPageController Controller = new SignUpPageController();
	Controller.closeURL();
	  Log.info   ("Browser closed");
  }

}