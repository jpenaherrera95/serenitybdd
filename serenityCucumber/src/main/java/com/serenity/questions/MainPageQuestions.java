package com.serenity.questions;

import com.serenity.userInterfaces.MainPageInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.questions.TextValue;

public class MainPageQuestions {
    public static Question<String> totalCartValue(){
        return actor -> MainPageInterface.TOTAL_LABEL.resolveFor(actor).getText();
    }
    public static Question<String> subTotalCartValue(){
        return actor -> MainPageInterface.SUB_TOTAL_LABEL.resolveFor(actor).getText();
    }
    public static Question<String> ecoTaxCartValue(){
        return actor -> MainPageInterface.ECO_TAX_LABEL.resolveFor(actor).getText();
    }
    public static Question<String> vatCartValue(){
        return actor -> MainPageInterface.VAT_TAX_LABEL.resolveFor(actor).getText();
    }
}
