package step_definition;

import org.junit.Assert;
import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import poseidon_Constants.IResourceConstant;
import poseidon_Controller.AccommodationsPageController;
import poseidon_Controller.HomePageController;

@RunWith(Cucumber.class)
public class TurndownStatus_84359 {

	HomePageController home = new HomePageController();
	AccommodationsPageController accommodation = new AccommodationsPageController();

	@Given("^user launches the URL for turndown status$")
	public void user_launches_the_url() throws Throwable {
		String dpath = IResourceConstant.class.getClassLoader().getResource("./").getPath();

		dpath = dpath.concat("chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", dpath);

		home.openURL("Chrome");

		home.maximizeURL();
		home.waitForLoad();
	}

	@And("^xilodging homepage should be launched$")
	public void xilodging_homepage_is_launched() throws Throwable {
		Assert.assertEquals("xiLodging: Royal Princess", home.verifyTitleText());

	}

	@When("^user clicks on Accommodation menu item$")
	public void user_clicks_on_accommodations() throws Throwable {
		home.clickAccommodationsMenuItem();
		home.waitForLoad();
	}

	@Then("^Accommodation page will open$")
	public void accommodationsdisplayed() throws Throwable {
		Assert.assertEquals("Accommodations", accommodation.verifyAccommodationsTitle());
		home.waitForLoad();
	}

	@When("^user selects a room$")
	public void user_selects_a_room() throws Throwable {

		accommodation.selectRoomNo();
	}

	@Then("^Room details page should be displayed$")
	public void room_details_page_should_be_displayed() throws Throwable {

		Assert.assertTrue(accommodation.validateRoomDetailPage());

	}

	/*@And("^Turn Down Status field is disabled$")
	public void turn_down_status_field_is_disabled() throws Throwable {
		Assert.assertFalse(accommodation.checkTurnDownStatusField());
	}*/

	@When("^user clicks on Edit button$")
	public void user_clicks_on_edit_button() throws Throwable {
		accommodation.clickEditButton();
	}

	@Then("^Turn Down Status field should be enabled$")
	public void turn_down_status_field_should_be_enabled() throws Throwable {
		Assert.assertTrue(accommodation.checkTurnDownStatusField());
	}

	@When("^user clicks on Turn Down Status field$")
	public void turn_down_status_field() throws Throwable {
		accommodation.clickTurnDownStatus();
		home.waitForLoad();
		
	}

	@Then("^Required choice for Turn Down Status field should be displayed.$")
	public void required_choice_for_turn_down_status_field_should_be_displayed()
			throws Throwable {
		home.waitForLoad();
		
		Assert.assertTrue(accommodation.validateTurnDownStatusRequired());
	
		
	}
	@And("^Not Required choice for Turn Down Status field should be displayed.$")
	public void rnot_required_choice_for_turn_down_status_field_should_be_displayed()
			throws Throwable {
		
		Assert.assertTrue(accommodation.validateTurnDownStatusNotRequired());
		
		
	}
	
	@And("^Complete choice for Turn Down Status field should be displayed.$")
	public void complete_choice_for_turn_down_status_field_should_be_displayed()
			throws Throwable {
		
		
		Assert.assertTrue(accommodation.validateTurnDownStatusComplete());
		home.closeURL();
	}

}
