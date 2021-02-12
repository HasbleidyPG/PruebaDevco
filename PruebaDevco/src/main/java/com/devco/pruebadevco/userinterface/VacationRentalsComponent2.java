package com.devco.pruebadevco.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class VacationRentalsComponent2 {

    public static final Target VACATION_OPTION = Target.the("vacation option").locatedBy("(//span[@class='uitk-button-toggle-content']) [4]");
    public static final Target GOING_TO = Target.the("going to option").locatedBy("//button[@class='uitk-faux-input']");
    public static final Target INPUT_GOING_TO = Target.the("input going to").locatedBy("//input[@class='uitk-field-input uitk-typeahead-input  ']");
    public static final Target MADRID_OPTION = Target.the("select madrid option").locatedBy("(//button[@class='uitk-button uitk-button-small uitk-button-fullWidth uitk-button-typeahead uitk-type-left ']) [1]");
    public static final Target SEARCH = Target.the("button search").locatedBy("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary wizard-submit-btn']");
    public static final Target VALIDATE_BUTTON = Target.the("validate button").locatedBy("//button[@class='uitk-link uitk-flex-item all-t-padding-two all-r-padding-six uitk-link-layout-inline uitk-type-300']");
}
