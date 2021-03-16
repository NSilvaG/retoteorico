package co.com.utest.retoteorico.stepdefinitions;

import co.com.utest.retoteorico.tasks.OpenUp;
import co.com.utest.retoteorico.tasks.Register;
import co.com.utest.retoteorico.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UtestStepDefinitions {

    @Before
    public void setStage(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^aker wants to register in page$")
    public void aker_wants_to_register_in_page() {
        OnStage.theActorCalled("aker").wasAbleTo(OpenUp.thePage());

    }

    @When("^he search how register$")
    public void he_search_how_register() {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the());
    }

    @Then("^he finds the register form$")
    public void he_finds_the_register_form() {
        OnStage.theActorCalled("aker").wasAbleTo(Register.onThePage());
    }



}
