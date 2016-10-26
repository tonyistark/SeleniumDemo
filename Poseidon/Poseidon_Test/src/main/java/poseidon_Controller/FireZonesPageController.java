package poseidon_Controller;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import poseidon_Constants.IResourceConstant;
import poseidon_Model.FireZonesPageModel;
import java.util.List;

public class FireZonesPageController {

	FireZonesPageModel fireZones=new FireZonesPageModel();
	
	public void URL(String url, String browser){
		//if (browser == "FireFox") {
				IResourceConstant a = new IResourceConstant(browser);
					IResourceConstant.CURRENT_BROWSER.get(url);
					IResourceConstant.CURRENT_BROWSER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}

	public void waitForLoad(int seconds){
		fireZones.waitForLoad(seconds);
	}

	public void openURL (String url, String browser){
		fireZones.URL(url, browser);
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
		fireZones.closeURL();
	}
	
	public void maximizeURL(){
		fireZones.maxURL();
	}
	
	public void switchFrame(String frame){

		fireZones.switchFrame(frame);
	
	}
	public String verifyFireZonesTitle()
	{
		
		return fireZones.fireZonesTitle().getText();
	}
	public String validateFireZoneColumn()
	{
		return fireZones.fireZoneColumn().getText();
	}
	public String validateDeckColumn()
	{
		return fireZones.DeckColumn().getText();
	}
	public String validateFireZoneCapacityColumn()
	{
		return fireZones.FireZoneCapacityColumn().getText();
	}
	public String validateFireZoneOccupancyColumn()
	{
		return fireZones.FireZoneOccupancyColumn().getText();
	}
	public String validateVarianceColumn()
	{
		return fireZones.VarianceColumn().getText();	}
	public int[] variancevaluestext()
	{
		int i = fireZones.VarianceColumnValues().size();
		int[] variancevaluesint = new int[i];

		for(int j = 0; j<i; j++)
		{
			variancevaluesint[j] = Integer.parseInt(fireZones.VarianceColumnValues().get(j).getText());
			//System.out.println(variancevaluesint[j]);
		}
		//return getText();
		return variancevaluesint;
	}
}
