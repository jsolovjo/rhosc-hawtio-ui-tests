package io.hawt.pageobjects.pages.camel.endpoints;

import io.hawt.pageobjects.fragments.camel.tabs.common.CamelAttributes;
import io.hawt.pageobjects.fragments.camel.tabs.common.CamelChartView;
import io.hawt.pageobjects.fragments.camel.tabs.common.CamelOperations;
import io.hawt.pageobjects.fragments.camel.tabs.endpoints.CamelEndpoints;
import io.hawt.pageobjects.pages.camel.CamelPage;

public class CamelEndpointsPage extends CamelPage {
	public CamelAttributes attributes() {
		return openTab("Attributes", CamelAttributes.class);
	}

	public CamelEndpoints endpoints() {
		return openTab("Endpoints", CamelEndpoints.class);
	}

	public CamelOperations operations() {
		return openTab("Operations", CamelOperations.class);
	}

	public CamelChartView chart() {
		return openTab("Chart", CamelChartView.class);
	}
}
