@tag
Feature: InabilitytoSaveAlphaAlphaNumeric_84385

  @tag1
  Scenario: Inability to save alpha & alpha-numeric as a valid date in the Compliance / Date of Inspection field
    Given user launches the URL
   And xilodging homepage is launched
  When user clicks on Accommodation
    Then Accommodation page should be displayed
    When user selects current view as Compliance
    Then Room No and Compliance columns should be displayed
    When user chooses any date.
    And user edits the date.
    And user clicks the tick icon
    Then error message should be displayed
