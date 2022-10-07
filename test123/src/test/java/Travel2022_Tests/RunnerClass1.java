package Travel2022_Tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
 @CucumberOptions (features = "test_cases",
 // plugin = {summary""html:target/cucumber/wikipedia.html"},
monochrome=true,
snippets=SnippetType.CAMELCASE,
glue = { "Travel2022_Tests"})
public class RunnerClass1 {

}
