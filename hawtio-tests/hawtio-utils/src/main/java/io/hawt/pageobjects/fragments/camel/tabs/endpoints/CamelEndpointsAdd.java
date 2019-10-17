package io.hawt.pageobjects.fragments.camel.tabs.endpoints;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

import io.hawt.pageobjects.pages.HawtioPage;

public class CamelEndpointsAdd extends HawtioPage {
	/**
	 * Add endpoint from URI.
	 *
	 * @param endpointUri URI of endpoint to be added.
	 * @return camel attributes page.
	 */
	public CamelEndpointsAdd fromUri(String endpointUri) {
		addEndpoint("uri");
		$(By.xpath("//input[@ng-model='endpointName']")).shouldBe(visible).sendKeys(endpointUri);
		// Using clickButton() method is not possible because of the same name of buttons in fromUri and fromData methods
		$(By.xpath("//button[@ng-click='createEndpoint(endpointName)']")).shouldBe(enabled).click();
		return page(CamelEndpointsAdd.class);
	}

	/**
	 * Add endpoint from data.
	 *
	 * @param endpointName endpoint name to add.
	 * @param timerName name of timer to add.
	 * @return camel attributes page.
	 */
	public CamelEndpointsAdd fromData(String endpointName, String timerName) {
		addEndpoint("wizard");
		$("#componentName").selectOptionByValue("string:timer");
		$("#endpointPath").shouldBe(visible).sendKeys(endpointName);
		$(By.xpath("//input[@name='timerName']")).shouldBe(visible).sendKeys(timerName);
		// Using clickButton() method is not possible because of the same name of buttons in fromUri and fromData methods
		$(By.xpath("//button[@ng-click='createEndpointFromData()']")).shouldBe(enabled).click();
		return page(CamelEndpointsAdd.class);
	}

	/**
	 * Click on radio button to choose how to add the endpoint - from URI or from Data.
	 *
	 * @param from the way how the endpoint will be added.
	 */
	private void addEndpoint(String from) {
		$(By.xpath("//input[@value='" + from + "']")).shouldBe(visible).click();
	}
}
