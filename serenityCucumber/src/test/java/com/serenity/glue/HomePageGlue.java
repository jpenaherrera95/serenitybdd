package com.serenity.glue;

import com.serenity.questions.MainPageQuestions;
import com.serenity.tasks.CartPage;
import com.serenity.tasks.MainPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Properties;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class HomePageGlue {
    private static final String ACTOR_NAME = "User";
    private static final String DATA_NAME = "";
    private static final String PROPERTIES_FILE = "/config/%s.properties";
    private static final Properties PROPERTIES = new Properties();

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());}

    @Given("^(.*) esta en la pagina Home$")
    public void en_la_pagina_home(String actor){
        theActorCalled(actor).attemptsTo(MainPage.navigatePage());
    }

    @When("agrego los productos al carro de compras")
    public void agrego_los_dos_productos(){
        when(OnStage.theActorInTheSpotlight()).attemptsTo(
                MainPage.addProductsToCart()
        );
    }

    @Then("veo los valores (.*) (.*) (.*) (.*)$")
    public void veo_los_valores_esperados(String precio_total, String sub_total, String eco_tax, String vat){
        theActorInTheSpotlight().should(
                seeThat("El valor total del carrito",MainPageQuestions.totalCartValue(),equalTo(precio_total)),
                seeThat("El valor sub total del carrito", MainPageQuestions.subTotalCartValue(),equalTo(sub_total)),
                seeThat("El valor Eco tax del carrito",MainPageQuestions.ecoTaxCartValue(),equalTo(eco_tax)),
                seeThat("El valor vat del carrito",MainPageQuestions.vatCartValue(),equalTo(vat))
        );
    }

    @And("navego a la pagina del carrito")
    public void navego_pagina_del_carrito(){
        when(OnStage.theActorInTheSpotlight()).attemptsTo(
                MainPage.goToViewCartPage(),
                CartPage.confirmCartPage()
        );
    }

}
