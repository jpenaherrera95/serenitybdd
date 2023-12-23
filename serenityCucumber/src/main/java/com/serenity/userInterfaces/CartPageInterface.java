package com.serenity.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPageInterface {
    public static final Target GIFT_CERTIFICATE_TITLE = Target.the("Gift Certificate Title").located(By.xpath("//h1[contains(text(),'Use Gift')]"));
    public static final Target CART_DETAILS_TABLE = Target.the("Cart Detail Table").located(By.cssSelector("form[enctype='multipart/form-data']:nth-child(2)"));
    public static final Target WHAT_WOULD_YOU_DO_NEXT_TITLE = Target.the("Gift Certificate Title").located(By.xpath("//h2[contains(text(),'What would you like to do next?')]"));
    public static final Target USE_COUPON_CODE_PANEL = Target.the("Use Coupon Code Panel").located(By.cssSelector("a[href='#collapse-coupon']"));
    public static final Target ESTIMATE_SHIPPING_AND_TAXES_PANEL = Target.the("Estimate Shipping and Taxes Panel").located(By.cssSelector("a[href='#collapse-shipping']"));
    public static final Target USE_GIFT_CERTIFICATE_PANEL = Target.the("Use Gift Certificate Panel").located(By.cssSelector("a[href='#collapse-voucher']"));
    public static final Target SUB_TOTAL_LABEL = Target.the("Subtotal Value").located(By.cssSelector("div[id=checkout-cart]>div:nth-child(3)>div:nth-child(1)>div:nth-child(7)>div>table:nth-child(1)>tbody>tr:nth-child(1)>td:nth-child(2)"));
    public static final Target ECO_TAX_LABEL = Target.the("Eco Tax Value").located(By.cssSelector("div[id=checkout-cart]>div:nth-child(3)>div:nth-child(1)>div:nth-child(7)>div>table:nth-child(1)>tbody>tr:nth-child(2)>td:nth-child(2)"));
    public static final Target VAT_TAX_LABEL = Target.the("Vat Tax Value").located(By.cssSelector("div[id=checkout-cart]>div:nth-child(3)>div:nth-child(1)>div:nth-child(7)>div>table:nth-child(1)>tbody>tr:nth-child(3)>td:nth-child(2)"));
    public static final Target TOTAL_LABEL = Target.the("Total Value").located(By.cssSelector("div[id=checkout-cart]>div:nth-child(3)>div:nth-child(1)>div:nth-child(7)>div>table:nth-child(1)>tbody>tr:nth-child(4)>td:nth-child(2)"));
    public static final Target CHECKOUT_BUTTON = Target.the("Checkout button").located(By.xpath("//a[contains(text(),'Checkout')]"));

}
