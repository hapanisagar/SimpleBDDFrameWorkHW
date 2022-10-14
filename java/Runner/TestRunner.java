package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\SAGAR\\IdeaProjects\\SimpleBDDFrameWorkHW\\src\\test\\resources\\Features\\Register.feature",
                 // feature: Path of the feature file,where feature file is availble
                 // or we can give direct feature package or file name(Register.feature)

        //glue:path of the Step Definations file or folder name
        glue = {"StepDefinations"},
        format = {"pretty","html:htmlReport","json:json/cucumber.json","junit:junit/cucumber.xml"}


)

public class TestRunner {
}
