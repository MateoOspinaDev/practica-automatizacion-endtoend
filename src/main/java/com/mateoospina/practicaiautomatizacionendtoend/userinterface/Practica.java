package com.mateoospina.practicaiautomatizacionendtoend.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Practica {
    /*
    Contains
    Por atributo: usamos el arroba que nos indica que es atributo y el texto que se supone contiene
    Por texto: Es lo mismo si no que usamos la función text() para indicar que es el texto del elemento
     */
    public static final Target ADD_TO_CART_ATRIBUTE= Target.the("Add to car")
            .locatedBy("//a[contains(@href,'sign')]");

    public static final Target ADD_TO_CART_TEXT= Target.the("Add to car")
            .locatedBy("//a[contains(text(),'Sign')]");

    /*
    CSS selector: Se usa sin los slashs
    De momento no he visto un selector que funcione como el contains para texto
    DIFERENCIA ENTRE CSS Y XPATH: Con xpath los atributos debe iniciar con "@"
     */
    public static final Target SPAN_HAMBURGUER= Target.the("Add to car")
            .locatedBy("span[class='Button-label']");
}
