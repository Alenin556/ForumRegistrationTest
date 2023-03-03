package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement logInButton = $x( "//*[@id=\"js-canvas\"]/aside/div/div[2]/a");
    private final SelenideElement registrationButton = $x( "//*[@id=\"login_f\"]/div/div[2]/div/div[2]/div[4]/a");




    public MainPage registration() {
        logInButton.click();
        registrationButton.click();
        return new MainPage();
    }

}
