package com.serenity.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPageInterface {

    public static final Target PAGE_TITLE = Target.the("Page Title").located(By.xpath("//a[contains(text(),'Your Store')]"));
    public static final Target ADD_TO_CART_FIRST = Target.the("Add to Cart First Element").located(By.xpath("((//div[contains(@class,'button-group')])[1]/button)[1]"));
    public static final Target ADD_TO_CART_SECOND = Target.the("Add to Cart Second Element").located(By.xpath("((//div[contains(@class,'button-group')])[2]/button)[1]"));
    public static final Target CART_BUTTON = Target.the("Cart Button").located(By.cssSelector("div[id='cart']>button"));
    public static final Target ADDED_ELEMENT_ALERT = Target.the("Added to Cart Alert").located(By.cssSelector("div[class='alert alert-success alert-dismissible']"));
    public static final Target SUB_TOTAL_LABEL = Target.the("Subtotal Value").located(By.cssSelector("ul[class='dropdown-menu pull-right']>li:nth-child(2)>div>table>tbody>tr:nth-child(1)>td:nth-child(2)"));
    public static final Target ECO_TAX_LABEL = Target.the("Eco Tax Value").located(By.cssSelector("ul[class='dropdown-menu pull-right']>li:nth-child(2)>div>table>tbody>tr:nth-child(2)>td:nth-child(2)"));
    public static final Target VAT_TAX_LABEL = Target.the("Vat Tax Value").located(By.cssSelector("ul[class='dropdown-menu pull-right']>li:nth-child(2)>div>table>tbody>tr:nth-child(3)>td:nth-child(2)"));
    public static final Target TOTAL_LABEL = Target.the("Total Value").located(By.cssSelector("ul[class='dropdown-menu pull-right']>li:nth-child(2)>div>table>tbody>tr:nth-child(4)>td:nth-child(2)"));
    public static final Target VIEW_CART_BUTTON = Target.the("View Cart Button").located(By.xpath("//strong[contains(text(),' View Cart')]"));
    public static final Target CHECKOUT_CART_BUTTON = Target.the("Checkout Button").located(By.xpath("//strong[contains(text(),' Checkout')]"));

}
