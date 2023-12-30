package com.serenity.tasks;

import com.serenity.userInterfaces.CheckoutPageInterface;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class CheckoutPage {
    public static Performable selectGuestUser(){
        return Task.where("{0} selecciona el usuario Invitado",
                WaitUntil.the(CheckoutPageInterface.STEP_ONE_PANEL, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(CheckoutPageInterface.GUEST_CHECKOUT_RADIO, isClickable()).forNoMoreThan(5).seconds(),
                Click.on(CheckoutPageInterface.GUEST_CHECKOUT_RADIO),
                WaitUntil.the(CheckoutPageInterface.GUEST_CHECKOUT_RADIO, isSelected()).forNoMoreThan(5).seconds(),
                WaitUntil.the(CheckoutPageInterface.CHECKOUT_OPTION_CONTINUE_BUTTON, isClickable()).forNoMoreThan(5).seconds(),
                Click.on(CheckoutPageInterface.CHECKOUT_OPTION_CONTINUE_BUTTON),
                WaitUntil.the(CheckoutPageInterface.STEP_ONE_PANEL, isVisible()).forNoMoreThan(5).seconds()
        );
    }

    public static Performable fulfillGuestUserData(String firstName, String lastName, String email, String telephone, String company, String addressLineOne, String addressLineTwo, String city, String postalCode, String country, String region){
        return Task.where("{0} ingresa la informacion del usuario invitado",
                WaitUntil.the(CheckoutPageInterface.PAYMENT_FIRST_NAME_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Clear.field(CheckoutPageInterface.PAYMENT_FIRST_NAME_INPUT),
                Enter.theValue(firstName).into(CheckoutPageInterface.PAYMENT_FIRST_NAME_INPUT),
                WaitUntil.the(CheckoutPageInterface.PAYMENT_LAST_NAME_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Clear.field(CheckoutPageInterface.PAYMENT_LAST_NAME_INPUT),
                Enter.theValue(lastName).into(CheckoutPageInterface.PAYMENT_LAST_NAME_INPUT),
                WaitUntil.the(CheckoutPageInterface.PAYMENT_EMAIL_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Clear.field(CheckoutPageInterface.PAYMENT_EMAIL_INPUT),
                Enter.theValue(email).into(CheckoutPageInterface.PAYMENT_EMAIL_INPUT),
                WaitUntil.the(CheckoutPageInterface.PAYMENT_TELEPHONE_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Clear.field(CheckoutPageInterface.PAYMENT_TELEPHONE_INPUT),
                Enter.theValue(telephone).into(CheckoutPageInterface.PAYMENT_TELEPHONE_INPUT),
                WaitUntil.the(CheckoutPageInterface.PAYMENT_COMPANY_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Clear.field(CheckoutPageInterface.PAYMENT_COMPANY_INPUT),
                Enter.theValue(company).into(CheckoutPageInterface.PAYMENT_COMPANY_INPUT),
                WaitUntil.the(CheckoutPageInterface.PAYMENT_FIRST_ADDRESS_LINE_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Clear.field(CheckoutPageInterface.PAYMENT_FIRST_ADDRESS_LINE_INPUT),
                Enter.theValue(addressLineOne).into(CheckoutPageInterface.PAYMENT_FIRST_ADDRESS_LINE_INPUT),
                WaitUntil.the(CheckoutPageInterface.PAYMENT_SECOND_ADDRESS_LINE_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Clear.field(CheckoutPageInterface.PAYMENT_SECOND_ADDRESS_LINE_INPUT),
                Enter.theValue(addressLineTwo).into(CheckoutPageInterface.PAYMENT_SECOND_ADDRESS_LINE_INPUT),
                WaitUntil.the(CheckoutPageInterface.PAYMENT_CITY_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Clear.field(CheckoutPageInterface.PAYMENT_CITY_INPUT),
                Enter.theValue(city).into(CheckoutPageInterface.PAYMENT_CITY_INPUT),
                WaitUntil.the(CheckoutPageInterface.PAYMENT_POSTAL_CODE_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Clear.field(CheckoutPageInterface.PAYMENT_POSTAL_CODE_INPUT),
                Enter.theValue(postalCode).into(CheckoutPageInterface.PAYMENT_POSTAL_CODE_INPUT),
                WaitUntil.the(CheckoutPageInterface.PAYMENT_COUNTRY_DROPDOWN, isVisible()).forNoMoreThan(5).seconds(),
                SelectFromOptions.byVisibleText(country).from(CheckoutPageInterface.PAYMENT_COUNTRY_DROPDOWN),
                WaitUntil.the(CheckoutPageInterface.PAYMENT_ZONE_DROPDOWN, isVisible()).forNoMoreThan(5).seconds(),
                SelectFromOptions.byVisibleText(region).from(CheckoutPageInterface.PAYMENT_ZONE_DROPDOWN),
                WaitUntil.the(CheckoutPageInterface.PAYMENT_ADDRESS_SAME_AS_DELIVERY, isVisible()).forNoMoreThan(5).seconds(),
                //Click.on(CheckoutPageInterface.PAYMENT_ADDRESS_SAME_AS_DELIVERY),
                WaitUntil.the(CheckoutPageInterface.PAYMENT_OPTION_CONTINUE_BUTTON, isClickable()).forNoMoreThan(5).seconds(),
                Scroll.to(CheckoutPageInterface.PAYMENT_OPTION_CONTINUE_BUTTON),
                Click.on(CheckoutPageInterface.PAYMENT_OPTION_CONTINUE_BUTTON),
                WaitUntil.the(CheckoutPageInterface.STEP_THREE_PANEL, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(CheckoutPageInterface.STEP_FOUR_PANEL, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(CheckoutPageInterface.DELIVERY_TEXTAREA, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(CheckoutPageInterface.DELIVERY_OPTION_CONTINUE_BUTTON, isClickable()).forNoMoreThan(5).seconds(),
                Click.on(CheckoutPageInterface.DELIVERY_OPTION_CONTINUE_BUTTON),
                WaitUntil.the(CheckoutPageInterface.STEP_FIVE_PANEL, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(CheckoutPageInterface.PAYMENT_METHOD_AGREE_INPUT, isClickable()).forNoMoreThan(5).seconds(),
                Click.on(CheckoutPageInterface.PAYMENT_METHOD_AGREE_INPUT),
                WaitUntil.the(CheckoutPageInterface.PAYMENT_METHOD_OPTION_CONTINUE_BUTTON, isClickable()).forNoMoreThan(5).seconds(),
                Click.on(CheckoutPageInterface.PAYMENT_METHOD_OPTION_CONTINUE_BUTTON),
                WaitUntil.the(CheckoutPageInterface.STEP_SIX_PANEL, isVisible()).forNoMoreThan(5).seconds()
        );
    }

    public static Performable placeOrder(){
        return Task.where("{0} completa la compra",
                WaitUntil.the(CheckoutPageInterface.BANK_TRANSFER_LABEL, isVisible()).forNoMoreThan(5).seconds(),
                WaitUntil.the(CheckoutPageInterface.CONFIRM_ORDER_BUTTON, isClickable()).forNoMoreThan(5).seconds(),
                Scroll.to(CheckoutPageInterface.CONFIRM_ORDER_BUTTON),
                Click.on(CheckoutPageInterface.CONFIRM_ORDER_BUTTON)
        );
    }
}
