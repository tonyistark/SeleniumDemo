package step_definition;

	import org.junit.Assert;

	import cucumber.api.java.en.And;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import poseidon_Constants.IResourceConstant;
	import poseidon_Controller.AccommodationsPageController;
	import poseidon_Controller.HomePageController;


	//@RunWith(Cucumber.class)
	public class ConductComplianceCheck_84375 {
		HomePageController home= new HomePageController();
		AccommodationsPageController accommodation=new AccommodationsPageController();
		
		    @Given("^user launches the poseidon URL$")
		  public void launchUrl() throws Throwable {
		    	String dpath = IResourceConstant.class.getClassLoader().getResource("./").getPath();
				 
				  dpath=dpath.concat( "chromedriver.exe");
				  System.setProperty("webdriver.chrome.driver",dpath); 

			      home.openURL("Chrome");
			      
			      home.maximizeURL();        
			      home.waitForLoad();
		    }

		    
		    @And("^xilodging homepage is launched successfully$")
		    public void xilodginghomepage() throws Throwable {
		    	Assert.assertEquals("xiLodging: Royal Princess",home.verifyTitleText());
		       
		    }
		    
		    
		    @When("^user clicks on Accommodation tab$")
		    public void clicksaccommodations() throws Throwable {
		    
		    	home.clickAccommodationsMenuItem();
		    	home.waitForLoad();
		    }

		    @Then("^Accommodation page should be displayed fine$")
		    public void accommodations_page_should_be_displayed() throws Throwable {
		    
		    	Assert.assertEquals("Accommodations",accommodation.verifyAccommodationsTitle());
		    	home.waitForLoad();
		    	
		    }
		    
		    
		    @When("^user selects current view as Compliance view$")
		    public void user_selects_current_view_as_compliance() throws Throwable {
		    	
		    	accommodation.selectCurrentView();
		    	accommodation.selectCompliance();
		    	home.waitForLoad();
		    }

		    @Then("^Room No and Compliance columns should be displayed correct$")
		    public void room_no_and_compliance_columns_should_be_displayed() throws Throwable {
		    	Assert.assertTrue(accommodation.validateRoomNo());
		    	Assert.assertTrue(accommodation.validateCompliance());
		    	home.waitForLoad();
		    }

		    

		     
		    @When("^user chooses any date$")
		    public void user_chooses_any_date() throws Throwable {
		    	accommodation.clickCalendar();
		    	home.waitForLoad();
		    	accommodation.selectDate("20");
		    	String oldDate= accommodation.dateSelected();
		    	System.out.println(oldDate);
		    	home.waitForLoad();	    	
		        
		    }

	

		    @And("^user clicks the tick ico$")
		    public void user_clicks_the_tick_icon() throws Throwable {
		    	
		    	accommodation.clickOnTickIcon();
		    	home.waitForLoad();
		    }
		    
		    @When("^user clicks on Assembly Station tab$")
		    public void clicksassemblyStation() throws Throwable {
		    
		    	home.clickAssembltStationsMenuItem();
		    	home.waitForLoad(); 
		    	home.waitForLoad();
		    }
		    
		    @And("^user clicks on Accommodation tab2$")
		    public void clicksaccommodations2() throws Throwable {
		    
		    	home.clickAccommodationsMenuItem();
		    	home.waitForLoad();
		    
		    }
		  
				
		     @Then("^user validates the date selected$")
			    public void check_the_selected_date() throws Throwable {
		    	
		    	String newDate= accommodation.dateSelected();
		    	//Assert.assertEquals(oldDate,newDate);
			    		home.waitForLoad();
						home.closeURL();

		    }
	
}