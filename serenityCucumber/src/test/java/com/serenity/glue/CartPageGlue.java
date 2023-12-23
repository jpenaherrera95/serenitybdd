package com.serenity.glue;

import com.serenity.questions.CartPageQuestions;
import com.serenity.tasks.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CartPageGlue {
    @Then("reviso los valores (.*) (.*) (.*) (.*)$")
    public void reviso_los_valores_esperados(String precio_total, String sub_total, String eco_tax, String vat){
        theActorInTheSpotlight().should(
                seeThat("El valor total del carrito", CartPageQuestions.totalCartValue(),equalTo(precio_total)),
                seeThat("El valor sub total del carrito", CartPageQuestions.subTotalCartValue(),equalTo(sub_total)),
                seeThat("El valor Eco tax del carrito",CartPageQuestions.ecoTaxCartValue(),equalTo(eco_tax)),
                seeThat("El valor vat del carrito",CartPageQuestions.vatCartValue(),equalTo(vat))
        );
    }

    @And("navego a la pagina del checkoout")
    public void navego_pagina_checkout(){
        when(OnStage.theActorInTheSpotlight()).attemptsTo(
                CartPage.goToCheckoutPage()
        );
    }
}
