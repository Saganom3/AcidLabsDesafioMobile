package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeView {
    public static Target loginScreenLink = Target
            .the("Login Screen Link")
            .located(By.xpath("//android.widget.Button[@content-desc='Login, tab, 2 of 2']/android.widget.ImageView"));
}
