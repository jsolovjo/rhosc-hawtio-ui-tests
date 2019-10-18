package io.hawt.stepdefinitions.camel;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.hawt.pageobjects.fragments.camel.tabs.common.CamelOperations;

public class GeneralCamelStepDefs {
	private CamelOperations camelOperations = new CamelOperations();

	@When("^User executes operation with name \"([^\"]*)\" and parameter \"([^\"]*)\"$")
	public void userExecutesOperationWithNameAndParameter(String method, String parameter) {
		camelOperations.executeMethodWithParameter(method, parameter);
	}

	@Then("^Result of executed operation is \"([^\"]*)\"$")
	public void resultOfExecutedOperationIs(String result) {
		camelOperations.checkResultOfCamelIdMethod(result);
	}
}
