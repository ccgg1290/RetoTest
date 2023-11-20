package co.com.choucair.certificacion.serenityis.tasks;

import co.com.choucair.certificacion.serenityis.interactions.SelectInTheList;
import co.com.choucair.certificacion.serenityis.models.UnitModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static co.com.choucair.certificacion.serenityis.userinterfaces.BusinessUnitsPage.NEW_BUTTON;
import static co.com.choucair.certificacion.serenityis.userinterfaces.BusinessUnitsPage.SAVE_NEW_UNIT;
import static co.com.choucair.certificacion.serenityis.userinterfaces.MeetingPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Meeting implements Task {
    private final List<Map<String, String>> data;

    public Meeting(List<Map<String, String>> data) {
        this.data = data;
    }
    public static Meeting toSchedule(List<Map<String, String>> data) {
        return Tasks.instrumented(Meeting.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_MEETING),
                Click.on(MEETINGS),
                WaitUntil.the(MEETING_PAGE, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Click.on(NEW_BUTTON),
                WaitUntil.the(MEETING_NAME, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue(data.get(0).get("meetingName")).into(MEETING_NAME),
                WaitUntil.the(MEETING_TYPE, isClickable()).forNoMoreThan(60).seconds(),
                SelectInTheList.theOption(MEETING_TYPE,data.get(0).get("meetingType")),
                Enter.theValue(data.get(0).get("meetingNumber")).into(MEETING_NUMBER),
                Enter.theValue(data.get(0).get("meetingDate")).into(MEETING_START_DATE),
                SelectFromOptions.byValue(data.get(0).get("initHour")).from(SELECT_START_HOUR),
                Enter.theValue(data.get(0).get("meetingDate")).into(MEETING_END_DATE),
                SelectFromOptions.byValue(data.get(0).get("endHour")).from(SELECT_END_HOUR),
                WaitUntil.the(LOCATION, isClickable()).forNoMoreThan(60).seconds(),
                SelectInTheList.theOption(LOCATION,data.get(0).get("location")),
                WaitUntil.the(UNIT, isClickable()).forNoMoreThan(60).seconds(),
                SelectInTheList.theOption(UNIT,data.get(0).get("unitName"))
                //WaitUntil.the(ORGANIZED_BY, isClickable()).forNoMoreThan(60).seconds(),
                //SelectInTheList.theOption(ORGANIZED_BY,data.get(0).get("person")),
                //WaitUntil.the(REPORTER, isClickable()).forNoMoreThan(60).seconds()
                //SelectInTheList.theOption(REPORTER,data.get(0).get("person"))
                //Click.on(SAVE_NEW_UNIT)
        );



        actor.attemptsTo(
            WaitUntil.the(ORGANIZED_BY, isClickable()).forNoMoreThan(60).seconds(),
            SelectInTheList.theOption(ORGANIZED_BY,data.get(0).get("person")),
            WaitUntil.the(REPORTER, isClickable()).forNoMoreThan(60).seconds(),
            SelectInTheList.theOption(REPORTER,data.get(0).get("person")),
            Click.on(SAVE_NEW_UNIT));

        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
