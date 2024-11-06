package com.e2e.Test.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\spec\\feature"},
		
		plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"},
		tags = ("@addParfumToTheBasket"),
		monochrome = true, 
		snippets = CAMELCASE
		
		)
public class RunWebSuiteTest {

}
