package io.hawt.pageobjects.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
	/**
	 * Login to hawtio as given user with given password.
	 *
	 * @return hawtio page
	 */
	public HawtioPage login(String username, String password) {
		$("#username").setValue(username);
		$("#password").setValue(password);
		$("button[type='submit']").click();
		return page(HawtioPage.class);
	}

	public LoginPage loginPageIsOpened() {
		$("div.pf-c-login").shouldBe(visible);
		$("#username").shouldBe(visible);
		$("#password").shouldBe(visible);
		return this;
	}
}
