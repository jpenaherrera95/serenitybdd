package com.serenity.questions;

import com.serenity.userInterfaces.SuccessPageInterface;
import net.serenitybdd.screenplay.Question;

public class SuccessPageQuestions {
    public static Question<Boolean> orderPlacedTitle(){
        return SuccessPageInterface.ORDER_PLACED_TITLE::isVisibleFor;
    }
    public static Question<Boolean> orderProcessedMessage(){
        return SuccessPageInterface.ORDER_PROCESSED_LABEL::isVisibleFor;
    }
    public static Question<Boolean> anyQuestionLabelMessage(){
        return SuccessPageInterface.ANY_QUESTION_LABEL::isVisibleFor;
    }
    public static Question<Boolean> thanksMessage(){
        return SuccessPageInterface.THANKS_LABEL::isVisibleFor;
    }
    public static Question<Boolean> continueButton(){
        return SuccessPageInterface.CONTINUE_BUTTON::isVisibleFor;
    }
}
