# encoding: UTF-8
@test
Feature: Working with Home page


  Scenario: Home page welcome element check
    Given Home Page is open
    Then Welcome message is displayed

  Scenario: Home page welcome message get text
    Given Home Page is open
    Then Welcome message contains text "Welcome to the-internet"

  Scenario: Home page contains GitHub link
    Given Home Page is open
    When Click on 'Fork me on GitHub' link
    Then  GitHub repository is open


  Scenario: Home page contains examples link
    Given Home Page is open
    Then Available Examples list contains links
      | A/B Testing                                  |
      | Add/Remove Elements                          |
      | Basic Auth (user and pass: admin)            |
      | Broken Images                                |
      | Challenging DOM                              |
      | Checkboxes                                   |
      | Context Menu                                 |
      | Digest Authentication (user and pass: admin) |
      | Disappearing Elements                        |
      | Drag and Drop                                |
      | Dropdown                                     |
      | Dynamic Content                              |
      | Dynamic Controls                             |
      | Dynamic Loading                              |
      | Entry Ad                                     |
      | Exit Intent                                  |
      | File Download                                |
      | File Upload                                  |
      | Floating Menu                                |
      | Forgot Password                              |
      | Form Authentication                          |
      | Frames                                       |
      | Geolocation                                  |
      | Horizontal Slider                            |
      | Hovers                                       |
      | Infinite Scroll                              |
      | Inputs                                       |
      | JQuery UI Menus                              |
      | JavaScript Alerts                            |
      | JavaScript onload event error                |
      | Key Presses                                  |
      | Large & Deep DOM                             |
      | Multiple Windows                             |
      | Nested Frames                                |
      | Notification Messages                        |
      | Redirect Link                                |
      | Secure File Download                         |
      | Shadow DOM                                   |
      | Shifting Content                             |
      | Slow Resources                               |
      | Sortable Data Tables                         |
      | Status Codes                                 |
      | Typos                                        |
      | WYSIWYG Editor                               |


