package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Feature\\LogScenario.feature",
glue= "steps")

 

 

public class TestRunner {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub

 

    }

 

}

