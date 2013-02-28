package com.scrum.behavior.login;

import com.scrum.behavior.BaseBehavior;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Andrii.Dzynia
 */
public class LoginBehavior extends BaseBehavior {

  @Given("^Administrator wants to login$")
  public void administratorWantsToLogin() {
    adminPerson.atLoginPage().open();
  }

  @When("^Administrator login to the system with username (.*) and password (.*)$")
  public void administratorLoginToTheSystemWithUsernameAndPassword(String username,
                                                                   String password) {
    adminPerson.atLoginPage().fillForm(username, password);
    adminPerson.atLoginPage().clickSignInButton();
  }

  @Then("^Administrator should see home page$")
  public void administratorShouldSeeHomePage() {
    adminPerson.atHomePage().checkThatPageOpened();
  }

  @Then("^Administrator should see login page$")
  public void administratorShouldSeeLoginPage() {
    adminPerson.atLoginPage().checkThatPageOpened();
  }
}
