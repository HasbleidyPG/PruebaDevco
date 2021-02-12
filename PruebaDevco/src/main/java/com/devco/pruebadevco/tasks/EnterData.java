package com.devco.pruebadevco.tasks;

import com.devco.pruebadevco.models.FlightData;
import com.devco.pruebadevco.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.Keys;

public class EnterData implements Task {
    private FlightData flightData;

    public EnterData(FlightData flightData) {
        this.flightData = flightData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(HotelComponent2.IMAGE.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(MenuComponent2.MORE_TRAVEL),
                        Click.on(MenuComponent2.FLIGHT_OPTION),
                        Click.on(FlightPage2.LEAVING_FROM),
                        Enter.theValue(flightData.getLeavingFrom()).into(FlightPage2.INPUT_LEAVING_FROM),
                        Click.on(FlightPage2.MEDELLIN_OPTION),
                        Click.on(FlightPage2.SEARCH)
                ).otherwise(
                        Click.on(MenuComponent1.FLIGHT_OPTION),
                        Click.on(FlightComponent1.LEAVING_FROM),
                        Enter.theValue(flightData.getLeavingFrom()).into(FlightComponent1.INPUT_LEAVING_FROM).thenHit(Keys.ENTER),
                        Click.on(FlightComponent1.SEARCH)
                )
        );
    }

    public static final EnterData flights(FlightData flightData){
        return Tasks.instrumented(EnterData.class, flightData);
    }
}
