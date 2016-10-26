package application_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constants.IResourceConstant;

public class CreateOceanProfileCompletionPageModel {
	
	public WebElement continueToYourJourneyPage(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("fa fa-arrow-circle-o-right continue-to-journeys__icon___G-DpE"));
	}
	
	public WebElement createProfileForGuests(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("profile-created__guests___3BmN4"));
	}

}
