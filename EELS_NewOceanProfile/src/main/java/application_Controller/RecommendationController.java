package application_Controller;

import application_Model.RecommendationModel;
import org.testng.Assert;

public class RecommendationController {

	RecommendationModel RecommendationModel = new RecommendationModel();

	public void clickFirstRecommendation() {
		RecommendationModel.selectFirstRecommendation().click();
	}

	public void clickcloseExcursionButton() {
		RecommendationModel.closeExcursionButton().click();
	}

	public void clickCrossButton() {
		RecommendationModel.crossButton().click();
	}

	public void clickPurchaseButtonButton() {
		RecommendationModel.purchaseButton().click();
	}

	public void clickDoneButton() {
		RecommendationModel.doneButton().click();
	}

	public boolean recommendationPopup() {
		boolean fact = RecommendationModel.recommendationPopupHeader().isDisplayed();
		return fact;
	}

	public String firstRecommendation() {
		return RecommendationModel.selectFirstRecommendation().getText();
	}

	public String recommValidation() {

		String actual = RecommendationModel.recDetailValidation().getText();
		System.out.println(actual);
		return actual;

	}

	public String bookRecommValidation() {

		String rec = RecommendationModel.recDetailValidation().getText();
		System.out.println(rec);
		return rec;

	}

	public void clickBookedRecommendation() {
		RecommendationModel.bookedRecommendation().click();
	}

	public void validateBookedExcursion() {
		String string1 = RecommendationModel.recDetailValidation().getText();
		String string2 = RecommendationModel.bookedRecommendation().getText();
		Assert.assertEquals(string1, string2);
	}

	public void clickCancel() {
		RecommendationModel.recommendationPopupHeader().click();
	}

	public String loc() {
		return RecommendationModel.loc().getText();
	}

	public String dep() {
		return RecommendationModel.dep().getText();
	}

	public String ret() {
		return RecommendationModel.ret().getText();
	}

	public String Ordertot() {
		return RecommendationModel.Ordertot().getText();
	}

	/*
	 * public int noOfSimilarTimeslots(){ return
	 * RecommendationModel.similarTimeslots().size(); }
	 * 
	 * public void getsimilarTimeslots(){ if(noOfSimilarTimeslots()>0) for(int
	 * i=0;i<noOfSimilarTimeslots();i++) { String str =
	 * RecommendationModel.similarTimeslots().get(i).getText();
	 * System.out.println(str);
	 * 
	 * }
	 * 
	 * else System.out.println("No such timeslot exists"); }
	 */
	public boolean modalSubtitleIsDisplayed() {
		return RecommendationModel.modalSubtitle().isDisplayed();
	}

	public String getEventTitle() {
		return RecommendationModel.eventTitle().getText();
	}

	public String getDetailedItinerary() {
		return RecommendationModel.detailedItinerary().getText();
	}

}
