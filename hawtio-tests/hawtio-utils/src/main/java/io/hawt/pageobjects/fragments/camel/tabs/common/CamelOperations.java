package io.hawt.pageobjects.fragments.camel.tabs.common;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

import io.hawt.pageobjects.pages.HawtioPage;

public class CamelOperations extends HawtioPage {

	/**
	 * Open some method window and execute it.
	 *
	 * @param method method name
	 * @param parameter parameter name
	 * @return camel operations page
	 */
	public CamelOperations executeMethodWithParameter(String method, String parameter) {
		$(withText(method)).click();
		final SelenideElement expandedMethodPanel = $(withText(method)).$(By.xpath("//ancestor::div[@class = 'list-group-item  list-view-pf-expand-active']"));
		expandedMethodPanel.$(By.xpath("//input[@id='p1']")).setValue(parameter);
		expandedMethodPanel.$(By.xpath("//button[@type='submit']")).shouldBe(visible).click();
		return this;
	}

	/**
	 * Get the result of executed method.
	 *
	 * @param method method name
	 * @return result
	 */
	public SelenideElement result(String method) {
		final SelenideElement expandedMethodPanel = $(withText(method)).$(By.xpath("//ancestor::div[@class = 'list-group-item  list-view-pf-expand-active']"));
		//get the result of the executed method. It's located in <pre> tag in expanded method panel.
		return expandedMethodPanel.$(byXpath("//pre[contains(@class, 'ng-binding')]")).shouldBe(visible);
	}

	public CamelOperations checkResultOfCamelIdMethod(String camelId) {
		result("getCamelId()").shouldHave(text(camelId));
		return this;
	}
}
