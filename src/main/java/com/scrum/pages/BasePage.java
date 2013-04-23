package com.scrum.pages;


import com.scrum.WebDriverSingleton;
import org.openqa.selenium.WebDriver;

/**
 * @author Andrii.Dzynia
 */
public class BasePage {

  public WebDriver getDriver() {
    return WebDriverSingleton.getInstance();
  }
}
