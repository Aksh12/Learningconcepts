package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/Features/Message+", glue= {"stepDefination_MessagePlus"},
monochrome= true, plugin= {"pretty", "html:target/HtmlReports", "junit:junit_xml/cucumber.xml"})
public class TestRunner {

}
