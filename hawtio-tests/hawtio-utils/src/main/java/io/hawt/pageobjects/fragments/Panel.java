package io.hawt.pageobjects.fragments;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

import io.hawt.pageobjects.pages.LoginPage;
import io.hawt.pageobjects.pages.help.HelpPage;
import io.hawt.pageobjects.pages.preferences.PreferencesPage;

public class Panel {
	/**
	 * Open help page.
	 *
	 * @return Help page
	 */
	public HelpPage help() {
		this.openDropDownMenu("helpDropdownMenu");
		$(By.linkText("Help")).shouldBe(visible).click();
		return page(HelpPage.class);
	}

	/**
	 * Open preferences page.
	 *
	 * @return Preferences page
	 */
	public PreferencesPage preferences() {
		this.openDropDownMenu("userDropdownMenu");
		$(By.linkText("Preferences")).shouldBe(visible).click();
		return page(PreferencesPage.class);
	}

	/**
	 * Logout from hawtio.
	 *
	 * @return Login page
	 */
	public LoginPage logout() {
		this.openDropDownMenu("userDropdownMenu");
		$(By.xpath("//a[contains(text(), 'Logout')]")).shouldBe(visible).click();
		return page(LoginPage.class);
	}

	/**
	 * Open About dialog.
	 *
	 * @return About dialog
	 */
	public Dialog about() {
		this.openDropDownMenu("helpDropdownMenu");
		$(By.linkText("About")).shouldBe(visible).click();
		return page(Dialog.class);
	}

	/**
	 * Open drop-down menu by id.
	 */
	private void openDropDownMenu(String id) {
		$(By.id(id)).shouldBe(visible).click();
	}
}
