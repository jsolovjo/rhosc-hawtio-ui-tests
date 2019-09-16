package io.hawt.pageobjects.pages.preferences;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

import io.hawt.pageobjects.fragments.preferences.tabs.common.PreferencesCamel;
import io.hawt.pageobjects.fragments.preferences.tabs.common.PreferencesConnect;
import io.hawt.pageobjects.fragments.preferences.tabs.common.PreferencesConsoleLogs;
import io.hawt.pageobjects.fragments.preferences.tabs.common.PreferencesJolokia;
import io.hawt.pageobjects.fragments.preferences.tabs.common.PreferencesReset;
import io.hawt.pageobjects.pages.HawtioPage;

public class PreferencesPage extends HawtioPage {
	public <C> C openTab(String tab, Class<C> c) {
		$(By.xpath("//a[text()='" + tab + "']")).shouldBe(visible).click();
		return page(c);
	}

	/**
	 * Check, that right page was opened after clicking on menu link.
	 *
	 * @return preferences page
	 */
	public PreferencesPage checkPreferencesPageOpened() {
		$(By.xpath("//h1[contains(text(), 'Preferences')]")).shouldBe(visible);
		return page(PreferencesPage.class);
	}

	public PreferencesCamel camel() {
		return openTab("Camel", PreferencesCamel.class);
	}

	public PreferencesConnect connect() {
		return openTab("Connect", PreferencesConnect.class);
	}

	public PreferencesConsoleLogs consoleLogs() {
		return openTab("Console Logs", PreferencesConsoleLogs.class);
	}

	public PreferencesJolokia jolokia() {
		return openTab("Jolokia", PreferencesJolokia.class);
	}

	public PreferencesReset reset() {
		return openTab("Reset", PreferencesReset.class);
	}
}
