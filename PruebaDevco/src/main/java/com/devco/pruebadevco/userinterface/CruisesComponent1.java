package com.devco.pruebadevco.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CruisesComponent1 {

    public static final Target GOING_TO= Target.the("going to option").locatedBy("//select[@id='cruise-destination']");
    public static final Target SEARCH= Target.the("search button").locatedBy("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary']");
}
