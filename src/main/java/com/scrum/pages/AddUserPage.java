package com.scrum.pages;

import com.scrum.data.User;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * @author Andrii.Dzynia
 */
public class AddUserPage extends BasePage {
  public void openAddUserPage() {
    getDriver().get("http://cells.org.ua/scrum-selenium/admin/pageEditMember.php");
  }

  public void submitUser(User user) {
    getDriver().findElement(By.name("memberID")).sendKeys(user.userName);
    getDriver().findElement(By.name("password")).sendKeys(user.password);
    getDriver().findElement(By.name("confirmPassword")).sendKeys(user.password);
    getDriver().findElement(By.name("email")).sendKeys(user.email);
    getDriver().findElement(By.name("saveChanges")).click();

  }

  public void checkThatEditUserPageOpened(User user) {
    Assert.assertTrue(getDriver().findElement(By.tagName("body")).getText().contains("Edit Member '" + user.userName + "'"));
  }
}
