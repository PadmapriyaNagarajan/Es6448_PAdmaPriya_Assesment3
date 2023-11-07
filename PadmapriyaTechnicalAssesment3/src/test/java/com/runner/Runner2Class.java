package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(tags ="@ValidCredentials or @InvalidCredentials",plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src/test/resources/Feature/Login.feature",glue ="com.demowebapp")
public class Runner2Class extends AbstractTestNGCucumberTests {	
}
