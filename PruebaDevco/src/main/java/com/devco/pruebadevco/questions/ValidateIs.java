package com.devco.pruebadevco.questions;

import com.devco.pruebadevco.userinterface.VacationRentalsComponent2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidateIs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(VacationRentalsComponent2.VALIDATE_BUTTON).viewedBy(actor).asBoolean();
    }

    public static ValidateIs visible(){
        return new ValidateIs();
    }
}
