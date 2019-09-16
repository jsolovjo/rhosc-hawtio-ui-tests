package io.hawt.pageobjects.fragments;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

public class Dialog {
	private SelenideElement dialogWindow = $(".pf-c-about-modal-box");

	/**
	 * Click on Close button.
	 *
	 * @return the previously opened page
	 */
	public <P> P close(Class<P> pageObjectClass) {
		dialogWindow.$(By.xpath(".//button[contains(@aria-label, 'Close Dialog')]")).shouldBe(visible).click();
		return page(pageObjectClass);
	}

	public Dialog dialogWindowOpened() {
		dialogWindow.shouldBe(visible);
		return this;
	}
}
