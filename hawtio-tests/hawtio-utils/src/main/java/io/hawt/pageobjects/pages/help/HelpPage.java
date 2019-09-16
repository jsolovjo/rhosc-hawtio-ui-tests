package io.hawt.pageobjects.pages.help;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import io.hawt.pageobjects.pages.HawtioPage;

public class HelpPage extends HawtioPage {
	private SelenideElement userGuidePanel = $(By.xpath("//ul[contains(@class, 'help-secondary-tabs')]"));

	/**
	 * Switch to another specified tab in Help page.
	 *
	 * @param tabName tab name in Help page
	 * @return help page
	 */
	public HelpPage switchTab(String tabName) {
		userGuidePanel.$(By.linkText(tabName)).shouldBe(Condition.visible).click();
		return this;
	}

	/**
	 * Check header and id of tab are presented.
	 *
	 * @param tabName tab name in Help page
	 * @param tabId id of tab
	 * @return help page
	 */
	public HelpPage checkHeaderAndIdOfTab(String tabName, String tabId) {
		$(By.xpath("//*[@id = '" + tabId + "' and contains(text(), '" + tabName + "')]")).shouldBe(visible);
		return this;
	}

	/**
	 * Check, that right page was opened after clicking on menu link.
	 *
	 * @return help page
	 */
	public HelpPage checkHelpPageOpened() {
		$(By.xpath("//h1[contains(text(), 'Help')]")).shouldBe(visible);
		return page(HelpPage.class);
	}
}
