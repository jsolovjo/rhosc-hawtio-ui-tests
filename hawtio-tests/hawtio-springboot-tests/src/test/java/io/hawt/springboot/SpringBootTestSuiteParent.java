package io.hawt.springboot;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.hawt.pageobjects.fragments.Panel;
import io.hawt.pageobjects.pages.HawtioPage;
import io.hawt.pageobjects.pages.LoginPage;

public class SpringBootTestSuiteParent {
	private Panel panel = new Panel();

	//server port from application.properties
	private int managementPort = 10001;

	public <P> P open(Class<P> pageObjectClass) {
		return Selenide.open("http://localhost:" + managementPort + System.getProperty("hawtio.url.suffix"), pageObjectClass);
	}

	@Before
	public HawtioPage login() {
		//need to set this system property also here, otherwise it's not set for the tests, even when it's in ApplicationConfig.class
		System.setProperty("hawtio.proxyWhitelist", "localhost, 127.0.0.1");
		WebDriverManager.chromedriver().setup();
		//when browser size is too small, some buttons don't appear and tests are failing
		//Configuration.browserSize = "1440x900";
		return open(LoginPage.class).login("hawtio", "hawtio");
	}

	@After
	public void logout() {
		panel.logout();
	}
}
