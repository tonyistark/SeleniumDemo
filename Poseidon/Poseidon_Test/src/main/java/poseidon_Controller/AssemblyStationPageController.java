package poseidon_Controller;

import java.util.concurrent.TimeUnit;

import poseidon_Constants.IResourceConstant;
import poseidon_Model.AssemblyStationPageModel;

public class AssemblyStationPageController {

	AssemblyStationPageModel assemblyStation= new AssemblyStationPageModel();
	
	public void URL(String url, String browser){
		//if (browser == "FireFox") {
				IResourceConstant a = new IResourceConstant(browser);
					IResourceConstant.CURRENT_BROWSER.get(url);
					IResourceConstant.CURRENT_BROWSER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}

	public void waitForLoad(int seconds){
		assemblyStation.waitForLoad(seconds);
	}

	public void openURL (String url, String browser){
		assemblyStation.URL(url, browser);
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
		assemblyStation.closeURL();
	}
	
	public void maximizeURL(){
		assemblyStation.maxURL();
	}
	
	public void switchFrame(String frame){

		assemblyStation.switchFrame(frame);
	
	}
	
	public String verifyAssemblyStationsTitle()
	{
		
		return assemblyStation.assemblyStationsTitle().getText();
	}
}
