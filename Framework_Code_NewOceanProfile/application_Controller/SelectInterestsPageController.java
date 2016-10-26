package application_Controller;
import constants.*;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import application_Model.SelectInterestsPageModel;

public class SelectInterestsPageController {
	SelectInterestsPageModel SelectInterestsPageModel = new SelectInterestsPageModel();
	public String interestsHeaderMessage(){
		return SelectInterestsPageModel.interestsHeader().getText();
	}
	public String interestsMessage(){
		return SelectInterestsPageModel.interestsMessage().getText();
	}
	public void selectInterestBubbleAdventure(){
		if(SelectInterestsPageModel.interestBubbleAdventure().isSelected())
		SelectInterestsPageModel.interestBubbleAdventure().click();
	}
	public void selectInterestBubbleSightseeing(){
		if(SelectInterestsPageModel.interestBubbleSightseeing().isSelected())

		SelectInterestsPageModel.interestBubbleSightseeing().click();
	}
	public void selectInterestBubbleYouthActivities(){
		if(SelectInterestsPageModel.interestBubbleYouthActivities().isSelected())

		SelectInterestsPageModel.interestBubbleYouthActivities().click();
	}
	public void selectInterestBubbleSingles(){
		
		if(SelectInterestsPageModel.interestBubbleSingles().isSelected())

		SelectInterestsPageModel.interestBubbleSingles().click();
	}
	public void selectInterestBubbleFitness(){
		//if(SelectInterestsPageModel.interestBubbleFitness().isSelected())
	//	Actions action = new Actions(IResourceConstant.CURRENT_BROWSER);
		//action.moveToElement(SelectInterestsPageModel.interestBubbleFitness()).click().build().perform();
		SelectInterestsPageModel.interestBubbleFitness().click();
	}
	public void selectInterestBubbleHistory(){
	//	if(SelectInterestsPageModel.interestBubbleHistory().isSelected())
		SelectInterestsPageModel.interestBubbleHistory().click();
	}
	public void selectInterestBubblePhotography(){
		//if(SelectInterestsPageModel.interestBubblePhotography().isSelected())
		SelectInterestsPageModel.interestBubblePhotography().click();
	}
	public void selectInterestBubbleKidsActivities(){
		if(SelectInterestsPageModel.interestBubbleKidsActivities().isSelected())
		SelectInterestsPageModel.interestBubbleKidsActivities().click();
	}
	public void selectInterestBubbleRomantic(){
		if(SelectInterestsPageModel.interestBubbleRomantic().isSelected())
		SelectInterestsPageModel.interestBubbleRomantic().click();
	}
	public void selectInterestBubbleTeenActivities(){
		//if(SelectInterestsPageModel.interestBubbleTeenActivities().isSelected())
		SelectInterestsPageModel.interestBubbleTeenActivities().click();
	}
	public void selectInterestBubbleRelaxation(){
		if(SelectInterestsPageModel.interestBubbleRelaxation().isSelected())
		SelectInterestsPageModel.interestBubbleRelaxation().click();
	}
	public void selectInterestBubbleSocial(){
		if(SelectInterestsPageModel.interestBubbleSocial().isSelected())
		SelectInterestsPageModel.interestBubbleSocial().click();
	}
	public void selectInterestBubbleCulture(){
		if(SelectInterestsPageModel.interestBubbleCulture().isSelected())
		SelectInterestsPageModel.interestBubbleCulture().click();
	}
	public void selectInterestBubbleFamilyFun(){
		if(SelectInterestsPageModel.interestBubbleFamilyFun().isSelected())
		SelectInterestsPageModel.interestBubbleFamilyFun().click();
	}
	public void selectInterestBubbleDiningOut(){
		if(SelectInterestsPageModel.interestBubbleDiningOut().isSelected())
		SelectInterestsPageModel.interestBubbleDiningOut().click();
	}
	public void clickCreateProfileButton(){
		SelectInterestsPageModel.createProfile().click();
	}
	
}
