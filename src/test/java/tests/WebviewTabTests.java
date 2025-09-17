package tests;

import com.codeborne.selenide.Selenide;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import models.WebviewTabModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;


import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.appium.SelenideAppium.$;
import static io.appium.java_client.AppiumBy.accessibilityId;


public class WebviewTabTests extends TestBase {

    WebviewTabModel webviewTab = new WebviewTabModel();

    @Test
    @DisplayName("Проверка перехода на вкладку Webview и отображения логотипа WebdriverIO")
    void homeLogoTabWebviewTest() {
        webviewTab.clickWebviewTab().checkWebviewTabLogo();
    }

    @Test
    @DisplayName("Проверка перехода по кнопке Get Started и обратно на на домашнюю страницу иконкой HomePage")
    void getSrartedToGoTest() {
        webviewTab.clickWebviewTab().clickGetStarted().checkGettingStartedText().clickHomePageIcon().checkWebviewTabLogo();
    }

    @Test
    @DisplayName("Проверка перехода по кнопке Why WebdriverIO? и обратно на на домашнюю страницу иконкой HomePage")
    void whyWebdriverToGoTest() {
        webviewTab.clickWebviewTab().clickWhyWebdriver().checkWebdriverIOText().clickHomePageIcon().checkWebviewTabLogo();
    }

    @Test
    @DisplayName("Проверка перехода по кнопке View on GitHub на страницу в GitHub")
    void viewOnGitHubToGoTest() {
        webviewTab.clickWebviewTab().clickViewOnGitHub().checkToGoGitHub();
    }

    @Test
    @Description("ТЕСТ ЗАПУСКАТЬ С VPN")
    @DisplayName("Проверка перехода по кнопке Watch on YouTube")
    void watchOnYouTubeToGoTest() {
        webviewTab.clickWebviewTab().clickWatchOnYouTube().checkYouTubeChanel();
    }

    @Test
    @DisplayName("Проверка перехода по логотипу BrowserStack")
    void viewOnBrowserStackToGoTest() {
        webviewTab.clickWebviewTab().clickBrowserStack().checkToBrowserStackCom();
    }

    @Test
    @DisplayName("Проверка пункта Docs во всплывающем меню navigation bar")
    void checkItemDocsNavigationBarTest() {
        webviewTab.clickWebviewTab().clickNavigationBar().clickDocsInNavigationBar();
    }

    @Test
    @DisplayName("Проверка пункта Sponsor во всплывающем меню navigation bar")
    void checkItemSponsorNavigationBarTest() {
        webviewTab.clickWebviewTab().clickNavigationBar().clickSponsorInNavigationBar();
    }

    @Test
    @DisplayName("Проверка работы диалогового окна Assistant")
    void checkAssistantWindowTest() {
        webviewTab.clickWebviewTab().clickHelpButton().checkAssistantWindow()
                .setInputAssistantWindow("Getting Started").clickAskButton().checkInputAssistantWindow("1. webdriver.io/docs/gettingstarted");
    }
}
