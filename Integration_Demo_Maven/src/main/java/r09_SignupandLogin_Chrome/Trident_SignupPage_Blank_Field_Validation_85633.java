package r09_SignupandLogin_Chrome;
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
import application_Controller.SignUpPageController;
import constants.IResourceConstant;
import integration.testrail.ExcelReportGenerator;
public class Trident_SignupPage_Blank_Field_Validation_85633 {
	private Logger Log = Logger.getLogger(Trident_SignupPage_Blank_Field_Validation_85633.class.getName());
	@Test
 	public  void SignupPage_Multiple_Field_Blank() throws IOException {
	 SignUpPageController signUpPageController = new SignUpPageController();
	 signUpPageController.clickSignUpBubble();
	 signUpPageController.enterFirstNameSignUp("");
	 signUpPageController.enterLastNameSignUp("");
	 signUpPageController.enterEmailIdLogIn("");
	 signUpPageController.clickSignUpButton();
	 Assert.assertEquals(signUpPageController.getLogInError(), "Email cannot be blank");
	
	 
	}
	 @BeforeMethod
	 public void beforeMethod() throws InterruptedException {
	      DOMConfigurator.configure("log4j.xml");   
	      SignUpPageController Controller = new SignUpPageController();
	     Controller.openURL("PhantomJS");
	      Log.info("Portal Application Launched");
	     Controller.maximizeURL();        
	    // Controller.waitForLoad();
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




