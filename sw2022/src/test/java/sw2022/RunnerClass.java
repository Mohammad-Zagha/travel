package sw2022;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(  // features = "use_case/addAPI.feature",glue= {"winter2020"})
		features = "use_case",
		plugin = {"pretty",
				"json:target/MyReports/report.html",
				"junit:target/MyReports/report.xml" },
		monochrome = false, 
		glue = {"sw2022" },
		dryRun=false)
public class RunnerClass {

}
 