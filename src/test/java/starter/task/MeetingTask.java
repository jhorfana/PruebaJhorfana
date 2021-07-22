package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import starter.navigation.SerenityBusinessPage;
import starter.navigation.SerenityMeetingPage;

public class MeetingTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SerenityMeetingPage.MENU_MEETING));
        actor.attemptsTo(Click.on(SerenityMeetingPage.MENU_MEETINGS));
        actor.attemptsTo(Click.on(SerenityMeetingPage.NEW_MEETING));
        actor.attemptsTo(Enter.theValue("Nueva Reunion Prueba").into(SerenityMeetingPage.INPUT_NAME_MEETIN));
        actor.attemptsTo(Click.on(SerenityMeetingPage.SAVE_NEW_MEETING));
    }
}
