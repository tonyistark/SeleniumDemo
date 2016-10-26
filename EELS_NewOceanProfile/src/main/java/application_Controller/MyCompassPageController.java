package application_Controller;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import application_Model.MyCompassPageModel;
import constants.IResourceConstant;

public class MyCompassPageController {
	MyCompassPageModel myCompassPageModel = new MyCompassPageModel();
	

	public void clickMyCompassButton() {
		myCompassPageModel.myCompassButton().click();

	}

	public String SignUpBubbleDisplayed() {
		return myCompassPageModel.profileHeaderName().getText();
}
	public void clickAddPaymentMethod(){
		Actions action = new Actions(IResourceConstant.CURRENT_BROWSER);
		action.moveToElement(myCompassPageModel.addPaymentMethod()).click().perform();


		//myCompassPageModel.addPaymentMethod().click();
	}
	public void clickChangeLoginId(){
		WebDriverWait wait = new WebDriverWait(IResourceConstant.CURRENT_BROWSER, 10);

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(myCompassPageModel.changeLoginId()));

		//Actions action = new Actions(IResourceConstant.CURRENT_BROWSER);
		//action.moveToElement(myCompassPageModel.changeLoginId()).click().perform();


		element.click();
	}
	public String printTitle(){
		return myCompassPageModel.title();
	}
}