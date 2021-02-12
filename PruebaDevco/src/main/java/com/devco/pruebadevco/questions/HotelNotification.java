package com.devco.pruebadevco.questions;

import com.devco.pruebadevco.userinterface.HotelSearchPage2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class HotelNotification implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(HotelSearchPage2.NOTIFICATION).viewedBy(actor).asBoolean();
    }

    public static HotelNotification isVisible(){
        return new HotelNotification();
    }
}
