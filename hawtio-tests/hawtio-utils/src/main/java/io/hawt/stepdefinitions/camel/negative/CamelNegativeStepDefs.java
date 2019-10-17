package io.hawt.stepdefinitions.camel.negative;

import cucumber.api.java.en.And;
import io.hawt.pageobjects.fragments.camel.tabs.endpoints.CamelEndpoints;
import io.hawt.pageobjects.pages.camel.endpoints.CamelEndpointsPage;

public class CamelNegativeStepDefs {
	private CamelEndpoints camelEndpoints = new CamelEndpoints();

	@And("^Unsuccessful message in Camel Endpoints is appeared and closed$")
	public void unsuccessfulMessageInCamelEndpointsIsAppearedAndClosed() {
		camelEndpoints.unsuccessfulMessage(CamelEndpointsPage.class)
				.closeMessage(CamelEndpointsPage.class);
	}
}
