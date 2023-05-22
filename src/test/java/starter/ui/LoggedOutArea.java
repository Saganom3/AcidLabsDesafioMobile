package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoggedOutArea {
    public static Target txtNoArticles = Target
            .the("Email or passsword invalid")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Email or passsword invalid')]"));
}
