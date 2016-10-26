package poseidon_Model;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import poseidon_Constants.IResourceConstant;

public class AccommodationsPageModel {

	public void URL(String url, String browser) {
		// if (browser == "FireFox") {
		IResourceConstant a = new IResourceConstant(browser);
		IResourceConstant.CURRENT_BROWSER.get(url);
		IResourceConstant.CURRENT_BROWSER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void waitForLoad(int seconds) {
		IResourceConstant.CURRENT_BROWSER.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

	}

	public void maxURL() {
		IResourceConstant.CURRENT_BROWSER.manage().window().maximize();
	}

	public void closeURL() {
		IResourceConstant.CURRENT_BROWSER.close();
	}

	public void switchFrame(String frame) {

		IResourceConstant.CURRENT_BROWSER.switchTo()
				.frame(IResourceConstant.CURRENT_BROWSER.findElement(By.className(frame)));

	}

	public WebElement accommodationsTitle() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("(//*[contains(text(),'Accommodations')])[2]"));
	}

	public WebElement massEditButton() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[contains(text(),'Mass edit')]"));
	}

	public WebElement compareButton() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("(//*[contains(text(),'Compare')])[1]"));
	}

	public WebElement resetFiltersButton() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[contains(text(),'Reset filters')]"));
	}

	public WebElement searchBar() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[@id='input_398']"));
	}

	public WebElement searchButton() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//md-icon[@aria-label='Search']"));

	}

	public WebElement currentViewDropDown() {
		
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("( //div[text()='Guest / Fleet'])[1]"));

	}

	public WebElement chooseCompliance() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//md-option[@value='Compliance']"));
	}

	public WebElement roomNo() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[contains(text(),'14004')]"));

	}

	public WebElement roomNoColumn() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[contains(text(),'Room #')]"));

	}

	public WebElement complianceColumn() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("(//*[contains(text(),'Compliance')])[2]"));

	}

	public WebElement calendarIcon() {

		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.xpath("( ( //*[contains(text(),'14004')]//following::td)[1]//following::Button)[1]"));

	}

	public void chooseDate(String date) {

		List<WebElement> allDates = IResourceConstant.CURRENT_BROWSER
				.findElements(By.xpath("//table[@class='md-calendar']//td"));

		for (WebElement ele : allDates) {

			String dateText = ele.getText();
			if (dateText.equalsIgnoreCase(date)) {
				ele.click();
				String oldDate=dateText.valueOf(date);
				break;
			}

		
		}
	

	}

	public WebElement editDate() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("(//input[@class='md-datepicker-input'])[1]"));

	}

	public WebElement tickIcon() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(
				"(//button[@class='md-icon-button xi-value-editable-actions-cancel md-button md-ink-ripple'])[2]"));

	}

	public WebElement crossIcon() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(
				"(//button[@class='md-icon-button xi-value-editable-actions-cancel md-button md-ink-ripple'])[1]"));

	}

	public String alertText() {

		// Alert alert=IResourceConstant.CURRENT_BROWSER.switchTo().alert();
		// WebDriverWait wait = new
		// WebDriverWait(IResourceConstant.CURRENT_BROWSER, 10);
		// Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		/*
		 * String parentWindowHandler =
		 * IResourceConstant.CURRENT_BROWSER.getWindowHandle(); // Store your
		 * parent window String subWindowHandler = null;
		 * 
		 * Set<String> handles =
		 * IResourceConstant.CURRENT_BROWSER.getWindowHandles(); // get all
		 * window handles Iterator<String> iterator = handles.iterator(); while
		 * (iterator.hasNext()){ subWindowHandler = iterator.next();
		 * 
		 * }
		 * IResourceConstant.CURRENT_BROWSER.switchTo().window(subWindowHandler)
		 * ; // switch to popup window ///////// String
		 * alertText=subWindowHandler.toString(); // perform operations on popup
		 * return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(
		 * "//*[contains(text(),roomNo)]")).getText();
		 */
		// IResourceConstant.CURRENT_BROWSER.switchTo().window(parentWindowHandler);
		// // switch back to parent window

		// return alert.getText();
		return "nothing";

	}

	public WebElement editButton() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//button[@id='xi-edit-start']"));

	}

	public WebElement turnDownStatusDropDown() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("(//span[@class='md-select-icon'])[6]"));

	}
	
	public WebElement turnDownStatusRequired() {
        return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//md-option[@value='Required']"));
	}
	public WebElement turnDownStatusNotRequired() {

        return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//md-option[@value='Not Required']"));
	}
	public WebElement turnDownStatusComplete() {

        return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//md-option[@value='Complete']"));
	}
	public WebElement turnDownStatus() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("(//*[contains(text(),'Turndown Status')]//following::div)[1]"));

	}
	
	public WebElement doneButton() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//button[@id='xi-edit-done']"));

	}

}
