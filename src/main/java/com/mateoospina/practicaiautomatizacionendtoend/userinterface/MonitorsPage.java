package com.mateoospina.practicaiautomatizacionendtoend.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MonitorsPage {

    public static final Target APPLE_MONITOR_24 = Target
            .the("Apple monitor 24")
            .locatedBy("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
}
