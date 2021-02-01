package Cucumber.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Dell\\Documents\\java folder\\Automation_Java\\src\\test\\java\\Cucumber\\ Feature", //the path of the feature files
        glue={"classpath:Cucumber.StepsDef"} //the path of the step definition files
//        format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
)

public class Runner {
}
