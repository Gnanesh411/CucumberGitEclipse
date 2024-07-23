package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"stepDefinitions","hooks"},
		tags = "@all",
		plugin = {"pretty",
				"html:target/CucumberReports/CucumberReport.html",
				"json:target/CucumberReports/CucumberReport.json",
				"junit:target/CucumberReports/CucumberReport.xml"
				}
		) // to generate the HTML report
public class Testrunner extends AbstractTestNGCucumberTests{

		
}