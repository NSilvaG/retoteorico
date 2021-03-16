package co.com.utest.retoteorico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchRegisterPage {

    public static final Target BUTTON_JT = Target.the("Da click para ingresar al registro")
            .located(By.xpath("//a[contains(@class, 'unauthenticated-nav-bar__sign-up')]"));

}
