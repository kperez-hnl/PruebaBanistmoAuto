package com.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.WebDriverQuestion;

public class HomePageTitle implements Question <String> {

    @Override
    public String answeredBy (Actor actor){
        return actor.asksFor (
                net.serenitybdd.screenplay.questions.Text.of(
                        net.serenitybdd.screenplay.targets.Target
                                .the("titulo de la pagina")
                                .locatedBy("body")
                )
        );

    }
}
