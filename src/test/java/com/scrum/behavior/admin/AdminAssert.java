package com.scrum.behavior.admin;

import com.scrum.data.User;
import com.scrum.pages.AddUserPage;
import org.openqa.selenium.By;

import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: alpa
 * Date: 23/04/13
 * Time: 14:41
 * To change this template use File | Settings | File Templates.
 */
public class AdminAssert extends AddUserPage {

    public void checkThatEditUserPageOpened(User user) {
        assertTrue(getDriver().findElement(By.tagName("body")).getText().contains("Edit Member '" + user.userName + "'"));
    }
}
