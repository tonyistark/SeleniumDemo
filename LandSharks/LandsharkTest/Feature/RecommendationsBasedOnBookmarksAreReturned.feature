@77609
Feature: Rrecommendations are returned based on bookmarked activities and/or excursions
		 This test is to make sure that we are getting recommendations returned to us that are based on the bookmarked products.
		 
@Test3
Scenario: Validate that recommendations are returned based on bookmarked activities and/or excursions
Given an activity or excursion has been bookmarked
When I make a recommendations call
Then I should get recommendations back based on the bookmarked product
Then I add another bookmark
Then the recommendations returned are not identical to the initial recommendations set
And bookmarked products are higher in the response
 
		
