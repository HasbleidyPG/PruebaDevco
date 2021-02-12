package com.devco.pruebadevco.questions;

import com.devco.pruebadevco.userinterface.CruisePage2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class CruiseSearch implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(CruisePage2.NOTIFICATION).viewedBy(actor).asBoolean();
    }

    public static CruiseSearch option(){
        return new CruiseSearch();
    }
}
