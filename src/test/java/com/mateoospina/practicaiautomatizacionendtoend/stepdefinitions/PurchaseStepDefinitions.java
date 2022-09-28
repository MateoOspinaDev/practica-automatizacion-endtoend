package com.mateoospina.practicaiautomatizacionendtoend.stepdefinitions;

import com.mateoospina.practicaiautomatizacionendtoend.model.Product;
import com.mateoospina.practicaiautomatizacionendtoend.model.Purchaser;
import com.mateoospina.practicaiautomatizacionendtoend.task.Add;
import com.mateoospina.practicaiautomatizacionendtoend.userinterface.DemoBlazeHomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.mateoospina.practicaiautomatizacionendtoend.model.Purchaser.PURCHASER_INFORMATION;
import static com.mateoospina.practicaiautomatizacionendtoend.model.PurchaserFactory.createByName;
import static com.mateoospina.practicaiautomatizacionendtoend.questions.PurchaseSuccessful.thePurchaseIsSuccessful;
import static com.mateoospina.practicaiautomatizacionendtoend.task.Authenticate.authenticate;
import static com.mateoospina.practicaiautomatizacionendtoend.task.Buy.buy;
import static com.mateoospina.practicaiautomatizacionendtoend.userinterface.CategoriesPage.LAPTOPS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
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
         *
         * En serenity existe la interfaz Performable, se derivan ---Task
         * Todo lo que sea ejecutable extiende de Perfomable      ---Action
         *                                                        ---Interaction
         * Todo lo que sea una tarea o que sea ejecutable, extiende de performable
         *
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
        Purchaser aPurchaser=createByName(actorName);

        theActorCalled(actorName).attemptsTo( //Metodo que recibe tareas
                Open.browserOn(homePage), //tarea---cada metodo devuelve una tarea
                authenticate(aPurchaser.getCredentials())
        );
        theActorInTheSpotlight().remember(PURCHASER_INFORMATION, aPurchaser);
    }

    @Given("^add from (.*) [a-z]{1,2} (.*)$")
    public void addToCart(String category, String product) {
        Product aProduct = Product.builder().category(category).name(product).build();//Producto creado con los arumentos del feature

        theActorInTheSpotlight().wasAbleTo(
            Add.toCart(aProduct)
        );
    }


    @When("^[a-zA-Z]{3,50} makes the purchase$")
    public void purchase() {
        theActorInTheSpotlight().attemptsTo(
            buy()
        );

    }

    @Then("should see the message Thank you for your purchase")
    public void shouldSeeTheMessageThankYouForYourPurchase() {
        theActorInTheSpotlight().should(seeThat(thePurchaseIsSuccessful()));
    }

}
