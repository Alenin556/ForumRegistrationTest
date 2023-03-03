package page;

import com.codeborne.selenide.SelenideElement;
import data.UserData;

import static com.codeborne.selenide.Selenide.$x;

public class RegistrationPage {
    private final SelenideElement emailField = $x("//*[@id=\"form_register\"]/div[2]/span/input");
    private final SelenideElement loginField = $x("//*[@id=\"username\"]");
    private final SelenideElement passwordField = $x("//*[@id=\"form_register\"]/div[4]/span/input");
    private final SelenideElement verifyPasswordField = $x("//*[@id=\"form_register\"]/div[5]/span/input");
    private final SelenideElement registrationVerifyButton = $x("//*[@id=\"form_register\"]/div[6]/input");

    public RegistrationPage registrationUser(UserData.UserDataInfo info) {
        emailField.setValue(info.getEmail());
        loginField.setValue(info.getLogin());
        passwordField.setValue(info.getPassword());
        verifyPasswordField.setValue(info.getPassword());
        registrationVerifyButton.click();
        return new RegistrationPage();
    }
}
