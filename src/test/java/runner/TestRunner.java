package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
    @CucumberOptions(
            plugin= {"pretty", "html:target/Destination"},
            features = "src/test/resources/feature"
            ,glue={"stepdefinitions"}
    )

    public class TestRunner  extends AbstractTestNGCucumberTests {

    }

