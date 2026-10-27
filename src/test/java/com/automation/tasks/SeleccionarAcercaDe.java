package com.automation.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarAcercaDe {
        private static final Target OPCION_ACERCA_DE = Target.the("Opcion Acerca de")
                .locatedBy("data-testid=\"at-link\"");

        public static Task menu(){
            return Task.where("{0} selecciona Acerca de",
                    Click.on(OPCION_ACERCA_DE)
            );
    }
}
