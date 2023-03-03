package data;
import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import lombok.Value;

import java.util.Locale;

public class UserData {

    static public String email = "testuser054@gmail.com";
    static public String login = "User054))";
    static public String password = "Password";

    static FakeValuesService fakeValuesService = new FakeValuesService(
            new Locale("en-GB"), new RandomService());

    public static String generateEmail () {
        var email = fakeValuesService.bothify("????##@gmail.com");
        return email;
    }

   public static String generateLogin () {
        var login = fakeValuesService.regexify("[a-z1-9]{10}");
        return login;
    }



    public static UserDataInfo getValidUserInfo() {
        return new UserDataInfo (generateEmail(),generateLogin(),password);
    }

    public static UserDataInfo getUserInfo() {
        return new UserDataInfo (email,login,password);
    }


    //контейнер для данных
    @Value
    public static class UserDataInfo  {
        private String email;
        private String login;
        private String password;
    }

}
