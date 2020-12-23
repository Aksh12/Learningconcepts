package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.Pickle;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;


@CucumberOptions(features="src/test/java/features",
glue= {"stepDefinations"},
monochrome=true,
plugin= {"pretty","html:target/html-outputs/html-reports", "json:target/json_output/cucumber.json"},
dryRun=false)
public class Runner extends AbstractTestNGCucumberTests{
	
	private TestNGCucumberRunner testNGCucumberRunner;
	 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber scenarios", dataProvider = "scenarios")
    public void runScenario(PickleWrapper pickle, FeatureWrapper feature) {
       testNGCucumberRunner.runScenario(pickle.getPickle());
    }
 
    @DataProvider
    public Object[][] scenarios() {
        return testNGCucumberRunner.provideScenarios();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        testNGCucumberRunner.finish();
    }

}
