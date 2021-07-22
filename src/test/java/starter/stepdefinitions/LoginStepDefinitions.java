package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.SerenityLoginPage;
import starter.task.BusinessUnitTask;
import starter.task.MeetingTask;
import starter.task.NavigateTo;
import starter.task.LoginTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class LoginStepDefinitions {

    private Actor actor = Actor.named("Jhorfana");

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que el usuario se registra$")
    public void queElUsuarioSeRegistra() {
        theActorCalled("cliente").attemptsTo(NavigateTo.theSerenityHomePage());
    }

    @When("^realiza el registro unidad de negocio$")
    public void realizaElRegistroDeUnidadDeNegocio() {
        theActorCalled("cliente").attemptsTo(LoginTask.inicioSesion("admin", "serenity"));
    }

    @Then("^el ingresa una nueva reunion$")
    public void elIngresaUnaNuevaReunion() {
      //  theActorCalled("cliente").attemptsTo(BusinessUnitTask.unidadNegocio("pruebaunidad"));
        //theActorCalled("cliente").attemptsTo((MeetingTask.));
    }

}
