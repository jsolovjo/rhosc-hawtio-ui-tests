package io.hawt.pageobjects.fragments.preferences.tabs.common;

import com.codeborne.selenide.Condition;
import io.hawt.pageobjects.pages.HawtioPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PreferencesJolokia extends HawtioPage {
    public PreferencesJolokia setValueOfSetting(String setting, String value) {
        $(By.xpath("//input[@id='" + setting + "']")).shouldBe(Condition.visible).setValue(value);
        return this;
    }
    public void inputFieldSettingNotValue(String setting, String value) {
        $(By.xpath("//input[@id='" + setting +"']")).shouldNotHave(Condition.value("10000"));
    }
}
