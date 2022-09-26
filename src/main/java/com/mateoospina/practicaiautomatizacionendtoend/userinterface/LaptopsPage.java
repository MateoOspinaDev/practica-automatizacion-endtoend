package com.mateoospina.practicaiautomatizacionendtoend.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class LaptopsPage {
    public static final Target MACBOOKAIR = Target
            .the("MacBook air")
            .locatedBy("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a");
}
