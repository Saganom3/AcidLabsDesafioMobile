package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.ui.LoginView;

public class LoginFailed implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("prueba@accenture.com").into(LoginView.txtUsername),
                SendKeys.of("654321").into(LoginView.txtPassword),
                Click.on(LoginView.btnLogin)
        );
    }
}
