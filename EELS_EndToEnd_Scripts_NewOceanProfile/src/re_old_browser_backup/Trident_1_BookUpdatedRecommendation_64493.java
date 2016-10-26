package re_old_browser_backup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

import application_Controller.InterestPageController;
import application_Controller.JourneyPageController;
import application_Controller.RecommendationController;
import application_Controller.SelectInterestsPageController;
import application_Controller.SignUpPageController;
import constants.IResourceConstant;
import integration.testrail.ExcelReportGenerator;
import application_Controller.CreateOceanProfileCompletionPageController;

public class Trident_1_BookUpdatedRecommendation_64493 {
	       private Logger Log = Logger.getLogger(Trident_1_BookUpdatedRecommendation_64493.class.getName());

@Test
	public  void BookUpdatedRecommendation() throws IOException {
	
	SignUpPageController Controller = new SignUpPageController();
	    InterestPageController InterestPageController = new InterestPageController();
	   JourneyPageController JourneyPageController = new JourneyPageController();
	   RecommendationController RecommendationController = new RecommendationController();
//  	  LoginPageController LoginController = new LoginPageController();
	   Controller.clickLogInBubble();
	//   Controller.waitForLoad();
	  Controller.signIn();
	  Log.info("SIgn In Button has been clicked");

	
  
    
		

  	
  	
  
    //select Fitness
    
//	 SelectInterests.selectInterestBubbleFitness();
	    Controller.waitForLoad();

	// SelectInterests.selectInterestBubbleRelaxation();
	// SelectInterests.selectInterestBubblePhotography();
    
    // to click create profile
	/* SelectInterests.clickCreateProfileButton();

    
	// click on continue to your journeys
	 CreateOceanProfileCompletionPageController.clickContinueToYourJourneyPage();
	//	select day 7
	 JourneyPageController.clickDay7();   
//Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='voyage-subview-root']/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/span")).isEnabled(), true);		 
    Controller.waitForLoad();

// Click on Add event
    JourneyPageController.clickMorningAddEvent1();    
//Assert.assertEquals("Add Event is disabled", "Add Event is enabled");
Controller.waitForLoad();


 
	//choose recommendation
RecommendationController.clickFirstRecommendation();
	// click on purchase
RecommendationController.clickPurchaseButtonButton();
	 //again purchase 
RecommendationController.clickPurchaseButtonButton();

	 // click on close button
RecommendationController.clickCrossButton();
	 //click on close excursion
	  */
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
		//	Controller.closeURL();
			  Log.info   ("Browser closed");
	  }

}