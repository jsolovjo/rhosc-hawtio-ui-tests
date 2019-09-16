package io.hawt.pageobjects.pages.springboot;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

import io.hawt.pageobjects.pages.HawtioPage;

public class SpringBootPage extends HawtioPage {
	/**
	 * Check, that right page was opened after clicking on menu link.
	 *
	 * @return runtime page
	 */
	public SpringBootPage checkSpringBootPageOpened() {
		$(By.xpath("//h1[contains(text(), 'Health')]")).shouldBe(visible);
		return page(SpringBootPage.class);
	}
}
