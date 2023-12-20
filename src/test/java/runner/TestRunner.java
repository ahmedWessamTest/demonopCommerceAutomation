package runner;

import bases.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/test/resources/features",
        glue = "steps",
        plugin =  { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        tags = "@smoke"
)
public class TestRunner extends TestBase {

}
