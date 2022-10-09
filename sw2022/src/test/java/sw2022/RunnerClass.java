package sw2022;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Rosol Tuhul\\git\\travel2\\sw2022\\use_case\\login.feature",
		plugin = {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml" },
		monochrome = false, 
		glue = {"sw2022" },
		dryRun=false)
public class RunnerClass {

}
