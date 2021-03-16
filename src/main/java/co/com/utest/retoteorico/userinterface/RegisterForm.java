package co.com.utest.retoteorico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterForm  {
    public static final Target INPUT_FIRSTNAME = Target.the("escriba nombre")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("escriba apellido")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("escriba email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("seleccione mes")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("seleccione dia")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("seleccione año")
            .located(By.id("birthYear"));
    //public static final Target INPUT_LANGUAGE = Target.the("escriba lenguaje")
    //        .located(By.xpath("//div[contains(text(), 'Spanish')]"));
   public static final Target BUTTON_NL = Target.the("Da click para continuar")
           .located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
    public static final Target SELECT_CITY = Target.the("escriba ciudad")
            .located(By.id("city"));
    public static final Target INPUT_POSTALCODE = Target.the("escriba codigo postal")
            .located(By.id("zip"));
    public static final Target BUTTON_D = Target.the("Da click para continuar")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue pull-right')]"));
    public static final Target SELECT_MOBILE = Target.the("Da click para seleccionar")
            .located(By.xpath("//div[contains(@class, 'form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched')]"));
    //public static final Target SELECT_MODEL = Target.the("Da click para seleccionar")
      //      .located(By.xpath("//div[contains(@class, 'ui-select-match')]"));
    //public static final Target SELECT_OPSYST = Target.the("Da click para seleccionar")
      //      .located(By.xpath("//div[contains(@class, 'ui-select-match')]"));

}
