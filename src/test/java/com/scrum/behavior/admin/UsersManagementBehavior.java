package com.scrum.behavior.admin;

import com.scrum.behavior.BaseBehavior;
import com.scrum.data.User;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.PendingException;

import java.util.List;
import java.util.Random;

/**
 * @author Andrii.Dzynia
 */
public class UsersManagementBehavior extends BaseBehavior {

  private User user;

  @Given("^Administrator want to add new user$")
  public void administratorWantToAddNewUser() {
    adminPerson.login();
    adminPerson.atAddUser().openAddUserPage();
  }

  @When("^Administrator add user with data$")
  public void administratorAddUserWithData(List<User> listUsers) {
    for (User userToAdd : listUsers) {
      userToAdd.userName = userToAdd.userName + new Random().nextInt();
      adminPerson.atAddUser().submitUser(userToAdd);
      user = userToAdd;
    }
  }

  @Then("^Administrator should see edit page for created user$")
  public void administratorShouldSeeEditPageForCreatedUser() {
    adminPerson.atAddUser().checkThatEditUserPageOpened(user);
  }
}
