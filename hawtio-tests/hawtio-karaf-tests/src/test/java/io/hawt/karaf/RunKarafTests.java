package io.hawt.karaf;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
		features = "src/test/resources/io/hawt/karaf/",
		glue = {"io.hawt.karaf", "io.hawt.stepdefinitions"},
		tags = "@allKarafTests")
public class RunKarafTests {
}
