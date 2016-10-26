@tag
Feature: SingleRoomTurndownStatusUpdate_84367
  @tag1
  Scenario: Ability to update the turndown status data
    Given user launches the URL2
    And xilodging homepage is launched2
    When user clicks on Accommodation2
    Then Accommodation page should be displayed2
    When user selects a room1
    Then Room details page should be displayed1
    When user clicks on Edit button1
    Then Turn Down Status field should be enabled1
    When user clicks on Turn Down Status field1
    Then user updates the Turn Down Status field
    When user clicks on the Done button
    Then Turn Down Status field is showing the updated value