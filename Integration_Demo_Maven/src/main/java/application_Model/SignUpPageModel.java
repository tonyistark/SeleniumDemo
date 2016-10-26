package application_Model;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constants.IResourceConstant;
public class SignUpPageModel {
	
	public WebElement signUpBubble(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("login__signupBubble___vBTKT"));
	}
	
	public WebElement logInBubble(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("login__loginBubble___2gcI0"));
	}
	public WebElement continueWithFacebookBubble(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("login__continueWithFacebook___Fdwlu"));
	}
	public WebElement signUpFirstName(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-FirstName')]"));
	}
	public WebElement signUpLastName(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-LastName')]"));
	}
	public WebElement signUpEmailAddress(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-EmailAddress')]"));
	}
	public WebElement signUpFirstNameLabel(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//label[contains(@for,'undefined-undefined-FirstName')]"));
	}
	public WebElement signUpLastNameLabel(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//label[contains(@for,'undefined-undefined-LastName')]"));
	}
	public WebElement signUpEmailAddressLabel(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//label[contains(@for,'undefined-undefined-EmailAddress')]"));
	}
	public WebElement signUpLabel(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("login__loginHeader___yfBl8"));
	}


	public WebElement signUpButton(){
		//return IResourceConstant.CURRENT_BROWSER.findElement(By.id("layout__transitionContainer___2PFZ3"));
		return IResourceConstant.CURRENT_BROWSER.findElement(By.cssSelector("#login > div > div.introduction__bubbles___2siLn > div > div > div.login__fields___2T_LR > div:nth-child(6) > div > button > div > div"));
	}
	public WebElement logInEmailAddress(){
		//return IResourceConstant.CURRENT_BROWSER.findElement(By.id("undefined-undefined-EmailAddress-33524"));
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-EmailAddress')]"));

	}
	public WebElement logInPassword(){
		//return IResourceConstant.CURRENT_BROWSER.findElement(By.id("undefined-undefined-Password-7158"));
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-Password')]"));

	}
	public WebElement logInbtn(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.cssSelector("#login > div > div.introduction__bubbles___2siLn > div > div > div.login__fields___2T_LR > div.login__loginForgotRow___wX3Bn > div:nth-child(1) > button"));
	}
	public WebElement forgotLoginDetails(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("login__forgotLoginDetails___XrSR6"));
	}
	public WebElement rememberMe(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.cssSelector("input[type = 'checkbox']"));
	
	}
	public void URL(String url, String browser){
		//if (browser == "FireFox") {
				IResourceConstant a = new IResourceConstant(browser);
					IResourceConstant.CURRENT_BROWSER.get(url);
					IResourceConstant.CURRENT_BROWSER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
	
	
	
	public void waitForLoad(int seconds){
		IResourceConstant.CURRENT_BROWSER.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		
	}
	
	public void maxURL(){
		IResourceConstant.CURRENT_BROWSER.manage().window().maximize(); 
	}
	
	public void closeURL(){
		IResourceConstant.CURRENT_BROWSER.close();
	}
	
	public void switchFrame(String frame){
		
		IResourceConstant.CURRENT_BROWSER.switchTo().frame(IResourceConstant.CURRENT_BROWSER.findElement(By.className(frame)));
		
	}
	public WebElement learnPlan(){
        return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[contains(text(), 'Learn & Plan' )]"));
 }
 public WebElement shipsExperiences(){
        return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[contains(text(), 'Ships & Experiences' )]"));

 }
 public WebElement destinations(){
        return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[contains(text(), 'Destinations' )]"));

 }
 public WebElement ocean(){
        return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[contains(text(), 'O·C·E·A·N' )]"));

 }
 public WebElement myCompass(){
        return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[contains(text(), 'My Compass' )]"));

 }

	public WebElement loginMessage(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("login__message___2sg1b"));
	
	}
	public WebElement introductionMyCompass(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("introduction__myCompass___cZW8N"));
	
	}
	public WebElement introductionMessage(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("introduction__message___DWLqo"));
	
	}
	public WebElement introductionStartYourJourney(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("introduction__startYourJourney___35I0t"));
	
	}
	
	public WebElement loginTermsAndConditions(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("login__termsAndConditions___ZtOH7"));
	
	}
	
	public WebElement loginTermsLink(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("login__termsLink___2OJz4"));
	
	}
	public WebElement loginError(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("login__error___2qC-t"));
	
	}
	
	public WebElement loginFuncErrorMessage(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.cssSelector("#login > div > div.introduction__bubbles___2siLn > div > div > div.login__fields___2T_LR > div:nth-child(4) > div:nth-child(4)"));
	
	}
	
	public WebElement loginFuncEmailErrorMessage(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.cssSelector("#login > div > div.introduction__bubbles___2siLn > div > div > div.login__fields___2T_LR > div:nth-child(2) > div:nth-child(4)"));
	
	}
	
	public WebElement loginFuncEmailNotExistErrorMessage(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.cssSelector("#login > div > div.introduction__bubbles___2siLn > div > div > div.login__fields___2T_LR > div.login__error___2qC-t"));
	
	}
	
	public WebElement forgotpassword(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.cssSelector("#login > div > div.introduction__bubbles___2siLn > div > div > div.login__fields___2T_LR > div:nth-child(3) > button > div > div > span"));
	
	}
		

	
	

}
