package tests;

import models.LoginTabModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    @DisplayName("Проверка невозможности логина с пустыми полями")
    void emptyEmailAndPasswordTest() {
        loginTab.clickLoginTab().clickButtonLogin().emailIsWrong().passIsWrong();
    }

    @Test
    @DisplayName("Проверка невозможности логина с неправильным email")
    void wrongEmailTest() {
        loginTab.clickLoginTab().setEmail(WRONG_EMAIL).setPassword(PASS).clickButtonLogin().emailIsWrong();
    }

    @Test
    @DisplayName("Проверка невозможности логина с паролем меньше 8 символов")
    void invalidPasswordTest() {
        loginTab.clickLoginTab().setEmail(EMAIL).setPassword(WRONG_PASS).clickButtonLogin().passIsWrong();
    }

    @Test
    @DisplayName("Успешная проверка регистрации")
    void successSubmitRegistrationTest() {
        loginTab.clickLoginTab().clickSignUpTab().setEmail(EMAIL).setPassword(PASS).setConfirmPassword(PASS)
                .clickButtonSignUp().signUpSuccess();
    }

    @Test
    @DisplayName("Проверка невозможности регистрации с пустым полем подтверждения пароля")
    void emptyConfirmPasswordTest() {
        loginTab.clickLoginTab().clickSignUpTab().setEmail(EMAIL).setPassword(PASS).clickButtonSignUp().repeatPassIsWrong();
    }

    @Test
    @DisplayName("Проверка невозможности регистрации при неподтверждении пароля")
    void wrongConfirmPasswordTest() {
        loginTab.clickLoginTab().clickSignUpTab().setEmail(EMAIL).setPassword(PASS).setConfirmPassword(WRONG_PASS)
                .clickButtonSignUp().repeatPassIsWrong();
    }
}
