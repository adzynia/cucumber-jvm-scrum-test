package com.scrum.behavior.login;

import com.scrum.pages.LoginPage;
import com.scrum.steps.AdminPerson;
import org.openqa.selenium.By;

import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: alpa
 * Date: 23/04/13
 * Time: 14:41
 * To change this template use File | Settings | File Templates.
 */
public class LoginAssert extends LoginPage {

    public void checkThatPageOpened() {
        assertTrue(getDriver().findElement(SIGN_IN).isDisplayed());
    }

    public void checkThatHomePageOpened() {
        assertTrue(getDriver().findElement(By.linkText("Sign Out")).isDisplayed());
    }
}
