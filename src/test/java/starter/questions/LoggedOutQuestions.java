package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.LoggedOutArea;

public class LoggedOutQuestions implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return LoggedOutArea.txtNoArticles.resolveFor(actor).getText();
    }

    public static Question<String> value() {
        return new LoggedOutQuestions();
    }
}
