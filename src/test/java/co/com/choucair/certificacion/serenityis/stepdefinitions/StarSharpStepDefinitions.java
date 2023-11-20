package co.com.choucair.certificacion.serenityis.stepdefinitions;

import co.com.choucair.certificacion.serenityis.questions.IsDifferentMessage;
import co.com.choucair.certificacion.serenityis.tasks.BusinessUnits;
import co.com.choucair.certificacion.serenityis.tasks.Logins;
import co.com.choucair.certificacion.serenityis.tasks.Meeting;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static co.com.choucair.certificacion.serenityis.userinterfaces.MeetingPage.GENERATE_MEET;
import static co.com.choucair.certificacion.serenityis.utils.EnviromentConstants.ACTOR;
import static co.com.choucair.certificacion.serenityis.utils.EnviromentConstants.ENVIRONMENT_URL;

public class StarSharpStepDefinitions {

    @Before
    public void initialConfiguration() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("I want to schedule a new meet")
    public void iWantToScheduleANewMeet() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(ENVIRONMENT_URL));
    }
    @When("login to Startsharp go to schedule it")
    public void loginToStartsharpGoToScheduleIt(DataTable data) {
        List<Map<String, String>> newdata = data.asMaps();
        OnStage.theActorInTheSpotlight().attemptsTo(
                Logins.intoPage(newdata),
                BusinessUnits.menuPage(newdata),
                Meeting.toSchedule(newdata)
        );
    }
    @Then("the virtual meet is correctly created")
    public void theVirtualMeetIsCorrectlyCreated(DataTable data) {
        List<Map<String, String>> newdata = data.asMaps();
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        IsDifferentMessage.value(GENERATE_MEET,newdata.get(0).get("meetingName"))
                )
        );
    }
}
