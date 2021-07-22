package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.navigation.SerenityBusinessPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BusinessUnitTask implements Task {
    private final String unidad;

    public BusinessUnitTask(String unidad){
        this.unidad = unidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SerenityBusinessPage.MENU_ORGANIZATION));
        actor.attemptsTo(Click.on(SerenityBusinessPage.MENU_BUSINESS_UNIT));
        actor.attemptsTo(Click.on(SerenityBusinessPage.NEW_BUSINESS_UNIT));
        actor.attemptsTo(Enter.theValue(unidad).into(SerenityBusinessPage.INPUT_NAME_UNIT));
        actor.attemptsTo(Click.on(SerenityBusinessPage.SAVE_NAME_UNIT));

    }

    public static Performable unidadNegocio(String unidad){
        return  instrumented(BusinessUnitTask.class, unidad);
    }

}
