# encoding: UTF-8
@test
Feature: Working with A/B Testing page

  Scenario: Open A/B Testing Example
    Given Home Page is open
    When I am opening "A/B Testing" page
    Then AB Testing page has content

  Scenario: A/B Testing page contains GitHub link
    Given Home Page is open
    When I am opening "A/B Testing" page
    When Click on 'Fork me on GitHub' link
    Then  GitHub repository is open

  Scenario: A/B Testing content has title and text
    Given Home Page is open
    And I am opening "A/B Testing" page
    Then Content title get text "A/B Test Control" or "A/B Test Variation 1"
    And Content contains text "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through)."


