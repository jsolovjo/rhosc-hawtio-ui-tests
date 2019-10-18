package io.hawt.pageobjects.pages.camel.contexts.specificContext.routes;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

import io.hawt.pageobjects.fragments.camel.tabs.common.CamelOperations;
import io.hawt.pageobjects.pages.camel.CamelPage;

public class CamelSpecificRouteMainPage extends CamelPage {

	public CamelOperations operations() {
		return openTab("Operations", CamelOperations.class);
	}

	/**
	 * Set Start in dropdown menu in upper right corner of route page.
	 *
	 * @return CamelSpecificRouteMainPage page.
	 */
	public CamelSpecificRouteMainPage setStart() {
		getCamelActionsDropdown().shouldBe(enabled).click();
		$(By.linkText("Start")).shouldBe(visible).click();
		return this;
	}

	/**
	 * Set Stop in dropdown menu in upper right corner of route page.
	 *
	 * @return CamelSpecificRouteMainPage page.
	 */
	public CamelSpecificRouteMainPage setStop() {
		getCamelActionsDropdown().shouldBe(enabled).click();
		$(By.linkText("Stop")).shouldBe(visible).click();
		return this;
	}

	/**
	 * Check, that state of the route contains correct text.
	 *
	 * @param state state in which should be route
	 * @return CamelSpecificRouteMainPage
	 */
	public CamelSpecificRouteMainPage checkState(String state) {
		getCamelActionsDropdown().shouldHave(text(state));
		return this;
	}

	private SelenideElement getCamelActionsDropdown() {
		return $(By.xpath("//div[@class = 'dropdown camel-main-actions']")).shouldBe(enabled);
	}
}
