package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/resources/features",
        tags = "@NegTest1",
        glue = "steps",
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty",
                "html: target/reports/cucumber.html",
                "json: target/reports/cucumber.json"
        }


)
public class Runner {
}
