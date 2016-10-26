package poseidon_Controller;

import java.util.concurrent.TimeUnit;

import poseidon_Constants.IResourceConstant;
import poseidon_Model.RoomStatusReportPageModel;

public class RoomStatusReportPageController {
	
	RoomStatusReportPageModel roomStatusReport= new RoomStatusReportPageModel();

	public void URL(String url, String browser){
		//if (browser == "FireFox") {
				IResourceConstant a = new IResourceConstant(browser);
					IResourceConstant.CURRENT_BROWSER.get(url);
					IResourceConstant.CURRENT_BROWSER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}

	public void waitForLoad(int seconds){
		roomStatusReport.waitForLoad(seconds);
	}

	public void openURL (String url, String browser){
		roomStatusReport.URL(url, browser);
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
		roomStatusReport.closeURL();
	}
	
	public void maximizeURL(){
		roomStatusReport.maxURL();
	}
	
	public void switchFrame(String frame){

		roomStatusReport.switchFrame(frame);
	
	}

	
	public String verifyRoomStatusReportTitle()
	{
		
		return roomStatusReport.roomStatusReportTitle().getText();
	}
	
	
}
