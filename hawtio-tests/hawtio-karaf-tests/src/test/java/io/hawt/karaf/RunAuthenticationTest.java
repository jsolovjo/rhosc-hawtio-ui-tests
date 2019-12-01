package io.hawt.karaf;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/io/hawt/karaf/",
        glue = {"io.hawt.karaf", "io.hawt.stepdefinitions"},
        tags = "@authenticationTests")
public class RunAuthenticationTest {
}
