package io.hawt.stepdefinitions.menu;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.hawt.pageobjects.fragments.Dialog;
import io.hawt.pageobjects.pages.HawtioPage;
import io.hawt.pageobjects.pages.help.HelpPage;
import io.hawt.pageobjects.pages.preferences.PreferencesPage;

public class DropdownMenuStepDefs {
	private HawtioPage hawtioPage = new HawtioPage();
	private HelpPage helpPage;
	private Dialog aboutDialog;
	private PreferencesPage preferencesPage;

	@When("^User clicks on Help in right dropdown menu with question mark$")
	public void userClicksOnHelp() {
		helpPage = hawtioPage.panel().help();
	}

	@Then("^User is redirected to Help page$")
	public void userIsRedirectedToHelpPage() {
		helpPage.checkHelpPageOpened();
	}

	@When("^User clicks on About in right dropdown menu with question mark$")
	public void userClicksOnAbout() {
		aboutDialog = hawtioPage.panel().about();
	}

	@Then("^About dialog with console info is shown$")
	public void aboutDialogWithInfoIsShown() {
		aboutDialog.dialogWindowOpened();
	}

	@Then("^About dialog is closed$")
	public void aboutDialogIsClosed() {
		aboutDialog.close(Dialog.class);
	}

	@When("^User clicks on Preferences in right dropdown menu with user icon$")
	public void userClicksOnPreferences() {
		preferencesPage = hawtioPage.panel().preferences();
	}

	@Then("^User is redirected to Preferences page$")
	public void userIsRedirectedToPreferencesPage() {
		preferencesPage.checkPreferencesPageOpened();
	}
}
