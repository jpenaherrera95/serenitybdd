package com.serenity.questions;

import com.serenity.userInterfaces.CheckoutPageInterface;
import net.serenitybdd.screenplay.Question;

public class CheckoutPageQuestions {
    public static Question<String> totalOrderValue(){
        return actor -> CheckoutPageInterface.TOTAL_LABEL.resolveFor(actor).getText();
    }
    public static Question<String> subTotalOrderValue(){
        return actor -> CheckoutPageInterface.SUB_TOTAL_LABEL.resolveFor(actor).getText();
    }
    public static Question<String> flatOrderValue(){
        return actor -> CheckoutPageInterface.FLAT_SHIPPING_RATE_LABEL.resolveFor(actor).getText();
    }
}
