@addMembershipPage @regression
Feature: Add Membership Page

  Scenario Outline: As an admin I should be able to edit memberships details
    Given Login with Admin credential
    And Navigate to PIM and Employee List page
    And User should be see list of employees
    And Enter Employee Name to input
    And Click seach button
    And Should see employee in filter list
    And Click on employee name
    When Click on MORE dropdown in Personal Details Page
    And Click on Membership  link
    And Click plus button on right corner
    When Upon clicking on plus sign modal "Add Membership" should be displayed
    And The modal should have the following fields
      | Membership*                |
      | Subscription Paid By       |
      | Subscription Amount        |
      | Currency                   |
      | Subscription Commence Date |
      | Subscription Renewal Date  |
    And Enter Membership "<Membership>"
    And Enter Subscription Paid By "<SubscriptionPaidBy>"
    And Enter Subscription Amount "<SubscriptionAmount>"
    And Enter Currency "<Currency>"
    And Enter Subscription Commence Date "<SubscriptionCommenceDate>"
    And Enter Subscription Renewal Date "<SubscriptionRenewalDate>"
    And Click Save button
    Then Entered information should be displayed on the Assigned Memberships table "<Membership>"

    Examples:
      | Membership               | SubscriptionPaidBy | SubscriptionAmount | Currency             | SubscriptionCommenceDate | SubscriptionRenewalDate |
      | Gym Membership           | Individual         | 150                | United States Dollar | Tue, 12 Nov 2024         | Wed, 20 Nov 2030        |
      | British Computer Society | Company            | 200                | United States Dollar | Tue, 12 Nov 2024         | Wed, 20 Nov 2030        |
      | USAU Membership          | Individual         | 100                | United States Dollar | Tue, 12 Nov 2024         | Wed, 20 Nov 2030        |
