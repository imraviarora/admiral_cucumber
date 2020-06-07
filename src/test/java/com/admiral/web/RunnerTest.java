package com.admiral.web;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
		strict=true,
features="src/test/resources", tags= "@AdmiralWeb", 
plugin={"html:out", "json:target/cucumber.json", "html:target/cucumber"})
//clean verify -Dcucumber.options="--tags @createContactDetail1"

@RunWith(Cucumber.class)
public class RunnerTest extends AbstractTestNGCucumberTests {
	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios() { return super.scenarios();}

}

