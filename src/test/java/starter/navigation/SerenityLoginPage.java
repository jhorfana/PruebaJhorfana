package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://serenity.is/demo/Account/Login/")
public class SerenityLoginPage extends PageObject {
    public static final Target INPUT_USER_NAME = Target.the("Ingresar el usuario").located(By.name("Username"));
    public static final Target INPUT_PASSWORD = Target.the("Ingresar la contrasena").located(By.name("Password"));
    public static final Target BUTTON_SIGN_IN = Target.the("Seleccionar Boton Sign In").located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));

}
