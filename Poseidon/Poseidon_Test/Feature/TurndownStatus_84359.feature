@tag
Feature: TurndownStatus_84359

  @tag1
  Scenario: Ability to view turndown status data
    Given user launches the URL for turndown status
    And xilodging homepage should be launched
    When user clicks on Accommodation menu item
    Then Accommodation page will open
    When user selects a room
    Then Room details page should be displayed
    #And Turn Down Status field is disabled
    When user clicks on Edit button
    Then Turn Down Status field should be enabled
    When user clicks on Turn Down Status field
    Then Required choice for Turn Down Status field should be displayed.
    Then Not Required choice for Turn Down Status field should be displayed.
    Then Complete choice for Turn Down Status field should be displayed.