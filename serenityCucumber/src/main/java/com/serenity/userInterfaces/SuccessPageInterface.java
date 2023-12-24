package com.serenity.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SuccessPageInterface {
    public static final Target ORDER_PLACED_TITLE = Target.the("Order Placed Title").located(By.xpath("//h1[contains(text(),'Your order has been placed!')]"));
    public static final Target ORDER_PROCESSED_LABEL = Target.the("Order Processed Label").located(By.xpath("//p[contains(text(),'Your order has been successfully processed!')]"));
    public static final Target ANY_QUESTION_LABEL = Target.the("Any Questions Label").located(By.xpath("//p[contains(text(),'Please direct any questions you have to the ')]"));
    public static final Target THANKS_LABEL = Target.the("Thanks Label").located(By.xpath("//p[contains(text(),'Thanks for shopping with us online!')]"));
    public static final Target CONTINUE_BUTTON = Target.the("Continue Button").located(By.cssSelector("div[class='pull-right']>a[href='http://opencart.abstracta.us:80/index.php?route=common/home']"));
}
