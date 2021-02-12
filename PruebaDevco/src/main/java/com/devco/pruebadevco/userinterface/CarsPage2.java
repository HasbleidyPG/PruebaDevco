package com.devco.pruebadevco.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CarsPage2 {
    public static final Target PICK_UP = Target.the("pick up option").locatedBy("(//button[@class='uitk-faux-input']) [1]");
    public static final Target MADRID_OPTION = Target.the("madrid option").locatedBy("(//button[@class='uitk-button uitk-button-small uitk-button-fullWidth uitk-button-typeahead uitk-type-left has-subtext']) [1]");
    public static final Target SEARCH = Target.the("search button").locatedBy("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary']");
}
