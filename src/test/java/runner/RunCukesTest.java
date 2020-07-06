package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:Features"}, plugin = {"pretty", "html:target/cucumber-html-report",
        "json:target/cucumber-reports/cucumber.json", "junit:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        glue = "stepDefs")

public class RunCukesTest {

}


