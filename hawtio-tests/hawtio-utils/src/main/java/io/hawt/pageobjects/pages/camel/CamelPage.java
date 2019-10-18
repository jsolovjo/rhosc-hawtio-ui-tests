package io.hawt.pageobjects.pages.camel;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

import io.hawt.pageobjects.fragments.camel.CamelTree;
import io.hawt.pageobjects.pages.HawtioPage;

public class CamelPage extends HawtioPage {
	private CamelTree tree;

	public CamelPage() {
		tree = new CamelTree();
	}

	public <C> C openTab(String tab, Class<C> c) {
		$(By.xpath("//a[text()='" + tab + "']")).shouldBe(visible).click();
		return page(c);
	}

	public CamelTree tree() {
		return tree;
	}

	/**
	 * Check, that the desired uncommon (li) button from drop-down menu is disabled.
	 *
	 * @param button title of the button
	 * @return camel contexts page
	 */
	public SelenideElement checkDisabledButtonFromDropDownMenu(String button) {
		return $(By.xpath("//a[text()='" + button + "']/ancestor::li[1][contains(@class, 'disabled')]")).should(exist);
	}
}
