package page;

import com.codeborne.selenide.SelenideElement;
import data.UserData;

import static com.codeborne.selenide.Selenide.$x;

public class AuthorizationPage {

    private final SelenideElement loginField = $x("//*[@id=\"login_form\"]/div[2]");

    private final SelenideElement passwordField = $x("//*[@id=\"password\"]");
    private final SelenideElement authorizationButton =$x("//*[@id=\"login_form\"]/div[4]/input");

    public AuthorizationPage authorization(UserData.UserDataInfo info) {
        loginField.setValue(info.getLogin());
        passwordField.setValue(info.getPassword());
        authorizationButton.click();
        return new AuthorizationPage();
    }
}
