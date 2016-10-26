package poseidon_Controller;

import java.util.concurrent.TimeUnit;

import poseidon_Constants.IResourceConstant;
import poseidon_Model.HousekeepingSetupPageModel;

public class HousekeepingSetupPageController {
	
	HousekeepingSetupPageModel housekeepingSetup= new HousekeepingSetupPageModel();

	public void URL(String url, String browser){
		//if (browser == "FireFox") {
				IResourceConstant a = new IResourceConstant(browser);
					IResourceConstant.CURRENT_BROWSER.get(url);
					IResourceConstant.CURRENT_BROWSER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}

	public void waitForLoad(int seconds){
		housekeepingSetup.waitForLoad(seconds);
	}

	public void openURL (String url, String browser){
		housekeepingSetup.URL(url, browser);
	}
	
	public void waitForLoad(){
		waitForLoad(10);
		
	}
	
	public void openURL(String browser){
		openURL(IResourceConstant.WEB_URL, browser);
	}
	
	public void openURL(){
		openURL("FireFox");
	}
	
	public void closeURL(){
		housekeepingSetup.closeURL();
	}
	
	public void maximizeURL(){
		housekeepingSetup.maxURL();
	}
	
	public void switchFrame(String frame){

		housekeepingSetup.switchFrame(frame);
	
	}
	public String verifyHousekeepingSetupTitle()
	{
		
		return housekeepingSetup.housekeepingSetupTitle().getText();
				
	}
	
}
