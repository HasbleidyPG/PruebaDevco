package com.devco.pruebadevco.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MenuComponent1 {
    public static final Target CARS_OPTION= Target.the("cars option").locatedBy("(//li//a[@class='uitk-tab-anchor']) [3]");
    public static final Target FLIGHT_OPTION= Target.the("flight option").locatedBy("(//li//a[@class='uitk-tab-anchor']) [2]");
    public static final Target CRUISES_OPTION= Target.the("cruises option").locatedBy("(//li//a[@class='uitk-tab-anchor']) [6]");
    public static final Target PICK_UP= Target.the("pick up option").locatedBy("(//button[@class='uitk-faux-input']) [1]");
    public static final Target INPUT_PICK_UP= Target.the("pick up input").locatedBy("//input[@id='location-field-locn']");
    public static final Target SEARCH= Target.the("search button").locatedBy("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary']");
}
