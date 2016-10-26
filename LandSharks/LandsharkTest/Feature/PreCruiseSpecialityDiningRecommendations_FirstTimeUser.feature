@77638
Feature: Pre-Cruise Specialty Dining
         This test will validate that Pre-Cruise Specialty Dining recommendations for 
         frequent cruisers are returned based on a guest's preferences.
         Frequent cruisers are defined as yvan users at the moment. 

@Test2
Scenario: Validate that Pre-Cruise Specialty Dining recommendations for first time cruisers are returned_77638
Given user loads datasheet1#Reservable,Subcategory,user
When I run the Pre-Cruise Dining API call1
Then I should see pre-cruise dining restaurants recommendations1