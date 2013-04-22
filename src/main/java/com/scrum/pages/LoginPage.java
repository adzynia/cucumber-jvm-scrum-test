package com.scrum.pages;

import org.openqa.selenium.By;

/**
 * @author Andrii.Dzynia
 */
public class LoginPage  extends BasePage {

  public static final By SIGN_IN = By.name("signIn");

  public void open() {
       getDriver().get("http://cells.org.ua/scrum-selenium/index.php?signIn=1");

  }

  public void fillForm(String username, String password) {
    getDriver().findElement(By.name("username")).sendKeys(username);
    getDriver().findElement(By.name("password")).sendKeys(password);
  }

  public void clickSignInButton() {
    getDriver().findElement(SIGN_IN).click();
  }

  public void checkThatPageOpened() {
    //TODO: Move to src/test into Steps Object Layer
//    Assert.assertTrue(getDriver().findElement(SIGN_IN).isDisplayed());
  }
}
