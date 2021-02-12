package com.devco.pruebadevco.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class FlightPage2 {
    public static final Target LEAVING_FROM = Target.the("leaving from option").locatedBy("(//button[@class='uitk-faux-input']) [1]");
    public static final Target INPUT_LEAVING_FROM = Target.the(" input leaving from option").locatedBy("//input[@id='location-field-leg1-origin']");
    public static final Target MEDELLIN_OPTION = Target.the(" medellin option").locatedBy("(//button[@class='uitk-button uitk-button-small uitk-button-fullWidth uitk-button-typeahead uitk-type-left has-subtext']) [1]");
    public static final Target SEARCH = Target.the(" search button").locatedBy("(//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary']) [1]");

}
