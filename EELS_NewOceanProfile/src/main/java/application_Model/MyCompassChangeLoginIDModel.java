package application_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constants.IResourceConstant;

public class MyCompassChangeLoginIDModel {
	
	public WebElement changeLoginIdHeading(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//h2[contains(text(),'Change Login ID')]"));
	}
	
	public WebElement currentLoginEmailLabel(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//label[contains(@for,'undefined-undefined-CurrentLoginEmail')]"));
	}
	
	public WebElement newLoginEmailLabel(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//label[contains(@for,'undefined-undefined-NewLoginEmail')]"));
	}
	
	public WebElement currentLoginEmail(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-CurrentLoginEmail')]"));
	}
	
	public WebElement newLoginEmail(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-NewLoginEmail')]"));
	}
	

	public WebElement changeLoginIdButton(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[contains(text(),'Change Login ID')]"));
	}
	

	public WebElement cancelButton(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
	}


	public WebElement changeLoginIdText(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[contains(text(),'Change Login ID')]"));
	}
	
	public WebElement cancelText(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[contains(text(),'Cancel')]"));
	}
}
