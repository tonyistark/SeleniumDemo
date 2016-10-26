package step_definition;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import poseidon_Constants.IResourceConstant;
import poseidon_Controller.AccommodationsPageController;
import poseidon_Controller.HomePageController;

public class SingleRoomTurndownStatusUpdate_84367 {

	HomePageController home = new HomePageController();
	AccommodationsPageController accommodation = new AccommodationsPageController();
	String turnDownFieldValue = null;
	String newTurnDownFieldValue = null;

	@Given("^user launches the URL(\\d+)$")
	public void user_launches_the_URL(int arg1) throws Throwable {

		String dpath = IResourceConstant.class.getClassLoader().getResource("./").getPath();

		dpath = dpath.concat("chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", dpath);

		home.openURL("Chrome");

		home.maximizeURL();
		home.waitForLoad();
	}

	@And("^xilodging homepage is launched(\\d+)$")
	public void xilodging_homepage_is_launched(int arg1) throws Throwable {
		Assert.assertEquals("xiLodging: Royal Princess", home.verifyTitleText());
	}

	@When("^user clicks on Accommodation(\\d+)$")
	public void user_clicks_on_Accommodation(int arg1) throws Throwable {
		home.clickAccommodationsMenuItem();
		home.waitForLoad();
	}

	@Then("^Accommodation page should be displayed(\\d+)$")
	public void accommodation_page_should_be_displayed(int arg1) throws Throwable {
		Assert.assertEquals("Accommodations", accommodation.verifyAccommodationsTitle());
		home.waitForLoad();
	}

	@When("^user selects a room(\\d+)$")
	public void user_selects_a_room(int arg1) throws Throwable {
		accommodation.selectRoomNo();
	}

	@Then("^Room details page should be displayed(\\d+)$")
	public void room_details_page_should_be_displayed(int arg1) throws Throwable {
		Assert.assertTrue(accommodation.validateRoomDetailPage());
	}

	@When("^user clicks on Edit button(\\d+)$")
	public void user_clicks_on_Edit_button(int arg1) throws Throwable {
		accommodation.clickEditButton();
	}

	@Then("^Turn Down Status field should be enabled(\\d+)$")
	public void turn_Down_Status_field_should_be_enabled(int arg1) throws Throwable {
		Assert.assertTrue(accommodation.checkTurnDownStatusField());
	}

	@When("^user clicks on Turn Down Status field(\\d+)$")
	public void user_clicks_on_Turn_Down_Status_field(int arg1) throws Throwable {
		turnDownFieldValue = accommodation.turnDownStatusValueBeforeUpdate();
		
		accommodation.clickTurnDownStatus();
		home.waitForLoad();

	}

	@Then("^user updates the Turn Down Status field$")
	public void user_updates_the_Turn_Down_Status_field() throws Throwable {
		turnDownFieldValue = accommodation.turnDownStatusValueBeforeUpdate();
		System.out.println(turnDownFieldValue);
	
		if (turnDownFieldValue.equals("Required")) {
			
			accommodation.clickTurnDownStatusComplete();
			newTurnDownFieldValue = "Complete";
			System.out.println(newTurnDownFieldValue);
		}
		else if (turnDownFieldValue.equals("Not Required")) {
			
			accommodation.clickTurnDownStatusRequired();
			newTurnDownFieldValue = "Required";
			System.out.println(newTurnDownFieldValue);
		} 
		else if(turnDownFieldValue.equals("Complete")){
			accommodation.clickTurnDownStatusNotRequired();
			newTurnDownFieldValue = "Not Required";
			System.out.println(newTurnDownFieldValue);
		}
	}

	

	@When("^user clicks on the Done button$")
	public void user_clicks_on_the_Done_button() throws Throwable {

		accommodation.clickDoneButton();
		home.waitForLoad();
	}

	@Then("^Turn Down Status field is showing the updated value$")
	public void turn_Down_Status_field_is_showing_the_updated_value() throws Throwable {
		System.out.println(	accommodation.turnDownStatusValueAfterUpdate());	
				System.out.println(newTurnDownFieldValue);
		
				String s=accommodation.turnDownStatusValueAfterUpdate();
		Assert.assertEquals(newTurnDownFieldValue,s);
		home.closeURL();

	}

}
