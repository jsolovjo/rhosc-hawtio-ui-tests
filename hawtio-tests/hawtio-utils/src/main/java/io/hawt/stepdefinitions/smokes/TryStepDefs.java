package io.hawt.stepdefinitions.smokes;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class TryStepDefs {
    @When("^User clicks on About button$")
    public void userClicksOnAboutButton() {
        $(By.xpath("//button[@id='helpDropdownMenu']")).click();
        $(By.xpath("//a[contains(text(),'About')]")).should(exist).click();
    }

    @Then("^Verison of Hawtio is \"([^\"]*)\"$")
    public void versionOfHawtioIs(String version) {
        $(By.xpath("//dd[contains(text(),'2.7.1')]")).shouldBe(visible).shouldHave(exactText(version));
    }
}