package com.mateoospina.practicaiautomatizacionendtoend.stepdefinitions;

import com.mateoospina.practicaiautomatizacionendtoend.userinterface.DemoBlazeHomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.mateoospina.practicaiautomatizacionendtoend.userinterface.DemoBlazeHomePage.LOG_IN_MENU;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PurchaseStepDefinitions {

    private DemoBlazeHomePage homePage; //Para no pasar new cuando lo usemos, no es necesario instanciarlo ya que serenity lo hace con los page object

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast()); //Con esta linea serenity tiene el poder para orquestar, importa varias cosas de selenium
    }

    @Given("^(.*) is authenticated$")
    public void Authenticate(String actorName) {
        /**
         * Actor-habilidades
         *       Interacciones - interface
         *       Tareas - Grupo de interacciones
         */

        /**
         * En serenity existe la interfaz Performable, se derivan ---Task
         * Todo lo que sea ejecutable extiende de Perfomable      ---Action
         *                                                        ---Interaction
         * Todo lo que sea una tarea o que sea ejecutable, extiende de performable
         */

        /**
         * Selenium existe WebDriver localiza por medio de By los
         *          -WebElement
         *
         * Mapeamos los elementos como targets, que nos devuelve un webElementFacada y
         * de él podemos obtener un Webelement de selenium
         * que contiene más metodos
         *
         * Serenity -WebElementFacade
         *          /Target
         */
        theActorCalled(actorName).attemptsTo( //Metodo que recibe tareas
                Open.browserOn(homePage), //tarea  //caa metodo devuelve una tarea
                Click.on(LOG_IN_MENU)
                //authenticateWithUsername("admin") //Metodo con parametro String que devuelve un objeto
                 //       .andPassword("****")      //Que tiene este metodo con parametro
        );
        //throw new io.cucumber.java.PendingException();

    }

    @Given("^add from (.*) [a-z]{1,2} (.*)$")
    public void addToCart(String categoria, String product) {
        theActorInTheSpotlight().wasAbleTo(

        );
        //throw new io.cucumber.java.PendingException();
    }


    @When("^[a-zA-Z]{3,50} makes the purchase$")
    public void purchase() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("should see the message Thank you for your purchase")
    public void shouldSeeTheMessageThankYouForYourPurchase() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

}
