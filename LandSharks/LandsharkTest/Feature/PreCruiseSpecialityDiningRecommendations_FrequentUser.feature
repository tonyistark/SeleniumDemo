@77637
Feature: Pre-Cruise Specialty Dining
         This test will validate that Pre-Cruise Specialty Dining recommendations for 
         frequent cruisers are returned based on a guest's preferences.
         Frequent cruisers are defined as yvan users at the moment. 

@Test1
Scenario: Validate that Pre-Cruise Specialty Dining recommendations for frequent cruisers are returned_77637
Given user loads datasheet#Reservable,Subcategory,user
When I run the Pre-Cruise Dining API call
Then I should see pre-cruise dining restaurant recommendations
