@done @login
Feature: Login functionality

  Scenario: As Administrator I want be able to login to the system
    Given Administrator wants to login
    When Administrator login to the system with username admin and password admin
    Then Administrator should see home page
