package application_Controller;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import application_Model.LearnAndPlanPageModel;

public class LearnAndPlanPageController {

	LearnAndPlanPageModel learnAndPlan = new LearnAndPlanPageModel();
	
	public String preCruiseHeader()
	{
		String header = learnAndPlan.preCruise().getText();
		return header;
	}
	
	public String daysLeft()
	{
		String header = learnAndPlan.daysLeft().getText();
		return header;
	}
	//Essentials Button Bubble
	public void clickEssentials() {
		learnAndPlan.essentials().click();
	}
	public void enterCountryOfBirth(String value){
		//learnAndPlan.javaexec().executeScript("document.getElementById('undefined-undefined-CountryofBirth-55451').setAttribute('value', '')");
		//learnAndPlan.javaexec().executeScript("document.getElementById('undefined-undefined-CountryofBirth-55451').setAttribute('value', 'United States (US)')");
		learnAndPlan.javaexec().executeScript("arguments[0].setAttribute('value', '')", learnAndPlan.countryOfBirth());
		learnAndPlan.javaexec().executeScript("arguments[0].setAttribute('value', 'United States (US)')", learnAndPlan.countryOfBirth());
	}
	public void enterCountryOfCitizenship(String value){
		//learnAndPlan.javaexec().executeScript("document.getElementById('undefined-undefined-CountryofBirth-55451').setAttribute('value', '')");
		//learnAndPlan.javaexec().executeScript("document.getElementById('undefined-undefined-CountryofBirth-55451').setAttribute('value', 'United States (US)')");
		learnAndPlan.javaexec().executeScript("arguments[0].setAttribute('value', '')", learnAndPlan.countryOfCitizenship());
		learnAndPlan.javaexec().executeScript("arguments[0].setAttribute('value', 'United States (US)')", learnAndPlan.countryOfCitizenship());
	}
	public void enterCountryOfResidency(String value){
		//learnAndPlan.javaexec().executeScript("document.getElementById('undefined-undefined-CountryofBirth-55451').setAttribute('value', '')");
		//learnAndPlan.javaexec().executeScript("document.getElementById('undefined-undefined-CountryofBirth-55451').setAttribute('value', 'United States (US)')");
		learnAndPlan.javaexec().executeScript("arguments[0].setAttribute('value', '')", learnAndPlan.countryOfResidency());
		learnAndPlan.javaexec().executeScript("arguments[0].setAttribute('value', 'United States (US)')", learnAndPlan.countryOfResidency());
	}
	//Essentials Button Bubble End Here
		// Travel Button Bubble
	public void travelDropDown(String FlightChoice)
	{
		Select dropdown = new Select(learnAndPlan.travelDropDown());
		dropdown.selectByValue(FlightChoice);
	}
	public String travelHeaderValidation() {
	return learnAndPlan.travelBubbleHeaderText().getText();
	}
	
	public void clickFirstMemberTravel() {
		learnAndPlan.firstMemberTravel().click();
	}
	
	public void clickSecondMemberTravel() {
		learnAndPlan.secondMemberTravel().click();
	}
	
	public void clickThirdMemberTravel() {
		learnAndPlan.thirdMemberTravel().click();
	}
	
	public void clickForthMemberTravel() {
		learnAndPlan.forthMemberTravel().click();
	}
	
	public void clickMultipleStopFlight() {
		learnAndPlan.multipleStopFlight().click();
	}
	
	public void clickFlyingDirectButton() {
		learnAndPlan.flyingDirectButton().click();
	}
	
}
