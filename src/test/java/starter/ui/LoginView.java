package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginView {

    public static Target txtUsername = Target
            .the("Input email")
            .located(By.xpath("//android.widget.EditText[@text='Ex: email@dominio.com']"));

    public static Target txtPassword = Target
            .the("Input password")
            .located(By.xpath("//android.widget.EditText[@text='Password']"));

    public static Target btnLogin = Target
            .the("Boton Login")
            .located(By.xpath("//android.widget.TextView[@text='Sign In']"));



}
