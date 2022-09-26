package com.mateoospina.practicaiautomatizacionendtoend.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target PLACE_ORDER = Target.the("Place order button")
            .locatedBy("//*[@id='page-wrapper']/div/div[2]/button");

}
