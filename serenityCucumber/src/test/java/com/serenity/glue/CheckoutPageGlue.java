package com.serenity.glue;

import com.fasterxml.jackson.databind.JsonNode;
import com.serenity.TestUtils;
import com.serenity.questions.CheckoutPageQuestions;
import com.serenity.tasks.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CheckoutPageGlue {
    @When("selecciono la opcion de usuario invitado")
    public void selecciono_la_opcion_usuario_invitado(){
        when(OnStage.theActorInTheSpotlight()).attemptsTo(
                CheckoutPage.selectGuestUser()
        );
    }
    @And("ingreso la informacion como invitado")
    public void ingreso_la_informacion_como_invitado() throws IOException {
        JsonNode data = TestUtils.getTestData("UI.data/guestUserData.json");
        String firstName = data.path("guestUser").path("firstName").textValue();
        String lastName = data.path("guestUser").path("lastName").textValue();
        String email = data.path("guestUser").path("email").textValue();
        String telephone = data.path("guestUser").path("telephone").textValue();
        String company = data.path("guestUser").path("company").textValue();
        String addressLineOne = data.path("guestUser").path("addressLineOne").textValue();
        String addressLineTwo = data.path("guestUser").path("addressLineTwo").textValue();
        String city = data.path("guestUser").path("city").textValue();
        String postalCode = data.path("guestUser").path("postalCode").textValue();
        String country = data.path("guestUser").path("country").textValue();
        String region = data.path("guestUser").path("region").textValue();
        when(OnStage.theActorInTheSpotlight()).attemptsTo(
                CheckoutPage.fulfillGuestUserData(firstName, lastName, email, telephone, company, addressLineOne, addressLineTwo, city, postalCode, country, region)
        );
    }
    @Then("valido los precios antes de comprar (.*) (.*) (.*)$")
    public void reviso_los_precios_antes_de_comprar(String sub_total, String flat, String total_with_flat){
        theActorInTheSpotlight().should(
                seeThat("El valor sub total del carrito", CheckoutPageQuestions.subTotalOrderValue(),equalTo(sub_total)),
                seeThat("El valor flat del carrito", CheckoutPageQuestions.flatOrderValue(),equalTo(flat)),
                seeThat("El valor Total del carrito",CheckoutPageQuestions.totalOrderValue(),equalTo(total_with_flat))
        );
    }

    @And("completo la compra")
    public void completo_la_compra(){
        when(OnStage.theActorInTheSpotlight()).attemptsTo(
                CheckoutPage.placeOrder()
        );
    }
}
