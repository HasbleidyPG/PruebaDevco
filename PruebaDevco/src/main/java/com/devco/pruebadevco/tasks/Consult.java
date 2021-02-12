package com.devco.pruebadevco.tasks;

import com.devco.pruebadevco.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

public class Consult implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(HotelComponent2.IMAGE.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(MenuComponent2.MORE_TRAVEL),
                        Click.on(MenuComponent2.CRUISE_OPTION),
                        Click.on(CruisePage2.GOING_TO),
                        SelectFromOptions.byVisibleText("Bahamas").from(CruisePage2.GOING_TO),
                        Click.on(CruisePage2.SEARCH)
                ).otherwise(
                        Click.on(MenuComponent1.CRUISES_OPTION),
                        Click.on(CruisesComponent1.GOING_TO),
                        SelectFromOptions.byVisibleText("Bahamas").from(CruisesComponent1.GOING_TO),
                        Click.on(CruisesComponent1.SEARCH)
                )
        );
    }

    public static Consult cruise(){
        return Tasks.instrumented(Consult.class);
    }
}
