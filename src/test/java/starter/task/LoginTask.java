package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromBy;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.serenitybdd.screenplay.questions.SelectedValue;
import org.fluentlenium.core.search.Search;
import org.yecht.Data;
import starter.navigation.SerenityBusinessPage;
import starter.navigation.SerenityLoginPage;
import starter.navigation.SerenityMeetingPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class LoginTask implements Task {
    private final String usuario;
    private final String contrasena;

    public LoginTask(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(usuario).into(SerenityLoginPage.INPUT_USER_NAME),
                Enter.theValue(contrasena).into(SerenityLoginPage.INPUT_PASSWORD),
                Click.on(SerenityLoginPage.BUTTON_SIGN_IN));
        agregarBusinessUnit(actor);
        agregarReunion(actor);

    }
    public static Performable inicioSesion(String usuario, String contrasena) {
        return instrumented(LoginTask.class, usuario, contrasena);
    }

    private void agregarBusinessUnit(Actor actor){
        actor.attemptsTo(Click.on(SerenityBusinessPage.MENU_ORGANIZATION));
        actor.attemptsTo(Click.on(SerenityBusinessPage.MENU_BUSINESS_UNIT));
        actor.attemptsTo(Click.on(SerenityBusinessPage.NEW_BUSINESS_UNIT));
        actor.attemptsTo(Enter.theValue("unidadprueba").into(SerenityBusinessPage.INPUT_NAME_UNIT));
        actor.attemptsTo(Click.on(SerenityBusinessPage.SAVE_NAME_UNIT));
    }

    private void agregarReunion(Actor actor){
        actor.attemptsTo(Click.on(SerenityMeetingPage.MENU_MEETING));
        actor.attemptsTo(Click.on(SerenityMeetingPage.MENU_MEETINGS));
        actor.attemptsTo(Click.on(SerenityMeetingPage.NEW_MEETING));
        actor.attemptsTo(Enter.theValue("Nueva Reunion Prueba").into(SerenityMeetingPage.INPUT_NAME_MEETIN));
        actor.attemptsTo(Enter.theValue("123456").into(SerenityMeetingPage.INPUT_NUMBER_MEETING));
        actor.attemptsTo(Enter.theValue("07/23/2021").into(SerenityMeetingPage.INPUT_DATE_IN));
        actor.attemptsTo(Enter.theValue("07/23/2021").into(SerenityMeetingPage.INPUT_DATE_OUT));
        actor.attemptsTo(Click.on(SerenityMeetingPage.SAVE_NEW_MEETING));
    }

}
