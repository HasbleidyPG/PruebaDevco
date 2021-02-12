package com.devco.pruebadevco.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HotelComponent1 {

    public static final Target HOTEL= Target.the("button hotel").locatedBy("//li//a[@class='uitk-tab-anchor']");
    public static final Target GOING_TO= Target.the("option going to").locatedBy("//div//button[@class='uitk-faux-input']");
    public static final Target INPUT_GOING_TO= Target.the("input going to").locatedBy("//input[@id='location-field-destination']");
    public static final Target SEARCH= Target.the("button search").locatedBy("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary']");
}
