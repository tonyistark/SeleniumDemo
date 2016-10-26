package r09_SignupandLogin_Chrome;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import application_Controller.SignUpPageController;
import constants.IResourceConstant;
import integration.testrail.ExcelReportGenerator;

public class ParentClass {
	private Logger Log = Logger.getLogger(Trident_SignupPage_Field_Validations_98978.class.getName());

	
	public void beforeMethod() throws InterruptedException {
	      DOMConfigurator.configure("log4j.xml");   
	      SignUpPageController Controller = new SignUpPageController();
	     Controller.openURL("Chrome");
	      Log.info("Portal Application Launched");
	     Controller.maximizeURL();        
	    // Controller.waitForLoad();
	      Log.info("Implicit Wait applied on portal for 10 seconds");
	      Controller.switchFrame();
	      
	      Log.info("Driver switched to correct frame");
	}
	
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
