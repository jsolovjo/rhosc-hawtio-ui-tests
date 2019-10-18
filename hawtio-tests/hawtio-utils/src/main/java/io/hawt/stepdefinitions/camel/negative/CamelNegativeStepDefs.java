package io.hawt.stepdefinitions.camel.negative;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.hawt.pageobjects.fragments.camel.tabs.endpoints.CamelEndpoints;
import io.hawt.pageobjects.pages.camel.CamelPage;
import io.hawt.pageobjects.pages.camel.contexts.specificContext.endpoints.CamelEndpointsPage;

public class CamelNegativeStepDefs {
	private CamelPage camelPage = new CamelPage();
	private CamelEndpoints camelEndpoints = new CamelEndpoints();

	@And("^Unsuccessful message in Camel Endpoints is appeared and closed$")
	public void unsuccessfulMessageInCamelEndpointsIsAppearedAndClosed() {
		camelEndpoints.unsuccessfulMessage(CamelEndpointsPage.class)
				.closeMessage(CamelEndpointsPage.class);
	}

	@Then("^The \"([^\"]*)\" button from drop-down menu is disabled$")
	public void theButtonFromDropDownMenuIsDisabled(String button) {
		camelPage.checkDisabledButtonFromDropDownMenu(button);
	}
}
