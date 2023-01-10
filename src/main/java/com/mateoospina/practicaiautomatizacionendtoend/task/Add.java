package com.mateoospina.practicaiautomatizacionendtoend.task;

import com.mateoospina.practicaiautomatizacionendtoend.model.Product;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static com.mateoospina.practicaiautomatizacionendtoend.userinterface.DemoBlazeHomePage.*;
import static com.mateoospina.practicaiautomatizacionendtoend.userinterface.ProductoPage.ADD_TO_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;


public class Add implements Task {

    public Add(Product product) {
        this.product = product;
    }

    private final Product product;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HOME, isClickable()).forNoMoreThan(5).seconds(), //Esperamos hasta que path...
                Click.on(HOME), //Clickeamos, podemos identificarlo por el xpath
                WaitUntil.the(CATEGORY_MENU.of(product.getCategory()), isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CATEGORY_MENU.of(product.getCategory())),
                WaitUntil.the(PRODUCT.of(product.getName()), isVisible()).forNoMoreThan(5).seconds(),
                Click.on(PRODUCT.of(product.getName())),
                Click.on(ADD_TO_CART),
                WaitUntil.the(alertIsPresent()).forNoMoreThan(Duration.ofSeconds(10)),
                Switch.toAlert() //Para aceptar la alerta
        );
    }

    public static Add toCart(Product product){
        return instrumented(Add.class,product);
    }
}
