package com.mateoospina.practicaiautomatizacionendtoend.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriesPage {

    public static final Target PHONES = Target
            .the("phones")
            .locatedBy("//*[@onclick=\"byCat('phone')\"]");

    public static final Target LAPTOPS = Target
            .the("laptops")
            .locatedBy("//*[@onclick=\"byCat('notebook')\"]");

    public static final Target MONITORS = Target
            .the("monitors")
            .locatedBy("//*[@onclick=\"byCat('monitor')\"]");

}
