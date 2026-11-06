@regression @newDisciplinary
Feature: Create new disciplinary case functionality

  Scenario: As an Admin I should be able to create a Disciplinary Case.
    Given Login with Admin credential
    When Navigate to Disiplinary Case page
    And Click plus button on right corner for disciplinary modal
    And The Disciplinary Case modal should have the following fields
      | Employee Name * |
      | Case Name *     |
      | Description     |
    And Enter employee name "Frank Williams"
    And Enter case name "Internet misuse"
    And Enter description "Usage of Internet has been exceeded the limit"
    Then Upon Clicking Save additional fields should display This is out of scope for this development cycle
    And Upon Clicking Save and clicking Cancel
    #complete this step later.
    And User should see entered information in the Disciplinary Cases table