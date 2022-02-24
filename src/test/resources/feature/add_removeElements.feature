# encoding: UTF-8
@test
Feature: Working with Add/Remove Elements page

  Scenario: Open Add/Remove Elements Example
    Given Home Page is open
    When I am opening "Add/Remove Elements" page
    Then Add/Remove Elements page has content title
    And 'Add Element' button is displayed

  Scenario: Checking the 'Delete' button does not displayed
    Given Home Page is open
    When I am opening "Add/Remove Elements" page
    And 'Add Element' button is displayed
    Then 'Delete' button is not displayed

    Scenario: Checking the 'Delete' button displayed
      Given Home Page is open
      When I am opening "Add/Remove Elements" page
      And I click 'Add Element' button
      Then 'Delete' button is displayed

  Scenario: Checking the 'Delete' button does not displayed after click on 'Delete' button
    Given Home Page is open
    When I am opening "Add/Remove Elements" page
    And I click 'Add Element' button
    Then 'Delete' button does not displayed

  Scenario: List of 'Delete' buttons is displayed
    Given Home Page is open
    When I am opening "Add/Remove Elements" page
    And I click 'Add Element' button
    And 'Delete' button is displayed
    And I click 'Add Element' button
    Then List of elements contained two 'Delete' buttons

  Scenario: A/B Testing page contains GitHub link
    Given Home Page is open
    When I am opening "Add/Remove Elements" page
    Then 'Fork me on GitHub' link is displayed








