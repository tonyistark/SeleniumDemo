package application_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constants.IResourceConstant;

public class JourneyPageModel {

	/*
	 * public WebElement addEvent() { return
	 * IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(
	 * ".//*[@id='voyage-subview-root']/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/span"
	 * )); } public WebElement addEvent2() { return
	 * IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(
	 * ".//*[@id='voyage-subview-root']/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/span"
	 * )); }
	 */
	public WebElement day1() {
		// return
		// IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(".//*[@id='parallax-slider']/div[3]/div[1]"));
		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.cssSelector("#parallax-slider > div.ps-dot-wrap > div:nth-child(1)"));

	}

	public WebElement day2() {
		// return
		// IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(".//*[@id='parallax-slider']/div[3]/div[2]"));
		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.cssSelector("#parallax-slider > div.ps-dot-wrap > div:nth-child(2)"));

	}

	public WebElement day3() {
		// return
		// IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(".//*[@id='parallax-slider']/div[3]/div[3]"));
		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.cssSelector("#parallax-slider > div.ps-dot-wrap > div:nth-child(3)"));

	}

	public WebElement day4() {
		// return
		// IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(".//*[@id='parallax-slider']/div[3]/div[4]"));
		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.cssSelector("#parallax-slider > div.ps-dot-wrap > div:nth-child(4)"));

	}

	public WebElement day5() {
		// return
		// IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(".//*[@id='parallax-slider']/div[3]/div[5]"));
		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.cssSelector("#parallax-slider > div.ps-dot-wrap > div:nth-child(5)"));

	}

	public WebElement day6() {
		// return
		// IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(".//*[@id='parallax-slider']/div[3]/div[6]"));
		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.cssSelector("#parallax-slider > div.ps-dot-wrap > div:nth-child(6)"));

	}

	public WebElement day7() {
		// return
		// IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(".//*[@id='parallax-slider']/div[3]/div[7]"));
		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.cssSelector("#parallax-slider > div.ps-dot-wrap > div:nth-child(7)"));

	}

	public WebElement day8() {
		// return
		// IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(".//*[@id='parallax-slider']/div[3]/div[8]"));
		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.cssSelector("#parallax-slider > div.ps-dot-wrap > div:nth-child(8)"));

	}

	public WebElement day9() {
		// return
		// IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(".//*[@id='parallax-slider']/div[3]/div[9]"));
		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.cssSelector("#parallax-slider > div.ps-dot-wrap > div:nth-child(9)"));

	}

	public WebElement day10() {
		// return
		// IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(".//*[@id='parallax-slider']/div[3]/div[10]"));
		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.cssSelector("#parallax-slider > div.ps-dot-wrap > div:nth-child(10)"));

	}

	public WebElement day11() {
		// return
		// IResourceConstant.CURRENT_BROWSER.findElement(By.xpath(".//*[@id='parallax-slider']/div[3]/div[10]"));
		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.cssSelector("#parallax-slider > div.ps-dot-wrap > div:nth-child(11)"));

	}

	public WebElement journeyValidation() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("subnav-title"));
	}

	public  WebElement bookedEventTimeslot() {
		return IResourceConstant.CURRENT_BROWSER.findElement(
				By.xpath(".//*[@id='voyage-subview-root']/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]"));
	}

	public WebElement princessLogo() {
		return IResourceConstant.CURRENT_BROWSER
				.findElement(By.cssSelector("#topnav > div > a.top-tab.top-logo > img"));
	}

	public WebElement morningAddEvent1() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.tagName("//span[@class='button-title']"));

	}

}
