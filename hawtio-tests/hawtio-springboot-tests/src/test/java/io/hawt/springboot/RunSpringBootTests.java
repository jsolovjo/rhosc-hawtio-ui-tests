package io.hawt.springboot;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
		features = "src/test/resources/io.hawt.springboot/",
		glue = {"io.hawt.springboot", "io.hawt.stepdefinitions"},
		tags = "@springBootTests")
public class RunSpringBootTests {
}
