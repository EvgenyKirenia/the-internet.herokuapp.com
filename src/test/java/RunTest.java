import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "src/main/java",
        tags = "@test",
        snippets = CucumberOptions.SnippetType.UNDERSCORE)
public class RunTest {
    }

