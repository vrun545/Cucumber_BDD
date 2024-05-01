package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/features",
    plugin = "html:src/target/cucumber-reports.html" ,
    glue = {"stepdefinitions"},
    monochrome = true,
    tags = "@Feature1 or @Feature2 or @Feature3"
)

public class TestRunner {

}