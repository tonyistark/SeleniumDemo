package step_definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import poseidon_Constants.IResourceConstant;
import poseidon_Controller.AccommodationsPageController;
import poseidon_Controller.FireZonesPageController;
import poseidon_Controller.HomePageController;

import org.junit.Assert;

@RunWith(Cucumber.class)
public class ViewVarianceValuesForFireZones_84365 {
	HomePageController home= new HomePageController();
	FireZonesPageController firezone=new FireZonesPageController();
	 @Given("^user launches the URLfirezone$")
	    public void user_launches_the_url() throws Throwable {
		 
		 String dpath = IResourceConstant.class.getClassLoader().getResource("./").getPath();
		 
		  dpath=dpath.concat( "chromedriver.exe");
		  System.setProperty("webdriver.chrome.driver",dpath); 

	      home.openURL("Chrome");
	      
	      home.maximizeURL();        
	      home.waitForLoad();
	      
	    }
	 @And("^xilodging homepage1 is launched4$")
	    public void xilodging_homepage_is_launched() throws Throwable {
			Assert.assertEquals("xiLodging: Royal Princess", home.verifyTitleText());

	 
	 }
    @When("^user clicks on FIRE ZONES1$")
    public void user_clicks_on_fire_zones() throws Throwable {
    	home.clickFireZonesMenuItem();
    	Assert.assertEquals("Fire Zones",firezone.verifyFireZonesTitle());
    }

    @Then("^FIRE ZONES page should be displayed1$")
    public void fire_zones_page_should_be_displayed() throws Throwable {
    	Assert.assertEquals("Fire Zones",firezone.verifyFireZonesTitle());
    }

   
    @And("^Variance between the fire zone's capacity and occupancy should be displayed1$")
    public void variance_between_the_fire_zones_capacity_and_occupancy_should_be_displayed() throws Throwable {
    	//Webelement variancevalue = //*[@class="md-body"]/tr[1]/td[5]
    	int sizeofarray = firezone.variancevaluestext().length;
    	int arr[] = new int[sizeofarray];
    	arr = firezone.variancevaluestext().clone();
    	for (int i =0; i<sizeofarray; i++)
    	{
    		System.out.println(arr[i]);
    		Assert.assertTrue(arr[i]>0||arr[i]<0||arr[i]==0);
    	}
		home.closeURL();

    }

}
