package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class ForumRegistrationTest {

    @BeforeEach
    void setUpAll() {
        Configuration.holdBrowserOpen=true;
        open("https://www.gameawards.ru/forum/?ysclid=lesnhfxcnq108733024");
    }

    @Test
    void registration() {
        var mainPage = new MainPage();
        mainPage.registration();

    }
}
