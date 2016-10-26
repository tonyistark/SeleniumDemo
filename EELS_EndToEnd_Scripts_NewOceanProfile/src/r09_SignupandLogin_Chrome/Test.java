package r09_SignupandLogin_Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	
	public static void main(String [] args)
	{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
		System.out.println(driver.getTitle());
	}

}
