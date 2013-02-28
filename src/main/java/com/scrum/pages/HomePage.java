package com.scrum.pages;

import org.junit.Assert;
import org.openqa.selenium.By;


/**
 * @author Andrii.Dzynia
 */
public class HomePage extends  BasePage {


  public void checkThatPageOpened() {
    Assert.assertTrue(getDriver().findElement(By.linkText("Sign Out")).isDisplayed());
  }
}
