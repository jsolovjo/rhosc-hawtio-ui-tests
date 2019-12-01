package io.hawt.stepdefinitions.authentication;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.hawt.pageobjects.pages.HawtioPage;
import io.hawt.pageobjects.pages.LoginPage;

public class authenticationStepDefs {
    private LoginPage loginPage = new LoginPage();

    @Given("^User is on Login page$")
    public void userIsOnLoginPage() {
        loginPage.loginPageIsOpened();
    }

    @When("^User enters credantials username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userEntercredantialsUsername(String username,String password) {
        loginPage.login(username, password);
    }

    @Then("^Login fails$")
    public void loginFails() {
        loginPage.loginPageIsOpened();
    }
}
