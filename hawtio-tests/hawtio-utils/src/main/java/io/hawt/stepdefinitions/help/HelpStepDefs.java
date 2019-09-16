package io.hawt.stepdefinitions.help;

import static org.junit.Assert.assertTrue;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.navigator;
import static com.codeborne.selenide.WebDriverRunner.url;

import org.openqa.selenium.By;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.hawt.pageobjects.pages.HawtioPage;
import io.hawt.pageobjects.pages.help.HelpPage;

public class HelpStepDefs {
	private HawtioPage hawtioPage = new HawtioPage();
	private HelpPage helpPage;

	@Given("^User is on \"([^\"]*)\" tab of Help page$")
	public void userIsOnTabOfHelpPage(String tabName) {
		helpPage = hawtioPage.panel().help().switchTab(tabName);
	}

	@When("^User clicks on link text \"([^\"]*)\"$")
	public void userClicksOnLinkText(String linkText) {
		$(By.linkText(linkText)).shouldBe(visible).click();
	}

	@When("^User clicks on \"([^\"]*)\" tab of Help page$")
	public void userClicksOnTabOfHelpPage(String tabName) {
		helpPage.switchTab(tabName);
	}

	@Then("^User is redirected to the \"([^\"]*)\"$")
	public void userIsRedirectedToTheUrl(String testedUrl) {
		assertTrue(url().contains(testedUrl));
	}

	@Then("^Header of \"([^\"]*)\" and header's id \"([^\"]*)\" are presented$")
	public void helpPageTabHeaderArePresented(String tabName, String tabId) {
		helpPage.checkHeaderAndIdOfTab(tabName, tabId);
	}

	@And("^User is returned to previous page$")
	public void userIsReturnedToPreviousPage() {
		navigator.back();
	}
}
