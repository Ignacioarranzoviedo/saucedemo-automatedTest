import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resource/features",
        glue= {"automation.saucedemo.stepDefinitions"}
)
public class FirstFlowRunner {

}