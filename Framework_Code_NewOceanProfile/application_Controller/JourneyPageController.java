package application_Controller;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import application_Model.JourneyPageModel;

public class JourneyPageController {

	JourneyPageModel JourneyPageModel = new JourneyPageModel();
	
	public void clickMorningAddEvent1()
	{
		JourneyPageModel.morningAddEvent1().click();
	}
	public void clickDay1()
	{
		JourneyPageModel.day1().click();
	}
	public void clickDay2()
	{
		JourneyPageModel.day2().click();
	}
	public void clickDay3()
	{
		JourneyPageModel.day3().click();
	}
	public void clickDay4()
	{
		JourneyPageModel.day4().click();
	}
	public void clickDay5()
	{
		JourneyPageModel.day5().click();
	}
	public void clickDay6()
	{
		JourneyPageModel.day6().click();
	}
	public void clickDay7()
	{
		JourneyPageModel.day7().click();
	}
	public void clickDay8()
	{
		JourneyPageModel.day8().click();
	}
	public void clickDay9()
	{
		JourneyPageModel.day9().click();
	}
	public void clickDay10()
	{
		JourneyPageModel.day10().click();
	}
	
	public void clickPrincessLogo()
	{
		JourneyPageModel.princessLogo().click();
	}
	
	public String journeyValidationCheck(){

		String journeyTitle=	JourneyPageModel.journeyValidation().getText();
			System.out.println(journeyTitle);
			return journeyTitle;
		
		}
	public String getBookedEventTimeslot(){
		return JourneyPageModel.bookedEventTimeslot().getText();
		
	}
/*	public boolean addEvent2Enabled(){
		return JourneyPageModel.addEvent2().isEnabled();
	}

	public void clickAddEvent2(){
		JourneyPageModel.addEvent2().click();
	}
	*/
	
	
	}

