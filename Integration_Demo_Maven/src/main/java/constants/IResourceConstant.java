package constants;


import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import net.anthavio.phanbedder.Phanbedder;
import org.apache.commons.compress.utils.IOUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.*;

//import org.openqa.selenium.phantomjs.PhantomJSDriver;



public class IResourceConstant {
	public static final String WEB_URL = "https://dev.uiexm.com/client/#preview/F3EAE3313FB94722B7020CF42EE4C326";
	
	//public static final WebDriver CURRENT_BROWSER = new FirefoxDriver();
	//public static final WebDriver CURRENT_BROWSER = new ChromeDriver();
		public static  WebDriver CURRENT_BROWSER = null;

		

		public IResourceConstant(String browser)
		{
		
			//String driver = browser;
			if(browser.equals("Chrome"))
			{
						CURRENT_BROWSER = new ChromeDriver();

			}
			else
				if(browser.equals("FireFox")) {
					CURRENT_BROWSER = new FirefoxDriver();
				}
			else
				if(browser.equals("PhantomJS")) {
					String binary = System.getProperty("phantomjs.binary");         //access the phantomjs.binary property exposed by phantomjs-maven-plugin
					DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
					capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, binary);

					CURRENT_BROWSER = new PhantomJSDriver(capabilities);
				}
				else
					{
                        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					   capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
					   true); 
					  

					CURRENT_BROWSER = new InternetExplorerDriver(capabilities);
					}

					

		}
	
}
