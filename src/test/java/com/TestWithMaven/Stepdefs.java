package com.TestWithMaven;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by pc on 06-Feb-17.
 */
public class Stepdefs {
    HomePage homePage = new HomePage();
    @Given("^User navigates the Login link from Ipass homepage$")
    public void userNavigatesTheLoginLinkFromIpassHomepage() throws Throwable {
        homePage.login();
    }

    @And("^provides his email \"([^\"]*)\" and password \"([^\"]*)\" and selects the LoginButton$")
    public void providesHisEmailAndPasswordAndSelectsTheLoginButton(String userId, String password) throws Throwable {

    }

    @Then("^user should be logged in$")
    public void userShouldBeLoggedIn() throws Throwable {

    }
}
