package com.devco.pruebadevco.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com.devco.pruebadevco.features/reservations.feature", snippets = SnippetType.CAMELCASE,
        glue = "com.devco.pruebadevco.stepdefinitions")
public class Reservations {
}
