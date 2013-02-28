
  @done @admin @users
  Feature: Users Management on Admin Panel

  Scenario: As Administrator I want be able to create new users
    Given Administrator want to add new user
    When Administrator add user with data
      | userName | password | email          |
      | testuser | defaultp | test@email.com |
    Then Administrator should see edit page for created user




