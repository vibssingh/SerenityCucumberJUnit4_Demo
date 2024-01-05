package com.example.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty" }, features = "src/test/resources/features/LoginPage.feature",
        glue="com.example.definitions")

public class SerenityRunnerTests {}
