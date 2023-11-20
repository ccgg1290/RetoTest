package co.com.choucair.certificacion.serenityis.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static co.com.choucair.certificacion.serenityis.userinterfaces.BusinessUnitsPage.SELECT_PARENT_UNIT;

public class SelectInTheList implements Interaction {

  private Target inputTarget;
  private String option;

  public SelectInTheList(Target inputTarget, String option) {
    this.inputTarget = inputTarget;
    this.option = option;
  }

  @Step("{0} select in the list the option '#option'")
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(inputTarget),
            Click.on(SELECT_PARENT_UNIT.of(option))
    );
  }

  public static SelectInTheList theOption(Target inputTarget, String option) {
    return Tasks.instrumented(SelectInTheList.class, inputTarget, option);
  }
}
