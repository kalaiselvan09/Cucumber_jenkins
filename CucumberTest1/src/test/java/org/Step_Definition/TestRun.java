package org.Step_Definition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Feature",monochrome=true, dryRun = false, glue = "org.Step_Definition", plugin = {"json:target/report.json","html:target"})
public class TestRun {

}
