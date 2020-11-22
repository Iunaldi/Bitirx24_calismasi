package com.bitrix24.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/bitrix24/stepdefinitions",
        tags = "@test"
)





public class CuksRunner {

}
