package com.fd.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",

        },
        features = "src/test/resources/features",
        glue = "com/fd/step_definition",
        dryRun = false,
        tags = "",
        publish = false

)
public class CukesRun {
}
