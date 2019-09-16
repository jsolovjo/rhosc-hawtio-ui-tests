package io.hawt.pageobjects.fragments.menu;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

import io.hawt.pageobjects.pages.springboot.SpringBootPage;

public class SpringBootMenu extends Menu {
	/**
	 * Click on Spring Boot option in the menu.
	 *
	 * @return SpringBoot page
	 */
	public SpringBootPage springBoot() {
		$(By.linkText("Spring Boot")).shouldBe(visible).click();
		return page(SpringBootPage.class);
	}
}
