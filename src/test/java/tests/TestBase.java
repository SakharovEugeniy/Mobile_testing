package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.appium.SelenideAppium;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.EmulateDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.appium.SelenideAppium.$;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = EmulateDriver.class.getName();
        Configuration.browserSize = null;
        Configuration.timeout = 30000;
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
        $(accessibilityId("Home-screen")).shouldBe(visible);
    }

    @AfterEach
    void tearDown() {
        String sessionId = Selenide.sessionId().toString();
        System.out.println(sessionId);

        Attach.pageSource();

        SelenideAppium.terminateApp("com.android.chrome");
        closeWebDriver();
    }
}