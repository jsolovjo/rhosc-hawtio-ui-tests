package io.hawt.pageobjects.fragments.camel;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

import io.hawt.pageobjects.pages.camel.endpoints.CamelEndpointsPage;

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
	 * Expands folder nested under specified context.
	 *
	 * @param context name of a context to expand
	 * @param folder name of a folder to expand
	 */
	private void expand(String context, String folder) {
		$(By.xpath("//li[contains(@id, '" + context + "')]")).click();
		$(By.xpath("//li[contains(@id, '" + context + "-" + folder + "')]")).click();
	}
}
