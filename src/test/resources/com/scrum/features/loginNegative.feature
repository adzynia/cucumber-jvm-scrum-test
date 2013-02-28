@done @login
Feature: Login negative cases functionality

  Scenario Outline: As Administrator I forgotten the password and trying to login to the system
    Given Administrator wants to login
    When Administrator login to the system with username <username> and password <password>
    Then Administrator should see login page

  Examples:
    | username | password |
    |   test   |   test   |
    |   best   |   best   |
    |   auto   |   auto   |

