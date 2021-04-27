package br.ce.wcaquino.runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		glue = {"br.ce.wcaquino.steps", "br.ce.wcaquino.config"},
		tags = {"@unitários", "not @ignore"},
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		monochrome = false,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)
public class RunnerTest {
}
