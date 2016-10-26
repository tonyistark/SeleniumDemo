package re_old_browser_backup;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
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
public class Trident_14_AuthenticatedGuestCancelsExcursion {


    public WebDriver driver;
    private Logger Log = Logger.getLogger(Trident_14_AuthenticatedGuestCancelsExcursion.class.getName());

@Test
public  void CancelsExcursion() {
//Find elements for username, password, and sign in button

	SignUpPageController Controller = new SignUpPageController();
	   InterestPageController InterestPageController = new InterestPageController();
	   JourneyPageController JourneyPageController = new JourneyPageController();
	   RecommendationController RecommendationController = new RecommendationController();
//	  LoginPageController LoginController = new LoginPageController();
	   Controller.clickLogInBubble();
	//   Controller.waitForLoad();
	  Controller.signIn();
	  Log.info("SIgn In Button has been clicked");

	
			//	select day 7
			 JourneyPageController.clickDay7();   
		//Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='voyage-subview-root']/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/span")).isEnabled(), true);		 
		    Controller.waitForLoad();
	
  
        
        // Click on Booked Excursion
        RecommendationController.clickBookedRecommendation();
        
        //Validation
        RecommendationController.validateBookedExcursion(); 
                          
                     

//Click Cancel
//driver.findElement(By.xpath(".//*[@id='modal']/div/div/div/div[2]/div[2]")).click();
        RecommendationController.clickCancel();

//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        /*
String loc = driver.findElement(By.xpath(".//*[@id='modal']/div/div/div/div[2]/div[1]/div[3]/div/table/tbody/tr[1]/td[1]")).getText();
String dep = driver.findElement(By.xpath(".//*[@id='modal']/div/div/div/div[2]/div[1]/div[3]/div/table/tbody/tr[2]/td[1]")).getText();
String ret = driver.findElement(By.xpath(".//*[@id='modal']/div/div/div/div[2]/div[1]/div[3]/div/table/tbody/tr[3]/td[1]")).getText();
String Ordertot = driver.findElement(By.xpath(".//*[@id='modal']/div/div/div/div[2]/div[1]/div[3]/div/table/tbody/tr[4]/td[1]")).getText();



System.out.println(loc);
System.out.println(dep);
System.out.println(ret);
System.out.println(Ordertot);
*/
		    
Assert.assertEquals(RecommendationController.loc(), "Location:");
Assert.assertEquals(RecommendationController.dep(), "Depart:");
Assert.assertEquals(RecommendationController.ret(), "Return:");
Assert.assertEquals(RecommendationController.Ordertot(), "Order Total:");
//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
/*
//Validate excursion is booked
Assert.assertEquals(driver.findElement(By.xpath(".//*[@id='voyage-subview-root']/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]")).getText(),recomm);
System.out.println("Excursion remained booked");

//Click on Booked Excursion
driver.findElement(By.xpath(".//*[@id='voyage-subview-root']/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]")).click();

//Click Cancel
driver.findElement(By.xpath(".//*[@id='modal']/div/div/div/div[2]/div[2]")).click();

//Click yes,Cancel
driver.findElement(By.xpath(".//*[@id='modal']/div/div/div/div[2]/div[2]")).click();

//Validate close button is displayed
Assert.assertEquals(true, driver.findElement(By.xpath(".//*[@id='modal']/div/div/div/div[2]/div[2]")).isDisplayed());

//Click on close button
driver.findElement(By.xpath(".//*[@id='modal']/div/div/div/div[2]/div[2]")).click();

//Validate excursion is not booked
Assert.assertNotEquals(driver.findElement(By.xpath(".//*[@id='voyage-subview-root']/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]")).getText(),recomm);
System.out.println("Excursion is not booked");
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
