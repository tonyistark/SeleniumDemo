package application_Model;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constants.IResourceConstant;
public class SelectInterestsPageModel {
	public WebElement interestsHeader(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.cssSelector("#interests > div.header__header___21Ech > div > h3"));
	}
	public WebElement interestsMessage(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("interests__message___2DeZ2"));
	}
	public WebElement interestBubbleAdventure(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@data-id='Adventure']"));
	}
	public WebElement interestBubbleSightseeing(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@data-id='Sightseeing']"));
	}
	public WebElement interestBubbleYouthActivities(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@data-id='Youth Activities']"));
	}
	public WebElement interestBubbleSingles(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@data-id='Singles']"));
	}
	public WebElement interestBubbleFitness(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@data-id='Fitness']"));
	}
	public WebElement interestBubbleHistory(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@data-id='History']"));
	}
	public WebElement interestBubblePhotography(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@data-id='Photography']"));
	}
	public WebElement interestBubbleKidsActivities(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@data-id='Kids Activities']"));
	}
	public WebElement interestBubbleRomantic(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@data-id='Romantic']"));
	}
	public WebElement interestBubbleTeenActivities(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@data-id='Teen Activities']"));
	}
	public WebElement interestBubbleRelaxation(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@data-id='Relaxation']"));
	}
	public WebElement interestBubbleSocial(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@data-id='Social']"));
	}
	public WebElement interestBubbleCulture(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@data-id='Culture']"));
	}
	public WebElement interestBubbleFamilyFun(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@data-id='Family Fun']"));
	}
	public WebElement interestBubbleDiningOut(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[@data-id='Dining Out']"));
	}
	public WebElement createProfile(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='interests']/div[3]/div/button/div/span"));
	}	

}
