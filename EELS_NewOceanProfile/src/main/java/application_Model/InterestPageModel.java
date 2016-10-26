package application_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constants.IResourceConstant;

public class InterestPageModel {

	public WebElement princessLogoButton() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//img[@class='top-image']"));
	}

	public WebElement relaxation() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Relaxation']"));
	}

	public WebElement adventure() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name='Adventure']"));
	}

	public WebElement beachActivities() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Beach Activities']"));
	}

	public WebElement culture() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Culture']"));
	}

	public WebElement familyFun() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Family Fun']"));
	}

	public WebElement fishing() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Fishing']"));
	}

	public WebElement hikingWalking() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Hiking & Walking']"));
	}

	public WebElement kayaklingRafting() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Kayakling & Rafting']"));
	}

	public WebElement kidsActivities() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Kids' Activities']"));
	}

	public WebElement party() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Party']"));
	}

	public WebElement fitness() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Fitness']"));
	}

	public WebElement photography() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Photography']"));
	}

	public WebElement romantic() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Romantice']"));
	}

	public WebElement sailing() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Sailing']"));
	}

	public static WebElement shopping() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Shopping']"));
	}

	public static WebElement sightSeeing() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Sight_Seeing']"));
	}

	public static WebElement singlesActivities() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Singles' Activities']"));
	}

	public static WebElement snorkelingDiving() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[@data-name = 'Snorkeling & Diving']"));
	}

	public static WebElement youthTeenAcitivities() {

		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.xpath("//span[@data-name = 'Youth & Teen Activities']"));
	}

	public static WebElement desc() {

		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.xpath("//h1[text()='Tell us a little about yourself.']"));
	}

	public static WebElement interestDesc() {

		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@class='preferences-subtitle']"));
	}

	public WebElement doneButton() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(".//*[@id='main']/div/div[3]/a"));
	}

	public WebElement hamburgerButton() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(""));
	}

}
