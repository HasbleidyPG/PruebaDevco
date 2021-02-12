package com.devco.pruebadevco.tasks;

import com.devco.pruebadevco.models.HotelReservationInfo;
import com.devco.pruebadevco.userinterface.HotelComponent1;
import com.devco.pruebadevco.userinterface.HotelComponent2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


public class Search implements Task {
    private HotelReservationInfo hotelReservationInfo;

    public Search(HotelReservationInfo hotelReservationInfo) {
        this.hotelReservationInfo = hotelReservationInfo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(HotelComponent2.IMAGE.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(HotelComponent2.HOTEL_OPTION),
                        Click.on(HotelComponent2.GOING_TO),
                        Enter.theValue(hotelReservationInfo.getGoingTo()).into(HotelComponent2.INPUT_GOING_TO),
                        Click.on(HotelComponent2.MADRID_OPTION),
                         Click.on(HotelComponent2.SEARCH)
                ).otherwise(
                        Click.on(HotelComponent1.HOTEL),
                        Click.on(HotelComponent1.GOING_TO),
                        Enter.theValue(hotelReservationInfo.getGoingTo()).into(HotelComponent1.INPUT_GOING_TO).thenHit(Keys.ENTER),
                        Click.on(HotelComponent1.SEARCH)
                ));
    }

    public static Search hotelReservation(HotelReservationInfo hotelReservationInfo){
        return Tasks.instrumented(Search.class, hotelReservationInfo);
    }
}
