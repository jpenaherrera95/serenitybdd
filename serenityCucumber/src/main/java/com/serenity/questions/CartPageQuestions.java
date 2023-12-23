package com.serenity.questions;

import com.serenity.userInterfaces.CartPageInterface;
import net.serenitybdd.screenplay.Question;

public class CartPageQuestions {

    public static Question<String> totalCartValue(){
        return actor -> CartPageInterface.TOTAL_LABEL.resolveFor(actor).getText();
    }

    public static Question<String> subTotalCartValue(){
        return actor -> CartPageInterface.SUB_TOTAL_LABEL.resolveFor(actor).getText();
    }
    public static Question<String> ecoTaxCartValue(){
        return actor -> CartPageInterface.ECO_TAX_LABEL.resolveFor(actor).getText();
    }
    public static Question<String> vatCartValue(){
        return actor -> CartPageInterface.VAT_TAX_LABEL.resolveFor(actor).getText();
    }

}
