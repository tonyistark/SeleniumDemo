package step_definition;



import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import poseidon_Constants.IResourceConstant;
import poseidon_Controller.AccommodationsPageController;
import poseidon_Controller.HomePageController;
import poseidon_Model.AccommodationsPageModel;


//@RunWith(Cucumber.class)
public class InabilitytoSaveAlphaAlphaNumeric_84385 {
	HomePageController home= new HomePageController();
	AccommodationsPageController accommodation=new AccommodationsPageController();
	AccommodationsPageModel acc = new AccommodationsPageModel();
	    @Given("^user launches the URL$")
	  public void launchUrl() throws Throwable {
	    	String dpath = IResourceConstant.class.getClassLoader().getResource("./").getPath();
			 
			  dpath=dpath.concat( "chromedriver.exe");
			  System.setProperty("webdriver.chrome.driver",dpath); 

		      home.openURL("Chrome");
		      
		      home.maximizeURL();        
		      home.waitForLoad();
	    }

	    
	    @And("^xilodging homepage is launched$")
	    public void xilodginghomepage() throws Throwable {
	    	Assert.assertEquals("xiLodging: Royal Princess",home.verifyTitleText());
	       
	    }
	    
	    
	    @When("^user clicks on Accommodation$")
	    public void clicksaccommodations() throws Throwable {
	    
	    	home.clickAccommodationsMenuItem();
	    	home.waitForLoad();
	    }

	    @Then("^Accommodation page should be displayed$")
	    public void accommodations_page_should_be_displayed() throws Throwable {
	    
	    	Assert.assertEquals("Accommodations",accommodation.verifyAccommodationsTitle());
	    	home.waitForLoad();
	    	acc.alertText();
	    }
	    
	    
	    @When("^user selects current view as Compliance$")
	    public void user_selects_current_view_as_compliance() throws Throwable {
	    	
	    	accommodation.selectCurrentView();
	    	accommodation.selectCompliance();
	    	home.waitForLoad();
	    }

	    @Then("^Room No and Compliance columns should be displayed$")
	    public void room_no_and_compliance_columns_should_be_displayed() throws Throwable {
	    	Assert.assertTrue(accommodation.validateRoomNo());
	    	Assert.assertTrue(accommodation.validateCompliance());
	    	home.waitForLoad();
	    }

	    

	     
	    @When("^user chooses any date.$")
	    public void user_chooses_any_date() throws Throwable {
	    	accommodation.clickCalendar();
	    	home.waitForLoad();
	    	accommodation.selectDate("28");
	    	home.waitForLoad();	    	
	        
	    }

	    @And("^user edits the date.$")
	    public void user_edits_the_date() throws Throwable {
	    	accommodation.enterNewDate();
	    	home.waitForLoad();
	    }

	    @And("^user clicks the tick icon$")
	    public void user_clicks_the_tick_icon() throws Throwable {
	    	
	    	accommodation.clickOnTickIcon();
	    	home.waitForLoad();
	    }

	    
	    @Then("^error message should be displayed$")
	    public void error_message_should_be_displayed() throws Throwable {
	        Assert.assertEquals("Value Could Not be Updated, Value is in Not the Current Date Format",accommodation.alert());
	        System.out.println(accommodation.alert());
	        home.closeURL(); 
	    }
	    
	    

	    

	    
	}


