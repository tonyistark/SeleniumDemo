package poseidon_Controller;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import poseidon_Constants.IResourceConstant;
import poseidon_Model.AccommodationsPageModel;

public class AccommodationsPageController {

	int roomNo = 14004;

	AccommodationsPageModel accommodations = new AccommodationsPageModel();

	public void URL(String url, String browser) {
		// if (browser == "FireFox") {
		IResourceConstant a = new IResourceConstant(browser);

		IResourceConstant.CURRENT_BROWSER.get(url);
		IResourceConstant.CURRENT_BROWSER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void waitForLoad(int seconds) {
		accommodations.waitForLoad(seconds);
	}

	public void openURL(String url, String browser) {
		accommodations.URL(url, browser);
	}

	public void waitForLoad() {
		waitForLoad(10);

	}

	public void openURL(String browser) {
		openURL(IResourceConstant.WEB_URL, browser);
	}

	public void openURL() {
		openURL("FireFox");
	}

	public void closeURL() {
		accommodations.closeURL();
	}

	public void maximizeURL() {
		accommodations.maxURL();
	}

	public void switchFrame(String frame) {

		accommodations.switchFrame(frame);

	}

	public String verifyAccommodationsTitle() {

		return accommodations.accommodationsTitle().getText();

	}

	public void selectCurrentView() {

		accommodations.currentViewDropDown().click();

	}

	public void selectCompliance() {
		accommodations.chooseCompliance().click();
	}

	public boolean validateRoomNo() {

		return accommodations.roomNoColumn().isDisplayed();

	}

	public boolean validateCompliance() {
		return accommodations.complianceColumn().isDisplayed();

	}

	public void selectRoomNo() {
		accommodations.roomNo().click();

	}

	public void clickCalendar() {
		accommodations.calendarIcon().click();
	}

	public void selectDate(String date) {
		 accommodations.chooseDate(date);

	}

	public void enterNewDate() {
		accommodations.editDate().click();
		accommodations.editDate().sendKeys("!@#@$#@$");

	}

	public void clickOnTickIcon() {

		accommodations.tickIcon().click();

	}

	public String alert() {

		return accommodations.alertText();

	}
	public boolean validateRoomDetailPage() {

		return accommodations.roomNo().isDisplayed();

	}

	public void clickEditButton() {

		accommodations.editButton().click();

	}

	public void clickTurnDownStatus() {

		accommodations.turnDownStatusDropDown().click();

	}
	
	public boolean checkTurnDownStatusField() {

		return accommodations.turnDownStatusDropDown().isEnabled();

	}

	public boolean validateTurnDownStatusRequired() {/*
		Select select = new Select(accommodations.turnDownStatusDropDown());
		 List<WebElement> options = select.getOptions();  
		 boolean match = false;
	   	  System.out.println("getting into the loop");

		 for(WebElement we:options)  
		 {  
		   match = false;
		      if (we.getText().equals("Required")){
		    	  System.out.println("element is present");
			        match = true;
			        break;
			      }
		    	  System.out.println("element is not present");

			    }
	   	  System.out.println("loop not executed");
		  //Assert.assertTrue(match);
	return match;
*/
		return accommodations.turnDownStatusRequired().isDisplayed();

	}

	public boolean validateTurnDownStatusNotRequired() {
		/*
		Select select = new Select(accommodations.turnDownStatusDropDown());
		 List<WebElement> options = select.getOptions();  
		 boolean match = false;
		 for(WebElement we:options)  
		 {  
		   match = false;
		      if (we.getText().equals("Not Required")){
		        match = true;
		        break;
		      }
		    }
		  //Assert.assertTrue(match);
	return match;
*/
		return accommodations.turnDownStatusNotRequired().isDisplayed();
	}

	public boolean validateTurnDownStatusComplete() {
		/*
		Select select = new Select(accommodations.turnDownStatusDropDown());
		 List<WebElement> options = select.getOptions();  
		 boolean match = false;
		 for(WebElement we:options)  
		 {  
		   match = false;
		      if (we.getText().equals("Complete")){
		    	  System.out.println("element is present");
		        match = true;
		        break;
		      }
	    	  System.out.println("element is not present");

		    }
   	  System.out.println("loop not executed");

		  //Assert.assertTrue(match);
	return match;
	*/
		return accommodations.turnDownStatusComplete().isDisplayed();
	}
	
	public void clickTurnDownStatusRequired() {
		 accommodations.turnDownStatusRequired().click();

	}

	public void clickTurnDownStatusNotRequired() {
		 accommodations.turnDownStatusNotRequired().click();

	}

	public void clickTurnDownStatusComplete() {
		 accommodations.turnDownStatusComplete().click();

	}
	
	
	public String turnDownStatusValueBeforeUpdate(){
		
		return accommodations.turnDownStatus().getText();
	}
	
    public String turnDownStatusValueAfterUpdate(){
		
		return accommodations.turnDownStatus().getText();
	}
    public void clickDoneButton(){
		
		 accommodations.doneButton().click();
	}
    public String dateSelected() {

		return accommodations.editDate().getText();

	}

}
