import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={
                "pretty",
                "html:target/reports/cuucmbertestreport.html",
                "json:target/reports/cucumber.json"
        },
        features={"src/test/resources/FeatureFile"},
        glue={"stepDefinitions"},
        tags = "",
        dryRun= false, monochrome = true
)
public class testRunner {
}
