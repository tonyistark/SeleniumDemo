package r10.Part_two_Chrome;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import application_Controller.MyCompassAddPaymentController;
import application_Controller.MyCompassChangeLoginIDController;
import application_Controller.MyCompassPageController;
import application_Controller.SignUpPageController;

public class Trident_ManageOceanAccount_T110906 {
	private Logger Log = Logger.getLogger(Test.class.getName());
	@Test
	public void test1() throws InterruptedException{
		
		SignUpPageController controller = new SignUpPageController();
		MyCompassPageController MyCompassPageController = new MyCompassPageController();
		MyCompassAddPaymentController MyCompassAddPaymentController = new MyCompassAddPaymentController();
		MyCompassChangeLoginIDController MyCompassChangeLoginIDController = new MyCompassChangeLoginIDController();
		controller.clickMyCompass();
		//controller.wait();
		 synchronized(this){//synchronized block  
		      try{ 

		       Thread.sleep(400);  
		  		controller.signIn("test-user132@accenture.com", "Welcome1");

		      }catch(Exception e){System.out.println(e);}  
		       
		   }  
		 MyCompassPageController.printTitle();
		 
		 synchronized(this){//synchronized block  
			 
		      try{ 

		       Thread.sleep(400);
		      
				MyCompassPageController.clickChangeLoginId();

		     }catch(Exception e){System.out.println(e);}  
		       
		   }  

		//controller.wait();
				 MyCompassPageController.printTitle();
				 
				 MyCompassChangeLoginIDController.enterNewLoginId("invalid");
				 MyCompassChangeLoginIDController.clickCancel();
				 Assert.assertEquals( MyCompassPageController.printTitle(),"Experience Manager" );
   //validation of error message
	
		 
	}

	
	 @BeforeMethod
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

	  @AfterMethod
	  public void afterMethod(ITestResult testResult) throws Exception {

		/*  if (testResult.getStatus() == ITestResult.FAILURE) {
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
		  Log.info   ("Browser closed");  */
	  }

}



