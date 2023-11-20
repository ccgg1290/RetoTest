package co.com.choucair.certificacion.serenityis.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage{
    public static final Target INPUT_USER = Target.the("input the user")
            .located(By.name("Username"));
    public static final Target INPUT_PASSWORD = Target.the("input the password")
            .located(By.name("Password"));


    public static final Target SIGNIN = Target.the("button to submit")
            .located(By.xpath("//button[@type='submit']"));

    //public static final Target SIGNIN = $("//button[@type='submit']");
}
