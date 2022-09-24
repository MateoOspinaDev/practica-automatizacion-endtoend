package com.mateoospina.practicaiautomatizacionendtoend.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class PurchaseStepDefinitions {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast()); //Con esta linea serenity tiene el poder para orquestar, importa varias cosas de selenium
    }

    @Given("^(.*) is authenticated$")
    public void Authenticate(String actorName) {
        theActorCalled(actorName).attemptsTo(

        );
        throw new io.cucumber.java.PendingException();

    }

    @Given("^add from (.*) [a-z]{1,2} (.*)$")
    public void addToCart(String categoria, String product) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("^[a-zA-Z]{3,50} makes the purchase$")
    public void purchase() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("should see the message Thank you for your purchase")
    public void shouldSeeTheMessageThankYouForYourPurchase() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
