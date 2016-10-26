package application_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constants.IResourceConstant;

public class MyCompassChangePasswordModel {

	
	public WebElement changePasswordHeading(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//h2[contains(text(),'Change Password')]"));
	}
	
	public WebElement currentPasswordLabel(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//label[contains(@for,'undefined-undefined-CurrentPassword')]"));
	}
	
	public WebElement newPasswordLabel(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//label[contains(@for,'undefined-undefined-NewPassword')]"));
	}
	
	public WebElement confirmNewPasswordLabel(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//label[contains(@for,'undefined-undefined-ConfirmNewPassword')]"));
	}
	
	public WebElement currentPassword(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-CurrentPassword')]"));
	}
	
	public WebElement newPassword(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-NewPassword')]"));
	}
	
	public WebElement confirmNewPassword(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-ConfirmNewPassword')]"));
	}

	public WebElement changePasswordButton(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[contains(text(),'Change Password')]"));
	}
	

	public WebElement cancelButton(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
	}


	public WebElement changePasswordText(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[contains(text(),'Change Login ID')]"));
	}
	
	public WebElement cancelText(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
	}
}
