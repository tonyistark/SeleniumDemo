package application_Model;

import constants.IResourceConstant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyCompassChangeProfileModel {
	public WebElement newLoginMail(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[contains(@id,'undefined-undefined-NewLoginEmail')]"));
	}
	public WebElement changeLoginBtn(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='change-login-id']/div/div/div[3]/div/button/div/div/span"));
	}
	public WebElement cancelBtn(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='change-login-id']/div/div/div[3]/button/div/span"));
	}
}
