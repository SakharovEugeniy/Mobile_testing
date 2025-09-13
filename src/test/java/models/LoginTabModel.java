package models;

import com.codeborne.selenide.appium.SelenideAppiumElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.appium.AppiumClickOptions.tap;
import static com.codeborne.selenide.appium.AppiumSelectors.withText;
import static com.codeborne.selenide.appium.SelenideAppium.$;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class LoginTabModel {

    private final SelenideAppiumElement loginTab = $(accessibilityId("Login")),
            signUpTab =  $(AppiumBy.xpath(".//*[@text='Sign up']")),
            inputEmail = $(accessibilityId("input-email")),
            inputPassword = $(accessibilityId("input-password")),
            inputConfirmPassword = $(accessibilityId("input-repeat-password")),
            buttonLogin =  $(AppiumBy.xpath(".//*[@content-desc='button-LOGIN']")),
            successLogin =  $(withText("You are logged in!")),
            successSignUp =  $(withText("You successfully signed up!")),
            buttonSignUp =  $(accessibilityId("button-SIGN UP")),
            wrongEmail =  $(AppiumBy.xpath(".//*[@text='Please enter a valid email address']")),
            wrongPassword =  $(AppiumBy.xpath(".//*[@text='Please enter at least 8 characters']")),
            wrongRepeatPassword =  $(AppiumBy.xpath(".//*[@text='Please enter the same password']"));


    @Step("Переходим на вкладку Login")
    public LoginTabModel clickLoginTab() {
        loginTab.click();
        return this;
    }

    @Step("Переходим на подвкладку Sign up")
    public LoginTabModel clickSignUpTab() {
        signUpTab.click();
        return this;
    }

    @Step("Вводим email: {0}")
    public LoginTabModel setEmail(String value) {
        inputEmail.click(tap()).setValue(value);
        return this;
    }

    @Step("Вводим password: {0}")
    public LoginTabModel setPassword(String value) {
        inputPassword.click(tap()).setValue(value);
        return this;
    }

    @Step("Вводим Confirm password: {0}")
    public LoginTabModel setConfirmPassword(String value) {
        inputConfirmPassword.click(tap()).setValue(value);
        return this;
    }

    @Step("Кликаем кнопку LOGIN")
    public LoginTabModel clickButtonSignUp() {
        buttonSignUp.click(tap());
        return this;
    }

    @Step("Кликаем кнопку SIGN UP")
    public LoginTabModel clickButtonLogin() {
        buttonLogin.click(tap());
        return this;
    }

    @Step("Успешно вошли")
    public LoginTabModel loginSuccess() {
        successLogin.shouldBe(visible);
        return this;
    }

    @Step("Успешно зарегистрировались")
    public LoginTabModel signUpSuccess() {
        successSignUp.shouldBe(visible);
        return this;
    }

    @Step("Поле email невалидно")
    public LoginTabModel emailIsWrong() {
        wrongEmail.shouldBe(visible);
        return this;
    }

    @Step("Поле password невалидно")
    public LoginTabModel passIsWrong() {
        wrongPassword.shouldBe(visible);
        return this;
    }

    @Step("Поле Confirm password невалидно")
    public LoginTabModel repeatPassIsWrong() {
        wrongRepeatPassword.shouldBe(visible);
        return this;
    }
}
