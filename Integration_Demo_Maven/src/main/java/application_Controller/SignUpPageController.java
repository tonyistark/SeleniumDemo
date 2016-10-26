package application_Controller;
import constants.*;

import java.util.concurrent.TimeUnit;


import application_Model.SignUpPageModel;

public class SignUpPageController {
	SignUpPageModel signUpPageModel = new SignUpPageModel();
	public void URL(String url, String browser){
		//if (browser == "FireFox") {
				IResourceConstant a = new IResourceConstant(browser);
					IResourceConstant.CURRENT_BROWSER.get(url);
					IResourceConstant.CURRENT_BROWSER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
	
	
	
	
	public void waitForLoad(int seconds){
		signUpPageModel.waitForLoad(seconds);
	}

	public void openURL (String url, String browser){
		signUpPageModel.URL(url, browser);
	}
	public void waitForLoad(){
		waitForLoad(10);
		
	}
	
	public void openURL(String browser){
		openURL(IResourceConstant.WEB_URL, browser);
	}
	
	public void openURL(){
		openURL("FireFox");
	}
	
	public void closeURL(){
		signUpPageModel.closeURL();
	}
	
	public void maximizeURL(){
		signUpPageModel.maxURL();
	}
	
	public void switchFrame(String frame){

		signUpPageModel.switchFrame(frame);
		

	}
	
	public void switchFrame(){
		
		switchFrame("app-playback");
		
	}
	public void clickSignUpBubble(){
		signUpPageModel.signUpBubble().click();
	}
	public boolean SignUpBubbleDisplayed(){
		return signUpPageModel.signUpBubble().isDisplayed();
	}
	public String getSignUpBubbleText(){
		return signUpPageModel.signUpBubble().getText();
	}
	
	public void enterFirstNameSignUp(String firstName){
		signUpPageModel.signUpFirstName().clear();
		signUpPageModel.signUpFirstName().sendKeys(firstName);
	}
	public void enterLastNameSignUp(String lastName){
		signUpPageModel.signUpLastName().clear();
		signUpPageModel.signUpLastName().sendKeys(lastName);
	}
	public void enterEmailIdSignUp(String emailId){
		signUpPageModel.signUpEmailAddress().clear();
		signUpPageModel.signUpEmailAddress().sendKeys(emailId);
	}
	public void clickLogInBubble(){
		signUpPageModel.logInBubble().click();
	}
	public boolean LogInBubbleDisplayed(){
		return signUpPageModel.logInBubble().isDisplayed();
	}
	public String getLogInBubbleText(){
		return signUpPageModel.logInBubble().getText();
	}

	public void clickContinueWithFacebookBubble(){
		signUpPageModel.continueWithFacebookBubble().click();
	}
	public boolean ContinueWithFacebookBubbleDisplayed(){
		return signUpPageModel.continueWithFacebookBubble().isDisplayed();
	}
	public String getContinueWithFacebookBubble(){
		return signUpPageModel.continueWithFacebookBubble().getText();
	}
	public void enterEmailIdLogIn(String emailId){
		signUpPageModel.logInEmailAddress().click();
		signUpPageModel.logInEmailAddress().sendKeys(emailId);
	}
	public void enterPasswordLogIn(String emailId){
		signUpPageModel.logInPassword().click();
		signUpPageModel.logInPassword().sendKeys(emailId);
	}
	public void signIn(String user, String pw){
		enterEmailIdLogIn(user);
		enterPasswordLogIn(pw);
		clickLogInButton();
	}
	
	public void signIn(){
		signIn("rishi.a.garg@accenture.com", "Poseidon@123");
	}
	
	public void checkRememberMeLogIn(){
		if(!signUpPageModel.rememberMe().isSelected())
		{
		signUpPageModel.rememberMe().click();
		}
	}
	public void clickLogInButton(){
		signUpPageModel.logInbtn().click();
	}
	public boolean logInButtonDisplayed(){
	return	signUpPageModel.logInbtn().isDisplayed();
	}
	public boolean headerLinkLearnPlanDisplayed(){
		
		return signUpPageModel.learnPlan().isDisplayed();
	
	}
public boolean headerLinkdestinationsDisplayed(){
		
		return signUpPageModel.destinations().isDisplayed();
	}
public boolean signUpSignUpDisplayed(){
	
	return signUpPageModel.signUpLabel().isDisplayed();
}

public boolean firstNameSignUpDisplayed(){
	
	return signUpPageModel.signUpFirstNameLabel().isDisplayed();
}
public boolean lastNameSignUpDisplayed(){
	
	return signUpPageModel.signUpLastNameLabel().isDisplayed();
}
public boolean emailAddressSignUpDisplayed(){
	
	return signUpPageModel.signUpEmailAddressLabel().isDisplayed();
}
	public boolean signUpButtonDisplayed(){
		
		return signUpPageModel.signUpButton().isDisplayed();
}
	
	public boolean headerLinkoceanDisplayed(){
		
		return signUpPageModel.ocean().isDisplayed();
	}
	public boolean headerLinkmyCompassDisplayed(){
		
		return signUpPageModel.myCompass().isDisplayed();
	}
	public boolean headerLinkShipsExperiencesDisplayed(){
	
	return signUpPageModel.shipsExperiences().isDisplayed();
	}
	public String getLoginMessage(){
		return signUpPageModel.loginMessage().getText();
	}
	public String getIntroductionMyCompass(){
		return signUpPageModel.introductionMyCompass().getText();
	}
	public String getIntroductionMessage(){
		return signUpPageModel.introductionMessage().getText();
	}
	public String getIntroductionStartYourJourney(){
		return signUpPageModel.introductionStartYourJourney().getText();
	}
	public String getLoginTermsAndConditions(){
		return signUpPageModel.loginTermsAndConditions().getText();
	}
	public String getLoginTermsLink(){
		return signUpPageModel.loginTermsLink().getText();
	}
	public String getAccountLogoutError(){
		return signUpPageModel.signUpLabel().getText();
	}
	public String getLogInError(){
		return signUpPageModel.loginError().getText();
	}
	public void clickSignUpButton(){
		signUpPageModel.signUpButton().click();
	}
	public String getLogInFuncError(){
		return signUpPageModel.loginFuncErrorMessage().getText();
	}
	public String getLogInEmailFuncError(){
		return signUpPageModel.loginFuncEmailErrorMessage().getText();
	}
	public String getLogInEmailNotExistFuncError(){
		return signUpPageModel.loginFuncEmailNotExistErrorMessage().getText();
	}
	public String getforgotpassword(){
		return signUpPageModel.forgotpassword().getText();
	}

}
