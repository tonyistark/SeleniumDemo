package application_Controller;

import application_Model.ProfilePageModel;

public class ProfilePageController {


	ProfilePageModel ProfilePage = new ProfilePageModel();
public void validateLoginPageExists(){
	
		
		try {
			if(ProfilePage.interestsButton().isDisplayed()){
				//Log.info("Log In successful");	
				System.out.println("Log in succesful");
			}else{
				//Log.error("Expected object does  not exist on home page. Login not successful.");
				System.out.println("Expected object does  not exist on home page. Login not successful.");
			}
		} catch (Exception e) {
			//Log.error("ERROR: " + e);
			System.out.println("ERROR: " + e);
		}
		
	}

public String interestButtonExists(){

String interestButton=	ProfilePage.interestsButton().getText();
	System.out.println(interestButton);
	return interestButton;
}

public void clickPrincessLogo()
{
	ProfilePage.princessLogoButton().click();
}

public void profileExists(){
	ProfilePage.profile().isDisplayed();
}

public void myJourneyExists(){
	ProfilePage.myJourney().isDisplayed();
}

public void eastCarribeanExists(){
	ProfilePage.eastCarribean().isDisplayed();
}

public void southCarribeanExists(){
	ProfilePage.southCarribean().isDisplayed();
}

public void westCarribeanExists(){
	ProfilePage.westCarribean().isDisplayed();
}

public void clickEasternCarribean()
{
	ProfilePage.eastCarribean().click();
}

public void clickSouthernCarribean()
{
	ProfilePage.southCarribean().click();
}

public void clickWesternCarribean()
{
	ProfilePage.westCarribean().click();
}

public void clickChooseInterest(){
	ProfilePage.interestsButton().click();
} 
public void clickhamburger(){
	ProfilePage.hamburger().click();
}
public void clicklogout(){
	ProfilePage.logout().click();
}
}
