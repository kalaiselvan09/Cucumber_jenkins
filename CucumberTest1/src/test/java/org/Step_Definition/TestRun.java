package org.Step_Definition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Feature", tags= {"@us2"},monochrome=true, dryRun = false, glue = "org.Step_Definition", plugin = "html:target")
public class TestRun {

}
