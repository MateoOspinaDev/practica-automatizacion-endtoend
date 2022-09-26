package com.mateoospina.practicaiautomatizacionendtoend.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PlaceOrderPage {
    public static final Target NAME = Target.the("Name field to place order")
            .located(By.id("name"));

    public static final Target COUNTRY = Target.the("Country field to place order")
            .located(By.id("country"));

    public static final Target CITY = Target.the("City field to place order")
            .located(By.id("city"));

    public static final Target CARD = Target.the("Card field to place order")
            .located(By.id("card"));

    public static final Target MONTH = Target.the("Month field to place order")
            .located(By.id("month"));

    public static final Target YEAR = Target.the("Year field to place order")
            .located(By.id("year"));

    public static final Target PURCHASE = Target.the("Purchase button")
            .locatedBy("//*[@onclick='purchaseOrder()']");

    public static final Target CLOSE = Target.the("Close button")
            .locatedBy("//*[@id=\"orderModal\"]/div/div/div[3]/button[1]");

    //TODO Alert after purchase
}
