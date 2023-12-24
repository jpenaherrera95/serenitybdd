package com.serenity.glue;

import com.serenity.questions.SuccessPageQuestions;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SuccessPageGlue {
    public static final String successPageUrl = "https://opencart.abstracta.us/index.php?route=checkout/success";
    @Then("nos redirigimos a la pagina success")
    public void nos_redirigimos_a_la_pagina_success(){
        theActorInTheSpotlight().should(
                seeThat("El titulo es visible", SuccessPageQuestions.orderPlacedTitle()),
                seeThat("El mensaje de orden procesada es visible", SuccessPageQuestions.orderProcessedMessage()),
                seeThat("El mensaje de alguna pregunta es visible", SuccessPageQuestions.anyQuestionLabelMessage()),
                seeThat("El mensaje de agradecimiento es visible", SuccessPageQuestions.thanksMessage()),
                seeThat("El boton de continuar es visible", SuccessPageQuestions.continueButton())
        );
    }
}
