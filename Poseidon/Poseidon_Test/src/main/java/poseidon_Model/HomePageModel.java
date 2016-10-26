package poseidon_Model;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import poseidon_Constants.IResourceConstant;

public class HomePageModel {
	
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
	public WebElement title(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//h1[@class='md-title ng-binding']"));	
	}
	
	public WebElement accommodations(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("(//*[contains(text(),'Accommodations')])[1]"));
	}
	
		
	public WebElement assemblyStations(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[contains(text(),'Assembly Stations')]"));
	}
	
	public WebElement fireZones(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("(//*[contains(text(),'Fire Zones')])[1]"));	
	}
	
	public WebElement housekeepingSetup(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("(//*[contains(text(),'Housekeeping Setup')])[1]"));
	}
	
	public WebElement nightAudit(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[contains(text(),'Night Audit')]"));
	}
	
	public WebElement roomStatusReport(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[contains(text(),'Room status report')]"));
	}
	


}


