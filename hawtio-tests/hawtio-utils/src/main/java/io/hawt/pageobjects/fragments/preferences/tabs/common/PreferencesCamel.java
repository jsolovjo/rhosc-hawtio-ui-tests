package io.hawt.pageobjects.fragments.preferences.tabs.common;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import io.hawt.pageobjects.pages.HawtioPage;

public class PreferencesCamel extends HawtioPage {
	/**
	 * Set the value to desired setting.
	 *
	 * @param setting the name of setting
	 * @param value the value to be set up
	 * @return preferences page
	 */
	public PreferencesCamel setValueOfSetting(String setting, String value) {
		$(By.xpath("//input[@id='" + setting + "']")).shouldBe(visible).setValue(value);
		return this;
	}

	/**
	 * Check that input field does not have checking value.
	 *
	 * @param setting the name of setting
	 * @param value the value to be checked
	 * @return preferences page
	 */
	public PreferencesCamel settingShouldNotHaveValue(String setting, String value) {
		$(By.xpath("//input[@id='" + setting + "']")).shouldHave(not(value(value)));
		return this;
	}
}
