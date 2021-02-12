package com.devco.pruebadevco.tasks;

import com.devco.pruebadevco.models.Data;
import com.devco.pruebadevco.userinterface.CarsPage2;
import com.devco.pruebadevco.userinterface.HotelComponent2;
import com.devco.pruebadevco.userinterface.MenuComponent1;
import com.devco.pruebadevco.userinterface.MenuComponent2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.Keys;

public class EnterCar implements Task {
    private Data data;

    public EnterCar(Data data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(HotelComponent2.IMAGE.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(MenuComponent2.MORE_TRAVEL),
                        Click.on(MenuComponent2.CARS_OPTION),
                        Click.on(CarsPage2.PICK_UP),
                        Enter.theValue(data.getPickUp()).into(MenuComponent1.INPUT_PICK_UP),
                        Click.on(CarsPage2.MADRID_OPTION),
                        Click.on(CarsPage2.SEARCH)
                ).otherwise(
                        Click.on(MenuComponent1.CARS_OPTION),
                        Click.on(MenuComponent1.PICK_UP),
                        Enter.theValue(data.getPickUp()).into(MenuComponent1.INPUT_PICK_UP).thenHit(Keys.ENTER),
                        Click.on(MenuComponent1.SEARCH)
                ));
    }

    public static EnterCar reservation(Data data){
        return Tasks.instrumented(EnterCar.class, data);
    }
}
