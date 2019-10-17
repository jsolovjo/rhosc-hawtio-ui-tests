package io.hawt.stepdefinitions.camel.endpoints;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.hawt.pageobjects.fragments.camel.tabs.endpoints.CamelEndpoints;
import io.hawt.pageobjects.pages.camel.CamelPage;
import io.hawt.pageobjects.pages.camel.endpoints.CamelEndpointsPage;

public class CamelEndpointsStepDefs {
	private CamelPage camelPage = new CamelPage();
	private CamelEndpointsPage camelEndpointsPage;
	private CamelEndpoints camelEndpoints;

	@And("^User is on Camel Endpoints page of \"([^\"]*)\" context$")
	public void userIsOnCamelEndpointsPageOfSpecificContext(String context) {
		camelEndpointsPage = camelPage.tree().openEndpointsFolder(context);
	}

	@When("^User clicks on Endpoints tab of Camel Endpoints page$")
	public void userClicksOnEndpointsTabOfCamelEndpointsPage() {
		camelEndpoints = camelEndpointsPage.endpoints();
	}

	@When("^User adds Endpoint \"([^\"]*)\" from URI$")
	public void userAddsEndpointFromUri(String endpointUri) {
		camelEndpoints.add()
				.fromUri(endpointUri);
	}
}
