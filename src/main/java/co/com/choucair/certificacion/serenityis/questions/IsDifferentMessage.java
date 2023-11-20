package co.com.choucair.certificacion.serenityis.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class IsDifferentMessage implements Question<Boolean>{

  private Target message;
  private String messageRequest;

  public IsDifferentMessage(Target message, String messageRequest) {
    this.message = message;
    this.messageRequest = messageRequest;
  }

  public static IsDifferentMessage value(Target message, String messageRequest) {
    return new IsDifferentMessage(message,messageRequest);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    String msgs = Text.of(message).viewedBy(actor).asString();
    return msgs.equals(messageRequest);
  }
}
