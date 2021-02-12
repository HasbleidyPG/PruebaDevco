package com.devco.pruebadevco.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class VacationRentalsComponent1 {
    public static final Target THINGS = Target.the("things option").locatedBy("(//a[@class='uitk-tab-anchor']) [5]");
    public static final Target THINGS_TO_DO = Target.the("things to do").locatedBy("//button[@class='uitk-faux-input']");
    public static final Target THINGS_INPUT = Target.the("things to do input").locatedBy("//input[@id='location-field-location']");
    public static final Target SEARCH = Target.the("button search").locatedBy("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary']");

}

