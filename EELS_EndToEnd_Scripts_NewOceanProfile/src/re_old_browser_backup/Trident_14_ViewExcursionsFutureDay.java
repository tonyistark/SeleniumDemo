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
import org.openqa.selenium.chrome.ChromeDriver;
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

public class Trident_14_ViewExcursionsFutureDay {

    public WebDriver driver;
    private Logger Log = Logger.getLogger(Trident_14_ViewExcursionsFutureDay.class.getName());

@Test
public  void ViewExcursionsFutureDay() {
	  SignUpPageController Controller = new SignUpPageController();
	    InterestPageController InterestPageController = new InterestPageController();
	   JourneyPageController JourneyPageController = new JourneyPageController();
	   RecommendationController RecommendationController = new RecommendationController();
//	  LoginPageController LoginController = new LoginPageController();
	   Controller.clickLogInBubble();
	//   Controller.waitForLoad();
	  Controller.signIn();
	  Log.info("SIgn In Button has been clicked");

	
		 //   Controller.waitForLoad();
	  Controller.waitForLoad();
                                                       
                       //driver.findElement(By.xpath(".//*[@id='voyage-subview-root']/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]")).click();
       // Click on Add event
        JourneyPageController.clickMorningAddEvent1();
                       //Assert.assertEquals("Add Event is disabled", "Add Event is enabled");
                      // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                       //validate the recommendations popup
                     //For Chrome
                       //boolean fact = (driver.findElement(By.cssSelector("#modal>div>div>div>div.modal-header>div.modal-subtitle")).isDisplayed());
        boolean fact = RecommendationController.modalSubtitleIsDisplayed();             
        System.out.println("event displayed : "+fact);
                       Assert.assertEquals(fact, true);
                      // String actual = driver.findElement(By.cssSelector("#modal>div>div>div>div.modal-content>div>div>div>div.events-list-event-body>div.events-list-event-title")).getText();
                       String actual = RecommendationController.getEventTitle();
                       System.out.println(actual);                 
                     //Select detailed itinerary
                       //driver.findElement(By.cssSelector("#modal>div>div>div>div.modal-content>div>div>div>div.events-list-event-body>div.events-list-event-title")).click();               
                      // String recomm = driver.findElement(By.cssSelector("#modal>div>div>div>div.modal-content>div.event-details>div.event-details-body>div.event-details-info>div:nth-child(1)")).getText();
                      String recomm = RecommendationController.getDetailedItinerary();
                       System.out.println(recomm);    
                       Assert.assertEquals(actual, recomm);                 
       
/*For Firefox
boolean fact = (driver.findElement(By.xpath(".//*[@id='modal']/div/div/div/div[3]/div/div/div/div[2]/div[1]")).isDisplayed());
System.out.println(fact);
Assert.assertEquals(fact, true);


String actual = driver.findElement(By.xpath(".//*[@id='modal']/div/div/div/div[3]/div/div/div/div[2]/div[1]")).getText();
System.out.println(actual);


////Select detailed itenary
driver.findElement(By.xpath(".//*[@id='modal']/div/div/div/div[3]/div/div/div/div[2]/div[1]")).click();

String recomm = driver.findElement(By.xpath(".//*[@id='modal']/div/div/div/div[2]/div[1]/div[2]/div[2]/div[1]")).getText();
System.out.println(recomm);    
Assert.assertEquals(actual, recomm); */
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