package application_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import constants.IResourceConstant;

public class MyCompassPageModel {

	public WebElement myCompassButton()
	{
		return IResourceConstant.CURRENT_BROWSER.findElement(By.cssSelector("#layout > div.navbar__navbarContainer___aeIxT > div > div.navbar__tabs___1z543 > div:nth-child(1)"));
	}
	
	public WebElement profileHeaderName()
	{
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("profile__name___2-5F3"));
	}
	public WebElement emailIdDisplay()
	{
		return IResourceConstant.CURRENT_BROWSER.findElement(By.cssSelector("#profile > div.profile__optionsContainer___3S2-d > div > div:nth-child(2) > span > div > div > div"));
	}
	public WebElement changePassword()
	{
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("profile__changeLink___e0nM2"));
	}
	public WebElement changeLoginId()
	{
		
		//WebElement a = IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='profile']/div[2]/div/div[3]/a[1]/button[profile__changeButton___nyd96]"));
		//return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='profile']/div[2]/div/div[3]/a[1]/button/div/span"));
		//return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[contains(text(),'CHANGE LOGIN ID')]"));//unable to locate element
		//return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@class='profile__changeButton___nyd96']"));
		//return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[text()='Change Login ID']"));
		//return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='profile']/div[2]/div/div[3]/a[1]"));
		//return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='profile']/div[2]/div/div[3]/a[1]/button/div"));
		//return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='profile']/div[2]/div/div[3]/a[1]/button"));
		//return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//span[contains(text(),'Change Login ID')]"));//unable to locate element
		//return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[(text()='Change Login ID')]"));
		//return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[(text()='CHANGE LOGIN ID')]"));//unable to locate element
		//return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@href='#/change-login-id']"));
		//return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='profile']/div[2]/div/div[3]/a[1]/button/div/span"));
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("profile__changeLink___e0nM2"));
	}
	public WebElement addPaymentMethod()
	{
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='payment-methods']/div[2]/a"));
		//return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='payment-methods']/div[2]/a/button/div/span"));

	}
	public WebElement paymentMethods()
	{
		 return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='payment-methods']/div[1]"));
		
	}
	public String title()
	{
		 return IResourceConstant.CURRENT_BROWSER.getTitle();
		
	}
	
	
}
