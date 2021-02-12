package com.devco.pruebadevco.questions;

import com.devco.pruebadevco.userinterface.CarsSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class CarsSearch implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(CarsSearchPage.NOTIFICATION).viewedBy(actor).asBoolean();
    }

    public static CarsSearch notification(){
        return new CarsSearch();
    }
}
