package sw2022;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
 @CucumberOptions (features = "use_case",
 // plugin = {summary""html:target/cucumber/wikipedia.html"},
monochrome=true,
snippets=SnippetType.CAMELCASE,
glue = { "sw2022"})
public class RunnerClass {

}

