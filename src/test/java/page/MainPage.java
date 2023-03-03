package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement registrationButton = $x( "//*[@id=\"js-canvas\"]/aside/div/div[2]/a");
    private final SelenideElement registrationButton1 =$(byText("Войти"));



    public MainPage registration() {
        registrationButton.click();
        return new MainPage();
    }

}
