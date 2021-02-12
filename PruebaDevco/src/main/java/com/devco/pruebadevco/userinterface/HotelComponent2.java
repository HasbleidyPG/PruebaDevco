package com.devco.pruebadevco.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HotelComponent2 {

    public static final Target HOTEL_OPTION = Target.the("hotel option").locatedBy("(//span[@class='uitk-button-toggle-content']) [1]");
    public static final Target GOING_TO = Target.the("option going to").locatedBy("//button[@class='uitk-faux-input']");
    public static final Target INPUT_GOING_TO = Target.the("input going to").locatedBy("//input[@class='uitk-field-input uitk-typeahead-input  ']");
    public static final Target MADRID_OPTION = Target.the("select madrid option").locatedBy("(//button[@class='uitk-button uitk-button-small uitk-button-fullWidth uitk-button-typeahead uitk-type-left ']) [1]");
    public static final Target SEARCH = Target.the("button search").locatedBy("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary wizard-submit-btn']");
    public static final Target IMAGE = Target.the("image").locatedBy("//img[@class='uitk-image-media editorialImage']");
}
