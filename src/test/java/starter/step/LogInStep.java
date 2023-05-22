package starter.step;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.questions.LoggedInQuestions;
import starter.questions.LoggedOutQuestions;
import starter.tasks.Login;
import starter.tasks.LoginFailed;
import starter.tasks.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;

public class LogInStep {

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^Jorge Saganome wants to enter the application$")
    public void john_want_to_create_a_new_post() {
        theActorCalled("Jorge").attemptsTo(
                new NavigateTo()
        );
    }

    @When("^he sends his credentials$")
    public void he_Sends_His_Credentials() {
        theActorInTheSpotlight().attemptsTo(
                new Login()
        );
    }

    @Then("^he should see the dashboard$")
    public void he_should_see_the_dashboard() {
        String expectedYourFeedText = "No articles are here";
        theActorInTheSpotlight().should(
                seeThat("successful credentials", LoggedInQuestions.value(),
                        containsString(expectedYourFeedText))
        );
    }

    @When("^send your wrong credentials$")
    public void send_your_wrong_credentials() {
        theActorInTheSpotlight().attemptsTo(
                new LoginFailed()
        );
    }

    @Then("^he shouldn't see the board$")
    public void he_shouldnt_see_the_board() {
        String expectedYourFeedText = "Email or passsword invalid";
        theActorInTheSpotlight().should(
                seeThat("failed credentials", LoggedOutQuestions.value(),
                        containsString(expectedYourFeedText))
        );
    }
}