package com.mateoospina.practicaiautomatizacionendtoend.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SuccessfulPurchasePage {

    public static final Target SUCCESSFUL_MESSAGE = Target.the("Successful purchase message ")
            .locatedBy("//h2[text()='Thank you for your purchase!']");

    public static final Target OK = Target.the("Ok button successful purchase message ")
            .locatedBy("/html/body/div[10]/div[7]/div/button");

}
