package com.mateoospina.practicaiautomatizacionendtoend.task;

import com.mateoospina.practicaiautomatizacionendtoend.exceptions.AuthenticationError;
import com.mateoospina.practicaiautomatizacionendtoend.model.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static com.mateoospina.practicaiautomatizacionendtoend.exceptions.AuthenticationError.MESSAGE_FAILED_AUTHENTICATION;
import static com.mateoospina.practicaiautomatizacionendtoend.userinterface.DemoBlazeHomePage.*;
import static com.mateoospina.practicaiautomatizacionendtoend.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class Authenticate implements Task {

    private final Credentials credentials;

    public Authenticate(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    @Step("{0}  performs an authentication") //Para personalizar el mensaje de reporte, toma el parametro del metodo (actor)
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                    Click.on(LOG_IN_MENU),
                    Enter.keyValues(credentials.getUsername()).into(USERNAME),
                    Enter.keyValues(credentials.getPassword()).into(PASSWORD),
                    Click.on(LOG_IN_BUTTON)
        );
        actor.should(seeThat(the(LOG_OUT_MENU),isVisible())
                .orComplainWith(AuthenticationError.class,MESSAGE_FAILED_AUTHENTICATION));
    }

    public static Authenticate authenticate(Credentials credentials){
        return instrumented(Authenticate.class,credentials);
    }
}
