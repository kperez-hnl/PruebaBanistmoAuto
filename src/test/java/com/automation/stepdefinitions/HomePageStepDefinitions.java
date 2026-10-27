package com.automation.stepdefinitions;

import com.automation.tasks.OpenBanistmo;
import com.automation.tasks.SeleccionarAcercaDe;
import com.automation.tasks.SeleccionarInformacionCorporativa;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Y;
import io.cucumber.java.es.Entonces;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePageStepDefinitions {
    @Managed(driver = "chrome")
    WebDriver browser;

    private Actor actor;

    @Dado("que el usuario accede al sitio web de Banistmo")
    public void usuarioAccedeAlSitioBanistmo (){
        actor = Actor.named("Visita 1");
        actor.can(BrowseTheWeb.with(browser));
        browser.manage().window().maximize();
        actor.attemptsTo((
                OpenBanistmo.homepage()
                ));
    }

    @Cuando("selecciona la opción {string} del menú")
    public void seleccionaAcercaDe (String opcion){
       actor.attemptsTo(SeleccionarAcercaDe.menu());
    }

    @Y("selecciona la opción {string} del submenú")
            public void seleccionaOpcionDelSubmenu (String opcion) {
        actor.attemptsTo(SeleccionarInformacionCorporativa.boton());
    }

    @Entonces("se muestra la pagina Relación con Inversionistas")
    public void seMuestraPaginaRelacionConInversionistas () {

        String urlEsperada = "https://www.banistmo.com/acerca-de/informacion-corporativa/relacion-con-inversionistas";
        String urlActual = browser.getCurrentUrl();

        Assert.assertEquals("La URL actual no corresponde a Relacion con Inversionistas", urlEsperada, urlActual);
    };


}
