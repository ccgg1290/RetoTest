package co.com.choucair.certificacion.serenityis.tasks;

import co.com.choucair.certificacion.serenityis.interactions.SelectInTheList;
import co.com.choucair.certificacion.serenityis.models.UnitModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.support.ui.Sleeper;

import java.util.List;
import java.util.Map;

import static co.com.choucair.certificacion.serenityis.userinterfaces.BusinessUnitsPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class BusinessUnits implements Task {
    private final List<Map<String, String>> data;

    public BusinessUnits(List<Map<String, String>> data) {this.data = data;}

    public static BusinessUnits menuPage(List<Map<String, String>> data) {
        return Tasks.instrumented(BusinessUnits.class, data);
    }

    @Step("{0} algo hace")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MAIN_TITLE, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Click.on(MENU_ORGANIZATION),
                Click.on(BUSINESS_UNITS),
                WaitUntil.the(BUSINESS_PAGE, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Click.on(NEW_BUTTON),
                WaitUntil.the(NAME_BUSINESS_UNIT, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue(data.get(0).get("unitName")).into(NAME_BUSINESS_UNIT),
                WaitUntil.the(PARENT_UNIT, isClickable()).forNoMoreThan(60).seconds(),
                SelectInTheList.theOption(PARENT_UNIT,data.get(0).get("unitOption"))
                //Click.on(SAVE_NEW_UNIT)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(Click.on(SAVE_NEW_UNIT));
    }
}
