@tag
Feature: ViewVarianceValuesForFireZones_84365



  @tag1
  Scenario: View Fire Zones and Details
    Given user launches the URLfirezone
    And xilodging homepage1 is launched4
    When user clicks on FIRE ZONES1
    Then FIRE ZONES page should be displayed1
    And Variance between the fire zone's capacity and occupancy should be displayed1
    
