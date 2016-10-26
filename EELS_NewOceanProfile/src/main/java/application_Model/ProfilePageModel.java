package application_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constants.IResourceConstant;

public class ProfilePageModel {

	public WebElement interestsButton() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.cssSelector("a.primary-button.taste-profile-button"));
	}

	public WebElement princessLogoButton() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//img[@class='top-image']"));
	}

	public WebElement eastCarribean() {

		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.xpath("//div[text()='Eastern Caribbean with Antigua']"));
	}

	public WebElement southCarribean() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[text()='Southern Caribbean']"));
	}

	public WebElement westCarribean() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[text()='Western Caribbean Getaway']"));
	}

	public WebElement profile() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@class='profile-title']"));

	}

	public WebElement myJourney() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@class='h2 center-journey-title']"));

	}

	public WebElement hamburger() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("subnav-menu"));

	}

	   public WebElement logout(){
	    	 return IResourceConstant.CURRENT_BROWSER.findElement(By.className("signout-link.subnav-link"));
	    	 
	     }

}
