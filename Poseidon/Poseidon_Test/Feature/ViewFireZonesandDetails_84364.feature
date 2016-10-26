@tag
Feature: ViewFireZonesandDetails_84364


  @tag1
  Scenario: View Fire Zones and Details
    Given user launches the URL for firezone
    And xilodging homepage is launched
    When user clicks on FIRE ZONES
    Then FIRE ZONES page should be displayed
    And Fire zone should be displayed
    And Deck should be displayed
    And Fire zone capacity should be displayed
    And Fire zone occupancy should be displayed
    And Variance between the fire zone's capacity and occupancy should be displayed
    
