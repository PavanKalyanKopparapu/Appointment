package Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},
        features = {"C:\\Users\\Pavan.Kopparapu\\Downloads\\Appointment (1) (1)\\Appointment"},
        glue = "StepDef")
public class LoginFile {

}
