package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoggedInArea {
    public static Target txtNoArticles = Target
            .the("Text No articles are here... yet")
            .located(By.xpath("//android.widget.TextView[contains(@text,'No articles are here')]"));
}
