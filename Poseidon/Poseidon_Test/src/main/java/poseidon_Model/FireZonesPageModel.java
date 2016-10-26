package poseidon_Model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import poseidon_Constants.IResourceConstant;

public class FireZonesPageModel {
	
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
	
	public WebElement fireZonesTitle(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("(//*[contains(text(),'Fire Zones')])[2]"));	
	}
	
	public WebElement fireZoneColumn(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("(//span[@class='md-title'])[1]"));	

	}
	public WebElement DeckColumn(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("(//span[@class='md-title'])[2]"));	

	}
	public WebElement FireZoneCapacityColumn(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("(//span[@class='md-title'])[3]"));	

	}
	public WebElement FireZoneOccupancyColumn(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("(//span[@class='md-title'])[4]"));	

	}
	public WebElement VarianceColumn(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("(//span[@class='md-title'])[5]"));	

	}
	public List<WebElement> VarianceColumnValues(){
		List<WebElement> variancevalues = IResourceConstant.CURRENT_BROWSER.findElements(By.xpath("(//*[@class='md-row ng-scope']/td[5])"));	
		return variancevalues;

	}
	

}
