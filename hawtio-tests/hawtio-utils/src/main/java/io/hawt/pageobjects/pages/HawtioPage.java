package io.hawt.pageobjects.pages;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

import com.codeborne.selenide.Selenide;

import io.hawt.pageobjects.fragments.Panel;
import io.hawt.pageobjects.fragments.menu.SpringBootMenu;

public class HawtioPage {
	private SpringBootMenu springBootMenu;
	private Panel panel;

	public HawtioPage() {
		springBootMenu = new SpringBootMenu();
		panel = new Panel();
	}

	public SpringBootMenu springBootMenu() {
		return springBootMenu;
	}

	public Panel panel() {
		return panel;
	}

	/**
	 * Click on button with given name.
	 *
	 * @param name of button
	 */
	public void clickButton(String name) {
		$(By.xpath("//button[contains(text(),'" + name + "')]")).shouldBe(enabled).click();
	}

	/**
	 * Refresh page.
	 *
	 * @return hawtio page
	 */
	public <P> P refresh(Class<P> pageObjectClass) {
		Selenide.refresh();
		return page(pageObjectClass);
	}

	public <P> P unsuccessfulMessage(Class<P> pageObjectClass) {
		$(By.xpath("//div[@class='toast-pf alert alert-danger alert-dismissable']")).shouldBe(visible);
		return page(pageObjectClass);
	}

	public <P> P successfulMessage(Class<P> pageObjectClass) {
		$(By.xpath("//div[@class='toast-pf alert alert-success alert-dismissable']")).shouldBe(visible);
		return page(pageObjectClass);
	}

	public <P> P closeMessage(Class<P> pageObjectClass) {
		$("button[class='close']").shouldBe(visible).click();
		return page(pageObjectClass);
	}

	public <P> P openUrl(String url, Class<P> pageObjectClass) {
		return Selenide.open(url, pageObjectClass);
	}
}
