package application_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import constants.IResourceConstant;

public class LearnAndPlanPageModel {

	public WebElement preCruise() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("ocean-ready__header___x-lGv"));
	}
	public WebElement daysLeft() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("ocean-ready__daysToDeparture___VMk3r"));
	}
	
	public WebElement essentials() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[text()='Essentials'])"));
	}
	public WebElement medallion() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[text()='Medallion']"));

	}
	public WebElement travel() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[text()='Travel"));

	}
	public WebElement residencyInformationBubble() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[text()='Residency Information']"));

	}
	public WebElement onboard() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[text()='Onboard']"));

	}
	public WebElement residencyInformationHeader() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='residency']/h2"));

	}
	public WebElement greenDotCompletion() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("essentials__complete___1dDXG"));

	}
	public WebElement travelDocumentationBubble() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[text()='Travel Documentation']"));

	}
	public WebElement paymentMethodBubble() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[text()='Payment Method']"));

	}
	public WebElement emergencyContactBubble() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[text()='Emergency Contact']"));

	}
	public WebElement reviewContractBubble() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[text()='Review Contract']"));

	}
	public WebElement arrivalTransportBubble() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[text()='Arrival Transport']"));

	}
	public WebElement departureTransportBubble() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[text()='Departure Transport']"));

	}
	public WebElement crossButtonInBubble() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("fa fa-times-circle-o essentials__closeIcon___YCcS4"));

	}
	public WebElement manuallyInputPassport() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.linkText("Manually Input"));

	}
	
	//Essentials Button Bubble
	public WebElement countryOfBirth() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-CountryofBirth')]"));
		
		

	}
	public WebElement countryOfCitizenship() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-CountryofCitizenship')]"));

	}
	public WebElement countryOfResidency() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-CountryofResidency')]"));
		
	}
	public JavascriptExecutor javaexec(){
	JavascriptExecutor js = (JavascriptExecutor) IResourceConstant.CURRENT_BROWSER;
	return js;
	}
	public WebElement questionMark() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("fa fa-question-circle-o"));
		
	}
	public WebElement firstMember() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='residency']/div[1]/div[1]/div[1]/div[1]"));

	}
	public WebElement secondMember() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='residency']/div[1]/div[2]/div[1]/div"));

	}
	public WebElement thirdMember() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='residency']/div[1]/div[3]/div[1]/div"));

	}
	public WebElement forthMember() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='residency']/div[1]/div[4]/div[1]/div"));

	}  //Essentials Button Bubble End Here
	// Travel Button Bubble
	public WebElement firstMemberTravel() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='travel-plans-arrival']/div[1]/div[1]/div[1]/div"));

	}
	public WebElement secondMemberTravel() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='travel-plans-arrival']/div[1]/div[2]/div[1]/div"));

	}
	public WebElement thirdMemberTravel() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='travel-plans-arrival']/div[1]/div[3]/div[1]/div"));

	}
	public WebElement forthMemberTravel() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='travel-plans-arrival']/div[1]/div[4]/div[1]/div"));

	}
	
	public WebElement travelBubbleHeaderText() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='travel-plans-arrival']/h2"));

	}
	public WebElement flyingDirectButton() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[text()='Flying Direct']"));

	}
	public WebElement multipleStopFlight() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[text()='Multiple Stop Flight]"));

	}
	public WebElement travelDropDown() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='travel-plans-arrival']/div[2]/div[1]/div/div[1]/div[2]"));

	}
	
	
}
