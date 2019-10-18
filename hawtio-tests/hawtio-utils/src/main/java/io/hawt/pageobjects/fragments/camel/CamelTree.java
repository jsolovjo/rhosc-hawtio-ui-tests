package io.hawt.pageobjects.fragments.camel;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

import io.hawt.pageobjects.pages.camel.contexts.specificContext.routes.CamelSpecificRouteMainPage;
import io.hawt.pageobjects.pages.camel.contexts.specificContext.endpoints.CamelEndpointsPage;

public class CamelTree {
	/**
	 * Expands and makes targeted endpoints folder under specified context.
	 *
	 * @param context name of a context under which to expand routes folder
	 * @return CamelEndpointsPage class
	 */
	public CamelEndpointsPage openEndpointsFolder(String context) {
		expand(context, "endpoints");
		return page(CamelEndpointsPage.class);
	}

	/**
	 * Expands a path to specified route and makes it targeted.
	 *
	 * @param context name of a context under which route is nested
	 * @param route name of a route to open
	 * @return CamelSpecificRouteMainPage class
	 */
	public CamelSpecificRouteMainPage openRouteInContext(String context, String route) {
		expandContext(context);
		expand(context, "routes");
		$(By.xpath("//li[contains(@id, \"" + route + "\")]")).click();
		return page(CamelSpecificRouteMainPage.class);
	}

	/**
	 * Expands folder nested under specified context.
	 *
	 * @param context name of a context to expand
	 * @param folder name of a folder to expand
	 */
	private void expand(String context, String folder) {
		$(By.xpath("//li[contains(@id, '" + context + "')]")).shouldBe(visible).click();
		$(By.xpath("//li[contains(@id, '" + context + "-" + folder + "')]")).shouldBe(visible).click();
	}

	/**
	 * Expands context with a name specified in a parameter.
	 *
	 * @param context name of a context to expand
	 */
	private void expandContext(String context) {
		$(By.xpath("//li[contains(@id, '\"" + context + "\"')]")).click();
	}
}
