package com.maven.stepdefinitions;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features ="src/main/java/com/maven/stepdefinitions/login.feature", 

//format = {"pretty","html:/Users/pnidamanuri/workspace/Xtivia/reports"})
plugin = {
	"pretty", "json:reports/report.json", "junit:reports/report.xml", "html:reports/html" })

public class Runner { 
}

