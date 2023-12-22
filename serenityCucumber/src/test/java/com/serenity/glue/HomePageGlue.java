package com.serenity.glue;

import com.serenity.tasks.OpenPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Properties;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class HomePageGlue {
    private static final String ACTOR_NAME = "User";
    private static final String DATA_NAME = "";
    private static final String PROPERTIES_FILE = "/config/%s.properties";
    private static final Properties PROPERTIES = new Properties();

    @Before
    public void setTheStag(){
        OnStage.setTheStage(new OnlineCast());}

    @Given("^(.*) esta en la pagina Home$")
    public void navigate(String actor){
        theActorCalled(actor).attemptsTo(OpenPage.navigateHomePage());
    }
}
