package com.mateoospina.practicaiautomatizacionendtoend.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static com.mateoospina.practicaiautomatizacionendtoend.userinterface.SuccessfulPurchasePage.SUCCESSFUL_MESSAGE;

@Subject("The Purchase is Successful") //Para que salga en el reporte
public class PurchaseSuccessful implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return SUCCESSFUL_MESSAGE.isVisibleFor(actor);
    }

    public static PurchaseSuccessful thePurchaseIsSuccessful(){
        return new PurchaseSuccessful();
    }
}
