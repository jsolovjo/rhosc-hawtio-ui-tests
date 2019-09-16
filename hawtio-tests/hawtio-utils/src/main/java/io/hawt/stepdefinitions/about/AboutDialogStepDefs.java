package io.hawt.stepdefinitions.about;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.Condition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AboutDialogStepDefs {
	@Then("^The \"([^\"]*)\" header is presented in About dialog$")
	public void aboutDialogHeaderIsPresented(String aboutDialogHeader) {
		$(By.xpath("//h1[@class='pf-c-title pf-m-4xl ng-binding']")).shouldHave(Condition.exactText(aboutDialogHeader));
	}

	@And("^The \"([^\"]*)\" is presented in About dialog$")
	public void hawtioComponentIsPresented(String hawtioComponent) {
		$(By.xpath("//dt[contains(text(),'" + hawtioComponent + "')]")).shouldBe(visible);
	}
}
