package io.hawt.stepdefinitions.camel.routes;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.hawt.pageobjects.fragments.camel.tabs.common.CamelOperations;
import io.hawt.pageobjects.pages.camel.CamelPage;
import io.hawt.pageobjects.pages.camel.contexts.specificContext.routes.CamelSpecificRouteMainPage;

public class CamelSpecificRouteStepDefs {
	private CamelPage camelPage = new CamelPage();
	private CamelSpecificRouteMainPage camelSpecificRouteMainPage = new CamelSpecificRouteMainPage();
	private CamelOperations camelOperations;

	@When("^User sets start in the dropdown menu of Camel Specific Route$")
	public void userSetsStartInTheDropDownMenuOfCamelSpecificRoute() {
		camelSpecificRouteMainPage.setStart()
				.successfulMessage(CamelSpecificRouteMainPage.class)
				.closeMessage(CamelSpecificRouteMainPage.class);
	}

	@When("^User sets stop in the dropdown menu of Camel Specific Route$")
	public void userSetsStopInTheDropDownMenuOfCamelSpecificRoute() {
		camelSpecificRouteMainPage.setStop()
				.successfulMessage(CamelSpecificRouteMainPage.class)
				.closeMessage(CamelSpecificRouteMainPage.class);
	}

	@When("^User clicks on Operations tab of Camel Specific Route page$")
	public void userClicksOnOperationsTabOfCamelSpecificRoutePage() {
		camelOperations = camelSpecificRouteMainPage.operations();
	}

	@Then("^State of Camel Specific Route is \"([^\"]*)\"$")
	public void stateOfCamelSpecificRouteIs(String state) {
		camelSpecificRouteMainPage.checkState(state);
	}

	@And("^User is on Camel \"([^\"]*)\" Route page of \"([^\"]*)\" context$")
	public void userIsOnCamelSpecificRoutePageOfSpecificContext(String route, String context) {
		camelSpecificRouteMainPage = camelPage.tree().openRouteInContext(context, route);
	}
}
