package com.devco.pruebadevco.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MenuComponent2 {
    public static final Target MORE_TRAVEL= Target.the("more travel button").locatedBy("//button[@class='uitk-button uitk-button-small uitk-button-has-text uitk-button-tertiary gc-header-custom-menu-trigger']");
    public static final Target CARS_OPTION= Target.the("cars option").locatedBy("(//div//a[@class='uitk-link uitk-list-item uitk-link-layout-default uitk-type-300']) [3]");
    public static final Target FLIGHT_OPTION= Target.the("flight option").locatedBy("(//div//a[@class='uitk-link uitk-list-item uitk-link-layout-default uitk-type-300']) [4]");
    public static final Target CRUISE_OPTION= Target.the("cruise option").locatedBy("(//div//a[@class='uitk-link uitk-list-item uitk-link-layout-default uitk-type-300']) [5]");
}
