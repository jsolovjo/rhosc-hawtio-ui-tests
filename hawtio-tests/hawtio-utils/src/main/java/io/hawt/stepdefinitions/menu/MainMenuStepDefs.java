package io.hawt.stepdefinitions.menu;

import cucumber.api.java.en.Given;
import io.hawt.pageobjects.pages.HawtioPage;
import io.hawt.pageobjects.pages.camel.CamelPage;
import io.hawt.pageobjects.pages.connect.ConnectPage;
import io.hawt.pageobjects.pages.jmx.JmxPage;
import io.hawt.pageobjects.pages.runtime.RuntimePage;
import io.hawt.pageobjects.pages.springboot.SpringBootPage;

public class MainMenuStepDefs {
	private CamelPage camelPage;
	private HawtioPage hawtioPage = new HawtioPage();
	private ConnectPage connectPage;
	private JmxPage jmxPage;
	private RuntimePage runtimePage;
	private SpringBootPage springBootPage;

	@Given("^User is on Hawtio main page$")
	public void userIsOnHawtioMainPage() {
		hawtioPage = new HawtioPage();
	}
}
