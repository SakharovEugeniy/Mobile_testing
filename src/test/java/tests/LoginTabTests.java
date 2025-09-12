package tests;


import io.appium.java_client.AppiumBy;
import models.LoginTabModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.appium.AppiumClickOptions.tap;
import static com.codeborne.selenide.appium.AppiumSelectors.withText;
import static com.codeborne.selenide.appium.SelenideAppium.$;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class LoginTabTests extends TestBase {

    private static String EMAIL = "123@mail.ru";
    private static String PASS = "12345678";
    private static String WRONG_EMAIL = "123@mail";
    private static String WRONG_PASS = "123";

    LoginTabModel loginTab = new LoginTabModel();

    @Test
    @DisplayName("Успешная проверка логина")
    void successSubmitLoginTest() {
        loginTab.clickLoginTab().setEmail(EMAIL).setPassword(PASS).clickButtonLogin().loginSuccess();
    }



    @Test
    void successfulSearchTest() {

        //$(AppiumBy.xpath(".//*[@content-desc='Login']")).click();
        $(accessibilityId("Login")).click();
        $(accessibilityId("input-email")).click(tap()).setValue("123@mail.ru");
        $(accessibilityId("input-password")).click(tap()).setValue("12345678");
        $(AppiumBy.xpath(".//*[@content-desc='button-LOGIN']")).click(tap());
        $(withText("You are logged in!")).shouldBe(visible);

    }


    @Test
    void emptyCred() {
        $(accessibilityId("Login")).click();
        $(AppiumBy.xpath(".//*[@content-desc='button-LOGIN']")).click(tap());
        $(AppiumBy.xpath(".//*[@text='Please enter a valid email address']")).shouldBe(visible);
        $(AppiumBy.xpath(".//*[@text='Please enter at least 8 characters']")).shouldBe(visible);
    }

}
