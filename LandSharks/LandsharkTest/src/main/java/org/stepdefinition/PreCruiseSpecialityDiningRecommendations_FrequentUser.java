package org.stepdefinition;

import static org.apitesting.Util.printExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apitesting.ExcelReader;
import org.apitesting.HttpConnector;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class PreCruiseSpecialityDiningRecommendations_FrequentUser {
	static ExcelReader reader = null;
	static String filePath = null;
	static HttpConnector server = null;
    static int noOfResponses = 0;
    static String attributeName_expected = null;
    static String attributeName_actual = null;
   static String attr_name ="";
  static List<String> exp_values = new ArrayList<String>(); 
   static List<String> actual_values = new ArrayList<String>();  



		
    @Given("^user loads datasheet#Reservable,Subcategory,user$")
    public static void getdata() throws Throwable{
    	  String filePath = null;
      	filePath = System.getProperty("user.dir")+"\\src\\main\\java\\";
      File excel = new File (filePath+"product_attribute_carnival_2016_08_16.xlsx");
      FileInputStream fis = new FileInputStream(excel);
      DataFormatter formatter = new DataFormatter();
      XSSFWorkbook wb = new XSSFWorkbook(fis);
      XSSFSheet sheet = wb.getSheet("Sheet1");
      int rowNum = sheet.getLastRowNum()+1;
      int colNum = sheet.getRow(0).getLastCellNum();
      String subcategory = "";
      String reservable = "";
      String name = "";
      //String [][] data1 = new String[rowNum][colNum];
  
      XSSFRow row;
      XSSFCell cell;
      String value;
      //String expected_values = new String();
      //String abc = null;
       
       
      
      //Use this code for standard excel file
      /*
      for (int i =1; i<rowNum; i++)
      {
      	   row = sheet.getRow(i);
      	   cell = row.getCell(22);
      	   value = formatter.formatCellValue(cell);
      	   subcategory = value.toString();
      	   cell = row.getCell(53);
      	   value = formatter.formatCellValue(cell);
      	   reservable = value.toString();
      	    if((reservable.equals("Y"))&&(subcategory.equals("Reminders")))
      	    {
      	    	 cell = row.getCell(1);
      			   value = formatter.formatCellValue(cell);
      			   attr_name = value.toString();
      			    exp_values.add(new String(attr_name));

      	    	System.out.println("Element found at row " + (i+1));
      	    	System.out.println(exp_values);
      	    }
      }*/
      

       //Use this code if the structure of the sheet gets changed
           row = sheet.getRow(0);
               	int attribute_reservable = 0;
      			int attribute_category = 0;
      			{
          for(int j = 0; j<colNum; j++){
           cell = row.getCell(j);
           value = formatter.formatCellValue(cell);
          String abc = value.toString();
         if (abc.equals("attribute.reservable")) 
         {attribute_reservable = j;
         }
          }
         for( int j = 0; j<colNum; j++){
      	     cell = row.getCell(j);
      	     value = formatter.formatCellValue(cell);
      	     String abc = value.toString();
      	   if (abc.equals("attribute.Product_subcategory")) 
      	   {attribute_category = j;
      	   

      	   }
         
         }
      
      			}
      	   for (int k =1; k<rowNum; k++)
      	   {   

      		   row = sheet.getRow(k);
      		   cell = row.getCell(attribute_category);
      		   value = formatter.formatCellValue(cell);
      		   subcategory = value.toString();
      		   cell = row.getCell(attribute_reservable);
      		   value = formatter.formatCellValue(cell);
      		   reservable = value.toString();
      		    if((reservable.equals("Y"))&&(subcategory.equals("Reminders")))
      		    {
      		    	 cell = row.getCell(1);
      				   value = formatter.formatCellValue(cell);
      				   attr_name = value.toString();
      				    exp_values.add(new String(attr_name));
      				    
      		    }

      		   
      	   }
      	   noOfResponses = exp_values.size();
      	   
    	
    
	    
	      }

    @When("^I run the Pre-Cruise Dining API call$")
    public static void hiturl() throws IOException, Throwable{
    	/*		
		ArrayList<String> Url = new ArrayList<String>();
		Url.add("B2");
		ArrayList<String> expectedUrl =  reader.readExcel(filePath, "Datasheet.xlsx", "url", Url);
		
		printExcel(expectedUrl);
		*/
		URL url = new URL("http://52.200.91.61/redirector.php?placements=category_page.precruise_mealreservations&apiKey=364113acb8e80040&apiClientKey=594bd736d0b8be36&sessionId=1238&excludeHTML=true&userId=yvan19&userAttribute=activity_type:Relaxation;Fishing&categoryId=reminders&count=999&filterAtr=voyage_no:1606");

		server = new HttpConnector(url);
		
    }

    @Then("^I should see pre-cruise dining restaurant recommendations$")
    public static void response() throws Throwable {
    	int actualvalue = 0;
    	String response = server.getResponse();
		server.printResponse(response);
		JSONObject jsonResponse = new JSONObject(response);
		JSONArray resultsArray = jsonResponse.getJSONArray("placements"); 		 
		 for (int i = 0; i < resultsArray.length(); i++) { 
		 JSONObject resultsObject = resultsArray.getJSONObject(i); 
		JSONArray addressArray = resultsObject.getJSONArray("recommendedProducts");  		 
		for (int j = 0; j < addressArray.length(); j++) {  
		JSONObject addressObject = addressArray.getJSONObject(j); 
		 Iterator key = addressObject.keys();  
		 while (key.hasNext()) {  	
		String k = key.next().toString();
		if(k.equals("name"))
				{
		System.out.println("Key : " + k + ", value : " + addressObject.getString(k)); 
		attributeName_actual = addressObject.getString(k);
		    actual_values.add(new String(attributeName_actual));
		    actualvalue++;

		} 
		} 
                /*if(k.equals("totalItemCount"))
                {
                	actualvalue = objects.getString(k);
                }*/
            }
            // System.out.println(objects.toString());
            System.out.println("-----------"); 
            System.out.println("The actual value is "+actualvalue);
         
       boolean has_value = false;
           // int noOfResponses = ReadExcelValues.excelReader();
        	   	System.out.println("The expected value is "+noOfResponses);
        	   	
        	   	if((actualvalue==noOfResponses)&&(actual_values.retainAll(exp_values)))
        	   	{
        	   		has_value = true;
        	   	
        	   		}

            
		assert has_value;
    }
}}