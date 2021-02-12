package com.devco.pruebadevco.tasks;

import com.devco.pruebadevco.models.VacationRentalsInfo;
import com.devco.pruebadevco.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class SearchVacation implements Task {

    private VacationRentalsInfo vacationRentalsInfo;

    public SearchVacation(VacationRentalsInfo vacationRentalsInfo) {
        this.vacationRentalsInfo = vacationRentalsInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(HotelComponent2.IMAGE.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(VacationRentalsComponent2.VACATION_OPTION),
                        Click.on(VacationRentalsComponent2.GOING_TO),
                        Enter.theValue(vacationRentalsInfo.getGoingTo()).into(VacationRentalsComponent2.INPUT_GOING_TO),
                        Click.on(VacationRentalsComponent2.MADRID_OPTION),
                        Click.on(VacationRentalsComponent2.SEARCH)
                ).otherwise(
                        Click.on(VacationRentalsComponent1.THINGS),
                        Click.on(VacationRentalsComponent1.THINGS_TO_DO),
                        Enter.theValue(vacationRentalsInfo.getGoingTo()).into(VacationRentalsComponent1.THINGS_INPUT).thenHit(Keys.ENTER),
                        Click.on(HotelComponent1.SEARCH)
                ));

    }

    public static SearchVacation option(VacationRentalsInfo vacationRentalsInfo){
        return Tasks.instrumented(SearchVacation.class, vacationRentalsInfo);
    }
}
