package step_definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import poseidon_Constants.IResourceConstant;
import poseidon_Controller.AccommodationsPageController;
import poseidon_Controller.FireZonesPageController;
import poseidon_Controller.HomePageController;

import org.junit.Assert;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
public class ViewFireZonesandDetails_84364 {
	HomePageController home= new HomePageController();
	FireZonesPageController firezone=new FireZonesPageController();
	
	 @Given("^user launches the URL for firezone$")
	    public void user_launches_the_url() throws Throwable {
		 
		 String dpath = IResourceConstant.class.getClassLoader().getResource("./").getPath();
		 
		  dpath=dpath.concat( "chromedriver.exe");
		  System.setProperty("webdriver.chrome.driver",dpath); 

	      home.openURL("Chrome");
	      
	      home.maximizeURL();        
	      home.waitForLoad();
	      
	        throw new PendingException();
	    }
	

	    @When("^user clicks on FIRE ZONES$")
	    public void user_clicks_on_fire_zones() throws Throwable {
	    	home.clickFireZonesMenuItem();
	    	Assert.assertEquals("Fire Zones",firezone.verifyFireZonesTitle());
	    }

	    @Then("^FIRE ZONES page should be displayed$")
	    public void fire_zones_page_should_be_displayed() throws Throwable {
	    	Assert.assertEquals("Fire Zones",firezone.verifyFireZonesTitle());


	    }

	

	    @And("^Fire zone should be displayed$")
	    public void fire_zone_should_be_displayed() throws Throwable {
	    	Assert.assertEquals("Fire zone",firezone.validateFireZoneColumn());

	    }

	    @And("^Deck should be displayed$")
	    public void deck_should_be_displayed() throws Throwable {
	    	Assert.assertEquals("Deck",firezone.validateDeckColumn());

	    }

	    @And("^Fire zone capacity should be displayed$")
	    public void fire_zone_capacity_should_be_displayed() throws Throwable {
	    	Assert.assertEquals("Fire zone capacity",firezone.validateFireZoneCapacityColumn());

	    }

	    @And("^Fire zone occupancy should be displayed$")
	    public void fire_zone_occupancy_should_be_displayed() throws Throwable {
	    	Assert.assertEquals("Fire zone occupancy",firezone.validateFireZoneOccupancyColumn());

	    }

	    @And("^Variance between the fire zone's capacity and occupancy should be displayed$")
	    public void variance_between_the_fire_zones_capacity_and_occupancy_should_be_displayed() throws Throwable {
	    	Assert.assertEquals("Variance",firezone.validateVarianceColumn());
			home.closeURL();

	    }


	}
