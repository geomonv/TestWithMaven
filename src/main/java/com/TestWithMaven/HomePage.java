package com.TestWithMaven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by pc on 06-Feb-17.
 */
public class HomePage extends BasePage {
//    @FindBy(css = "#menu-item-1825 a i")
//    WebElement loginIcon;
//    @FindBy(linkText = "Login ")
//    WebElement loginLink;
@FindBy(css = "#email")
WebElement email;
@FindBy(css = "#pass")
WebElement password;
    public void login() {
//        loginIcon.click();
//        loginLink.click();
        email.sendKeys("username");
        password.sendKeys("password");

    }
}
