package com.serenity.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPageInterface {
    public static final Target CHECKOUT_PAGE_TITLE = Target.the("Checkout Page Title").located(By.xpath("//h1[contains(text(),'Checkout')]"));
    public static final Target STEP_ONE_PANEL = Target.the("Step One Panel").located(By.xpath("//a[contains(text(),'Step 1:')]"));
    public static final Target GUEST_CHECKOUT_RADIO = Target.the("Guest Checkout Radio Button").located(By.cssSelector("div[class=radio]:nth-child(4)>label>input"));
    public static final Target CHECKOUT_OPTION_CONTINUE_BUTTON = Target.the("Continue Button Checkout Option").located(By.cssSelector("input[id=button-account]"));
    public static final Target STEP_TWO_PANEL = Target.the("Step One Panel").located(By.xpath("//a[contains(text(),'Step 2:')]"));
    public static final Target PAYMENT_FIRST_NAME_INPUT = Target.the("First Name Input").located(By.cssSelector("#input-payment-firstname"));
    public static final Target PAYMENT_LAST_NAME_INPUT = Target.the("Last Name Input").located(By.cssSelector("#input-payment-lastname"));
    public static final Target PAYMENT_EMAIL_INPUT = Target.the("Email Input").located(By.cssSelector("#input-payment-email"));
    public static final Target PAYMENT_TELEPHONE_INPUT = Target.the("Telephone Input").located(By.cssSelector("#input-payment-telephone"));
    public static final Target PAYMENT_COMPANY_INPUT = Target.the("Company Input").located(By.cssSelector("#input-payment-company"));
    public static final Target PAYMENT_FIRST_ADDRESS_LINE_INPUT = Target.the("First Address Line Input").located(By.cssSelector("#input-payment-address-1"));
    public static final Target PAYMENT_SECOND_ADDRESS_LINE_INPUT = Target.the("Second Address Line Input").located(By.cssSelector("#input-payment-address-2"));
    public static final Target PAYMENT_CITY_INPUT = Target.the("City Input").located(By.cssSelector("#input-payment-city"));
    public static final Target PAYMENT_POSTAL_CODE_INPUT = Target.the("Postal Code Input").located(By.cssSelector("#input-payment-postcode"));
    public static final Target PAYMENT_COUNTRY_DROPDOWN = Target.the("Country Dropdown").located(By.cssSelector("#input-payment-country"));
    public static final Target PAYMENT_ZONE_DROPDOWN = Target.the("Region Dropdown").located(By.cssSelector("#input-payment-zone"));
    public static final Target PAYMENT_ADDRESS_SAME_AS_DELIVERY = Target.the("Delivery and Payment Address are the same checkbox").located(By.cssSelector("input[name=shipping_address]"));
    public static final Target PAYMENT_OPTION_CONTINUE_BUTTON = Target.the("Continue Button Payment Option").located(By.cssSelector("input[id=button-guest]"));
    public static final Target STEP_THREE_PANEL = Target.the("Step Three Panel").located(By.xpath("//a[contains(text(),'Step 3:')]"));
    public static final Target STEP_FOUR_PANEL = Target.the("Step Four Panel").located(By.xpath("//a[contains(text(),'Step 4:')]"));
    public static final Target DELIVERY_TEXTAREA = Target.the("Delivery Text Area").located(By.cssSelector("textarea"));
    public static final Target DELIVERY_OPTION_CONTINUE_BUTTON = Target.the("Continue Button Delivery Option").located(By.cssSelector("#button-shipping-method"));
    public static final Target STEP_FIVE_PANEL = Target.the("Step Five Panel").located(By.xpath("//h4[contains(text(),'Step 5:')]"));
    public static final Target PAYMENT_METHOD_AGREE_INPUT = Target.the("Payment Agree Checkbox").located(By.cssSelector("input[name=agree]"));
    public static final Target PAYMENT_METHOD_OPTION_CONTINUE_BUTTON = Target.the("Continue Button Payment Method Option").located(By.cssSelector("#button-payment-method"));
    public static final Target STEP_SIX_PANEL = Target.the("Step Six Panel").located(By.xpath("//h4[contains(text(),'Step 6:')]"));
    public static final Target SUB_TOTAL_LABEL = Target.the("Sub Total Label").located(By.cssSelector("div.container:nth-child(4) div.row div.col-sm-12 div.panel-group:nth-child(2) div.panel.panel-default:nth-child(6) div.panel-collapse.collapse.in div.panel-body div.table-responsive:nth-child(1) table.table.table-bordered.table-hover tfoot:nth-child(3) tr:nth-child(1) > td.text-right:nth-child(2)"));
    public static final Target FLAT_SHIPPING_RATE_LABEL = Target.the("Flat Shipping Rate Label").located(By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/table[1]/tfoot[1]/tr[2]/td[2]"));
    public static final Target TOTAL_LABEL = Target.the("Total Label").located(By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/table[1]/tfoot[1]/tr[3]/td[2]"));
    public static final Target BANK_TRANSFER_LABEL = Target.the("Bank Transfer Label").located(By.xpath("//h2[contains(text(),'Bank Transfer Instructions')]"));
    public static final Target CONFIRM_ORDER_BUTTON = Target.the("Confirm Order Button").located(By.cssSelector("#button-confirm"));

}
