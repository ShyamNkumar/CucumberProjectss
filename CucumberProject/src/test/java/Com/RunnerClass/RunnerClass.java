package Com.RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features= {"src/test/resources"} ,
                 glue = {"Com.StepDefClass"})


public class RunnerClass {	
	
}

