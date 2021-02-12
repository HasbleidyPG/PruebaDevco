package com.devco.pruebadevco.questions;

import com.devco.pruebadevco.userinterface.FlightComponent1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class Validate implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(FlightComponent1.ERROR_NOTIFICATION).viewedBy(actor).asBoolean();
    }

    public static Validate error(){
        return new Validate();
    }
}
