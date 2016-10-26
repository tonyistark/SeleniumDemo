package r09_SignupandLogin_Chrome;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import application_Controller.SignUpPageController;
import constants.IResourceConstant;
import integration.testrail.ExcelReportGenerator;

public class Trident_Login_Page_Login_PassAndRememberMe_Check_99035 {
	private static Logger Log = Logger.getLogger(Trident_Login_Page_EmailAddress_Not_Registered_99030.class.getName());

	@Test
	public void Login_Page_Login_PassAndRememberMe_Check() {

		SignUpPageController controller = new SignUpPageController();

		controller.clickLogInBubble();
		controller.checkRememberMeLogIn();
		controller.signIn("", "Poseidon@123");
		Assert.assertEquals(true, controller.emailAddressSignUpDisplayed());

	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		DOMConfigurator.configure("log4j.xml");
		SignUpPageController controller = new SignUpPageController();
		String dpath = IResourceConstant.class.getClassLoader().getResource("./").getPath();
		dpath = dpath.replaceAll("bin", "chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", dpath);

		controller.openURL("Chrome");
		Log.info("Portal Application Launched");
		controller.maximizeURL();
		controller.waitForLoad();
		Log.info("Implicit Wait applied on portal for 10 seconds");
		controller.switchFrame();

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
			String Path = npath + "../Screenshot/" + testResult.getName()
					+ new SimpleDateFormat("_dd-MM-yyyy_hh-mm-ss").format(new GregorianCalendar().getTime()) + ".jpg";
			FileUtils.copyFile(scrFile, new File(Path));
		}
		// Close Browser
		SignUpPageController controller = new SignUpPageController();
		controller.closeURL();
		Log.info("Browser closed");
	}

}
