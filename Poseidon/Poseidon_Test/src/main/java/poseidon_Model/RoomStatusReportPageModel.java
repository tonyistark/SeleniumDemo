package poseidon_Model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import poseidon_Constants.IResourceConstant;

public class RoomStatusReportPageModel {
	
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
	
	public WebElement roomStatusReportTitle(){
		return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[contains(text(),'Room Status Report')]"));
	}


}
