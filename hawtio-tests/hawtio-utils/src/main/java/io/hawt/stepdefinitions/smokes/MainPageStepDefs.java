package io.hawt.stepdefinitions.smokes;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MainPageStepDefs {
	@Given("^User is on Hawtio page$")
	public void userIsOnHawtioPage() {
		$(By.xpath("//user-dropdown[@class='ng-isolate-scope']")).shouldBe(visible);
	}

	@Then("^User is logged in$")
	public void userIsLoggedIn() {
		$(By.xpath("//user-dropdown[@class='ng-isolate-scope']")).shouldBe(visible);
	}
}
