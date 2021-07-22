package starter.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.navigation.SerenityLoginPage;

public class NavigateTo {

    public static Performable theSerenityHomePage() {
        return Task.where("{0} que el usuario accede a la pagina web",
                Open.browserOn().the(SerenityLoginPage.class));
    }
}