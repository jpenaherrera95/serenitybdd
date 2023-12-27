package com.serenity.tasks;

import com.serenity.userInterfaces.CartPageInterface;
import com.serenity.userInterfaces.CheckoutPageInterface;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CartPage {
    public static Performable confirmCartPage(){
        return Task.where("{0} valida los elementos de la pagina Cart",
                WaitUntil.the(CartPageInterface.GIFT_CERTIFICATE_TITLE, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(CartPageInterface.CART_DETAILS_TABLE, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(CartPageInterface.WHAT_WOULD_YOU_DO_NEXT_TITLE, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(CartPageInterface.USE_COUPON_CODE_PANEL, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(CartPageInterface.ESTIMATE_SHIPPING_AND_TAXES_PANEL, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(CartPageInterface.USE_GIFT_CERTIFICATE_PANEL, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(CartPageInterface.CHECKOUT_BUTTON, isVisible()).forNoMoreThan(5).seconds()
        );
    }

    public static Performable goToCheckoutPage(){
        return Task.where("{0} valida los elementos de la pagina Cart",
                WaitUntil.the(CartPageInterface.CHECKOUT_BUTTON, isVisible()).forNoMoreThan(5).seconds(),
                Scroll.to(CartPageInterface.CHECKOUT_BUTTON),
                WaitUntil.the(CartPageInterface.CHECKOUT_BUTTON, isClickable()).forNoMoreThan(5).seconds(),
                Click.on(CartPageInterface.CHECKOUT_BUTTON),
                WaitUntil.the(CheckoutPageInterface.CHECKOUT_PAGE_TITLE, isVisible()).forNoMoreThan(5).seconds()
        );
    }
}
