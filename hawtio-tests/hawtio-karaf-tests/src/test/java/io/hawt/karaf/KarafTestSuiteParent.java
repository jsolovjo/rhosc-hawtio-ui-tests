package io.hawt.karaf;

import com.codeborne.selenide.Selenide;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.hawt.pageobjects.fragments.Panel;
import io.hawt.pageobjects.pages.HawtioPage;
import io.hawt.pageobjects.pages.LoginPage;

public class KarafTestSuiteParent {
	private Panel panel = new Panel();

	//server port from application.properties
	private int managementPort = 8181;

	public <P> P open(Class<P> pageObjectClass) {
		return Selenide.open("http://localhost:" + managementPort + System.getProperty("hawtio.url.suffix"), pageObjectClass);
	}

	@Before ("not @authenticationTests")
	public HawtioPage login() {
		//need to set this system property also here, otherwise it's not set for the tests, even when it's in ApplicationConfig.class
		System.setProperty("hawtio.proxyWhitelist", "localhost, 127.0.0.1");
		WebDriverManager.chromedriver().setup();
		//when browser size is too small, some buttons don't appear and tests are failing
		//Configuration.browserSize = "1440x900";
		return open(LoginPage.class).login("karaf", "karaf");
	}

	@Before ("@authenticationTests")
	public void openHawtio() {
		//need to set this system property also here, otherwise it's not set for the tests, even when it's in ApplicationConfig.class
		System.setProperty("hawtio.proxyWhitelist", "localhost, 127.0.0.1");
		WebDriverManager.chromedriver().setup();
		open(LoginPage.class);
	}

	@After("not @authenticationTests")
	public void logout() {
		panel.logout();
	}
}
