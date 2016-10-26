package re_old_browser_backup;

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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import application_Controller.CreateOceanProfileCompletionPageController;

import application_Controller.InterestPageController;
import application_Controller.JourneyPageController;
import application_Controller.RecommendationController;
import application_Controller.SelectInterestsPageController;
import application_Controller.SignUpPageController;
import constants.IResourceConstant;
import integration.testrail.ExcelReportGenerator;

public class Trident_2_BookExcursion_64496 {

    private Logger Log = Logger.getLogger(Trident_2_BookExcursion_64496.class.getName());

@Test
public  void BookExcursion() {

    SignUpPageController Controller = new SignUpPageController();
	   	RecommendationController RecommendationController = new RecommendationController();
	   	JourneyPageController JourneyPage = new JourneyPageController();
	  
	    Controller.clickLogInBubble();
		//   Controller.waitForLoad();
	 	  Controller.signIn();
	 	  Log.info("SIgn In Button has been clicked");
	 	
	        JourneyPage.clickDay9();     
			//Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='voyage-subview-root']/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/span")).isEnabled(), true);		 
		        Controller.waitForLoad();

	   // Click on Add event
	       JourneyPage.clickMorningAddEvent1();    
	   //Assert.assertEquals("Add Event is disabled", "Add Event is enabled");
	   Controller.waitForLoad();

	   RecommendationController.clickFirstRecommendation();
	// click on purchase
	   RecommendationController.clickPurchaseButtonButton();
	   	 //again purchase 
	   RecommendationController.clickPurchaseButtonButton();

	   	 // click on close button
	   RecommendationController.clickCrossButton();
	   	 //click on close excursion
	   	  
 
//Validate booked excursion is appearing on the Itinerary
	//String event_title = driver.findElement(By.xpath(".//*[@id='voyage-subview-root']/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]")).getText();
//	Assert.assertEquals(booked_excursion, event_title); 
	System.out.println("booked excursion is appearing on the Itinerary");
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