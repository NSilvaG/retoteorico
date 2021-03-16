package co.com.utest.retoteorico.tasks;

import co.com.utest.retoteorico.userinterface.RegisterForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class Register implements Task {

    public static Register onThePage() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Nelly").into(RegisterForm.INPUT_FIRSTNAME),
                Enter.theValue("Silva").into(RegisterForm.INPUT_LASTNAME),
                Enter.theValue("silvagalindo97@gmail.com").into(RegisterForm.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("January").from(RegisterForm.SELECT_MONTH),
                SelectFromOptions.byVisibleText("21").from(RegisterForm.SELECT_DAY),
                SelectFromOptions.byVisibleText("1997").from(RegisterForm.SELECT_YEAR),
                //Enter.theValue("Spanish").into(RegisterForm.INPUT_LANGUAGE).thenHit(Keys.ENTER),
                Click.on(RegisterForm.BUTTON_NL),
                Enter.keyValues("Bogota colombia").into(RegisterForm.SELECT_CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(RegisterForm.SELECT_CITY),
                WaitUntil.the(RegisterForm.SELECT_CITY, WebElementStateMatchers.isVisible()),
                Enter.theValue("113111").into(RegisterForm.INPUT_POSTALCODE).thenHit(Keys.RETURN),
                Click.on(RegisterForm.BUTTON_D),
                SelectFromOptions.byVisibleText("Samsung").from(RegisterForm.SELECT_MOBILE)
        );
    }


}
