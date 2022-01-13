package Bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "Bdd/testScenarios",
        tags = "@test",
        snippets = CucumberOptions.SnippetType.UNDERSCORE)
public class RunTest {
    }

