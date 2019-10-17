package io.hawt.pageobjects.fragments.camel.tabs.endpoints;

import static com.codeborne.selenide.Selenide.page;

import io.hawt.pageobjects.pages.HawtioPage;

public class CamelEndpoints extends HawtioPage {
	/**
	 * Click on Add button to add a new endpoint.
	 *
	 * @return camel endpoints add page.
	 */
	public CamelEndpointsAdd add() {
		clickButton("Add");
		return page(CamelEndpointsAdd.class);
	}
}
