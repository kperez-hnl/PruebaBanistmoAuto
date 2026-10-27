package com.automation.tasks;

import com.automation.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBanistmo {

    public static Task homepage(){
        return  Task.where(
                "{0} abre la pagina de Banistmo",
                Open.browserOn().the(HomePage.class)
        );
    }
}
