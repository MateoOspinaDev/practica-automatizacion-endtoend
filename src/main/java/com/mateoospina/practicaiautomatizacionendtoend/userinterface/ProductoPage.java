package com.mateoospina.practicaiautomatizacionendtoend.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ProductoPage {

    public static final Target ADD_TO_CAR = Target.the("Add to car")
            .locatedBy("//*[@id=\"tbodyid\"]/div[2]/div/a");

}
