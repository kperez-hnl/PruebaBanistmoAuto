package com.automation.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarInformacionCorporativa {
    private static final Target BOTON_INFORMACION_CORPORATIVA = Target.the("Boton Informacion Coporativa")
            .locatedBy("/html/body/div[2]/header/div[2]/nav/ul/li[2]/button");

    public static Task boton(){
        return Task.where("{0} selecciona Informacion Coporativa",
                Click.on(BOTON_INFORMACION_CORPORATIVA)
        );
    }
}

