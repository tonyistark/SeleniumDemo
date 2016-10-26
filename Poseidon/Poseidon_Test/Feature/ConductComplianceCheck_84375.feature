@tag
Feature: ConductComplianceCheck_84375

  @tag1
  Scenario: ability to update the "date of inspection" on rooms using Free Text
    Given user launches the poseidon URL
    And xilodging homepage is launched successfully
    When user clicks on Accommodation tab
    Then Accommodation page should be displayed fine
    When user selects current view as Compliance view
    Then Room No and Compliance columns should be displayed correct
    When user chooses any date
    And user clicks the tick ico
    When user clicks on Assembly Station tab
    And user clicks on Accommodation tab2
    Then user validates the date selected