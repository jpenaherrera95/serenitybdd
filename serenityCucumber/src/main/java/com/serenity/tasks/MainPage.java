package com.serenity.tasks;

import com.serenity.userInterfaces.MainPageInterface;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitOnQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class MainPage {
    enum Pages {

    }
    public static Performable navigatePage(){
        return Task.where("{0} acceder a la pagina OpenCart",
                Open.browserOn().the(OpenCartHomePage.class),
                WaitUntil.the(MainPageInterface.PAGE_TITLE, isVisible()));
    }

    public static Performable addProductsToCart(){
        return Task.where("{0} agregar dos productos al carrito",
                WaitUntil.the(MainPageInterface.ADD_TO_CART_FIRST, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(MainPageInterface.ADD_TO_CART_FIRST),
                WaitUntil.the(MainPageInterface.ADDED_ELEMENT_ALERT, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(MainPageInterface.ADD_TO_CART_SECOND, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(MainPageInterface.ADD_TO_CART_SECOND),
                WaitUntil.the(MainPageInterface.ADDED_ELEMENT_ALERT, isVisible()).forNoMoreThan(5).seconds(),
                //Scroll.to(MainPageInterface.CART_TOTAL),
                WaitUntil.the(MainPageInterface.CART_BUTTON, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(MainPageInterface.CART_BUTTON)
        );
    }

    public static Performable goToViewCartPage(){
        return Task.where("{0} navega a la pagina View Cart",
                WaitUntil.the(MainPageInterface.VIEW_CART_BUTTON, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(MainPageInterface.VIEW_CART_BUTTON));
    }

}
