package testRunner;
import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
  features=".//Features/login.feature",
  glue="stepDfinitions",
        dryRun=true,
        monochrome=true,
        plugin={"pretty","html:test-output"}


)

public class TestRun {


}
