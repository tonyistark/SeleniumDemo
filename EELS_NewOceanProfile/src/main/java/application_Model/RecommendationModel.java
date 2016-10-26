package application_Model;

import constants.IResourceConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RecommendationModel {

	public WebElement selectFirstRecommendation() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("events-list-event-title"));
	}

	public WebElement closeExcursionButton() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className(
				"modal-button order-complete-button order-complete-close js-order-complete-close js-modal-close"));
	}

	public WebElement crossButton() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("modal-close js-modal-close xm-close"));
	}

	public WebElement purchaseButton() {
		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.className("modal-button event-details-purchase js-event-details-purchase"));
	}

	public WebElement doneButton() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className(
				"modal-button order-complete-button order-complete-done js-order-complete-close js-modal-done"));
	}

	public WebElement recommendationPopupHeader() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("modal-title"));
	}

	public WebElement recDetailValidation() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("events-list-event-description"));
	}

	public WebElement bookrecDetailValidation() {
		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.xpath(".//*[@id='modal']/div/div/div/div[2]/div[1]/div[2]/div[2]/div[1]"));
	}

	public WebElement bookedRecommendation() {
		return IResourceConstant.CURRENT_BROWSER.findElement(
				By.xpath(".//*[@id='voyage-subview-root']/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]"));
	}

	public WebElement loc() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.cssSelector(
				"#modal > div > div > div > div.modal-content > div.order-summary > div.order-summary-body > div > table > tbody > tr.order-summary-row.order-summary-location > td.order-summary-key"));
	}

	public WebElement dep() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.cssSelector(
				"#modal > div > div > div > div.modal-content > div.order-summary > div.order-summary-body > div > table > tbody > tr:nth-child(2) > td.order-summary-key"));
	}

	public WebElement ret() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.cssSelector(
				"#modal > div > div > div > div.modal-content > div.order-summary > div.order-summary-body > div > table > tbody > tr:nth-child(3) > td.order-summary-key"));
	}

	public WebElement Ordertot() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("order-summary-key"));
	}

	/*
	 * public WebElement similarTimeslots() { String bookedEventTimeslot =
	 * JourneyPageModel.bookedEventTimeslot().getText(); List<WebElement>
	 * options =
	 * IResourceConstant.CURRENT_BROWSER.findElements(By.partialLinkText(
	 * bookedEventTimeslot)); return options; }
	 */
	public WebElement modalSubtitle() {
		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.cssSelector("#modal>div>div>div>div.modal-header>div.modal-subtitle"));
	}

	public WebElement eventTitle1() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.cssSelector(
				"#modal>div>div>div>div.modal-content>div>div>div>div.events-list-event-body>div.events-list-event-title"));

	}

	public WebElement eventTitle() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("event-details-item"));

	}

	public WebElement detailedItinerary() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("event-details-item font-small"));

	}

}
