package Demoqa.DemoqaRegistration;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature", glue="Demoqa.DemoqaRegistration", plugin= {"pretty", "html:C:\\Users\\Elcot\\eclipse-workspace\\DemoqaRegistration\\TestResult\\reports.html"})
public class Runner {

}
