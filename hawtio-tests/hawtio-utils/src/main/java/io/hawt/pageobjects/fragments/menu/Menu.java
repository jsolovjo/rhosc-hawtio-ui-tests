package io.hawt.pageobjects.fragments.menu;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

import io.hawt.pageobjects.pages.camel.CamelPage;
import io.hawt.pageobjects.pages.connect.ConnectPage;
import io.hawt.pageobjects.pages.jmx.JmxPage;
import io.hawt.pageobjects.pages.runtime.RuntimePage;

/**
 * Represents main menu fragment on the left side of hawtio.
 */
public class Menu {
	/**
	 * Click on JMX option in the menu.
	 *
	 * @return Jmx page
	 */
	public JmxPage jmx() {
		$(By.linkText("JMX")).shouldBe(visible).click();
		return page(JmxPage.class);
	}

	/**
	 * Click on Connect option in the menu.
	 *
	 * @return Connect page
	 */
	public ConnectPage connect() {
		$(By.linkText("Connect")).shouldBe(visible).click();
		return page(ConnectPage.class);
	}

	/**
	 * Click on Camel option in the menu.
	 *
	 * @return Camel page
	 */
	public CamelPage camel() {
		$(By.linkText("Camel")).shouldBe(visible).click();
		return page(CamelPage.class);
	}

	/**
	 * Click on Runtime option in the menu.
	 *
	 * @return Runtime page
	 */
	public RuntimePage runtime() {
		$(By.linkText("Runtime")).shouldBe(visible).click();
		return page(RuntimePage.class);
	}
}
