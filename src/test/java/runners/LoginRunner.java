package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
		// features= "src\\test\\resources\\features\\CodeFiosLogin.feature" ,
		// features= "src\\test\\resources\\features\\Dashboard.feature" ,
		features = "src\\test\\resources\\features", 
		glue = "steps", // this referring to the package which holds all
																		// the step definitions classes
	//	tags= "@DashboardFeature",
//		tags = "@LoginFeature",
		//		tags = "@LoginScenario2 or @NegativeScenario1",
		//		tags = "@Regression",
		tags = " @CodeFiosAddAccountFeature",		
	//					tags = "@Smoke",
				
				
monochrome = true, 
		dryRun = false, 
		
		plugin = {

				"pretty", 
				"html:target/reports/cucumber.html", 
				"json:target/reports/cucumber.json" }

)
// all this go on top of the class nothing inside
public class LoginRunner {

}
