package poseidon_Controller;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import poseidon_Constants.IResourceConstant;

import poseidon_Model.HomePageModel;

public class HomePageController {
	
	HomePageModel home = new HomePageModel();
	
	public void URL(String url, String browser){
		//if (browser == "FireFox") {
				IResourceConstant a = new IResourceConstant(browser);
					IResourceConstant.CURRENT_BROWSER.get(url);
					IResourceConstant.CURRENT_BROWSER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}

	public void waitForLoad(int seconds){
		home.waitForLoad(seconds);
	}

	public void openURL (String url, String browser){
		home.URL(url, browser);
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
		home.closeURL();
	}
	
	public void maximizeURL(){
		home.maxURL();
	}
	
	public void switchFrame(String frame){

		home.switchFrame(frame);
	
	}
    
	////////////////////////// Verify Labels of the Home Page////////////////////////////////////
	
	public String verifyTitleText()
	{
		
		return home.title().getText();	
	}
	
	public String verifyAccommodationsMenuItemText()
	{
		
		return home.accommodations().getText();
	}
	
	public String verifyAssemblyStationsMenuItemText()
	{
		
		return home.assemblyStations().getText();
	}
	
	public String verifyFireZonesMenuItemText()
	{
		
		return home.fireZones().getText();
	}
	
	public String verifyHousekeepingSetupMenuItemText()
	{
		
		return home.housekeepingSetup().getText();
				
	}
	
	public String verifyNightAuditMenuItemText()
	{
		
		return home.nightAudit().getText();
	}
	
	public String verifyRoomStatusReportMenuItemText()
	{
		
		return home.roomStatusReport().getText();
	}
	
	
	///////////////////////////////Click Elements on Home Page//////////////////////////////////
	
	public void clickAccommodationsMenuItem()
	{
				home.accommodations().click();
	}
	
	
	public void clickAssembltStationsMenuItem()
	{
				home.assemblyStations().click();
	}
	
		
	public void clickFireZonesMenuItem()
	{
				home.fireZones().click();
	}
	
		
	public void clickHousekeepingSetupMenuItem()
	{
				home.housekeepingSetup().click();
				
	}
		

	public void clickNightAuditMenuItem()
	{
				home.nightAudit().click();
	}
	
	public void clickRoomStatusReportMenuItem()
	{
				home.roomStatusReport().click();
				
	}
	
		

	
	
}
