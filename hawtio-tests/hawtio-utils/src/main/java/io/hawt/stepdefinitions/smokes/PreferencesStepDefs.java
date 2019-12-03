package io.hawt.stepdefinitions.smokes;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.hawt.pageobjects.fragments.preferences.tabs.common.PreferencesCamel;
import io.hawt.pageobjects.fragments.preferences.tabs.common.PreferencesJolokia;
import io.hawt.pageobjects.pages.HawtioPage;
import io.hawt.pageobjects.pages.preferences.PreferencesPage;

public class PreferencesStepDefs {
    private HawtioPage hawtioPage = new HawtioPage();
    private PreferencesPage preferencesPage;
    private PreferencesJolokia preferencesJolokia;
    private PreferencesCamel preferencesCamel;

    @Given("^User is on Preferences page$")
    public void userIsOnPreferncesPage() {
        preferencesPage = hawtioPage.panel().preferences();
    }

    @And("^User clicks on Jolokia tab of Prefernces page$")
    public void userClicksOnJolokiaTabOfPreferencesPage() {
        preferencesJolokia = preferencesPage.jolokia();
    }

    @When("^User sets value of \"([^\"]*)\" to \"([^\"]*)\" on Jolokia tab of Preferences page$")
    public void userSetsValueToSettingInJolokiaTab(String value, String setting) {
        preferencesJolokia.setValueOfSetting(setting, value);
    }

    @And("^User clicks on Apply button$")
    public void userClicksOnApplyButton() {
        preferencesJolokia.clickButton("Apply");
    }

    @Then("^Input field \"([^\"]*)\" should not contain \"([^\"]*)\"$")
    public void inputFieldSettingShouldNotContainValue(String setting, String value) {
        preferencesJolokia.inputFieldSettingNotValue(setting, value);
    }

//    @And("^User clicks on Camel tab of Prefernces page$")
//    public void userClicsOnCamelTabOfPreferncesPage() {
//        preferencesCamel.userClicksOnCamelPage();
//    }
//
//    @When("^User sets value of \"([^\"]*)\" to \"([^\"]*)\" on Camel tab of Preferences page$")
//    public void userSetsValueAndSettingOnCamelTabOfPreferencesPage(String value, String setting) {
//        preferencesCamel.setValueAndSetting(value, setting);
//    }
//
//    @And("^User reloads page$")
//    public void userReladsPage() {
//        preferencesCamel.refresh(PreferencesCamel.class);
//    }
}
