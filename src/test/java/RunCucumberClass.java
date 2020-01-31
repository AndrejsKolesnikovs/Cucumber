import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;


    @RunWith(Cucumber.class)
    @CucumberOptions(plugin = {"pretty", "src/test/resources/features"})
    class RunCucumberTest {
    }

