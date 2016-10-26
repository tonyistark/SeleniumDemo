package application_Controller;

import application_Model.CreateOceanProfileCompletionPageModel;

public class CreateOceanProfileCompletionPageController {
	CreateOceanProfileCompletionPageModel CreateOceanProfileCompletionPage = new CreateOceanProfileCompletionPageModel();
	
	public void clickContinueToYourJourneyPage(){
		CreateOceanProfileCompletionPage.continueToYourJourneyPage().click();
	}
	public void clickcreateProfileForGuests(){
		CreateOceanProfileCompletionPage.createProfileForGuests().click();
	}
}
