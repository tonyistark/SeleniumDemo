package constants;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.remote.DesiredCapabilities;



public class IResourceConstant {
	public static final String WEB_URL = "https://dev.uiexm.com/client/#preview/A41116E906494953BA1A575077121F42";
	
	//public static final WebDriver CURRENT_BROWSER = new FirefoxDriver();
	//public static final WebDriver CURRENT_BROWSER = new ChromeDriver();
		public static  WebDriver CURRENT_BROWSER = null;
		
		

		public IResourceConstant(String browser)
		{
		
			//String driver = browser;
			if(browser=="Chrome")
			{
						CURRENT_BROWSER = new ChromeDriver();

			}
			else
				if(browser=="FireFox")
					CURRENT_BROWSER = new FirefoxDriver();
				else
					{
					  	DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					   capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
					   true); 
					  

					CURRENT_BROWSER = new InternetExplorerDriver(capabilities);
					}

					

		}
	
}
