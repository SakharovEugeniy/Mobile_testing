package models;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.appium.SelenideAppiumElement;
import com.codeborne.selenide.appium.conditions.CombinedAttribute;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.appium.AppiumCondition.attribute;
import static com.codeborne.selenide.appium.SelenideAppium.$;
import static com.codeborne.selenide.appium.SelenideAppium.back;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class WebviewTabModel {

    private final SelenideAppiumElement webviewTab = $(accessibilityId("Webview")),
            startWebviewLogo = $(AppiumBy.xpath(".//*[@text='WebdriverIO']")),
            getStarted = $(accessibilityId("Get Started")),
            gettingStartedText = $(AppiumBy.xpath(".//*[@text='Getting Started']")),
            whyWebdriver = $(accessibilityId("Why WebdriverIO?")),
            whyWebdriverText = $(AppiumBy.xpath(".//*[@text='Why Webdriver.IO?']")),
            viewOnGitHub = $(accessibilityId("View on GitHub")),
            gitHubURLText = $(AppiumBy.xpath(".//*[@resource-id='com.android.chrome:id/url_bar']")),
            watchOnYouTube = $(accessibilityId("Watch on YouTube")),
            browserStack = $(accessibilityId("BrowserStack")),
            browserStackURLText = $(AppiumBy.xpath(".//*[@resource-id='com.android.chrome:id/url_bar']")),
            homePageIcon = $(accessibilityId("Home page")),
            msFloatingButton = $(AppiumBy.xpath(".//*[@resource-id='ms-floating-button']")),
            youTubeChanel = $(accessibilityId("watchOnYouTube")),
            navigationBar = $(AppiumBy.xpath(".//*[@text='Toggle navigation bar']")),
            mainNavigationBar = $(AppiumBy.xpath(".//*[@text='Main']")),
            docs = $(accessibilityId("Docs")),
            sponsor = $(accessibilityId("Sponsor")),
            sponsorPageText = $(AppiumBy.xpath(".//*[@text='Become a WebdriverIO Sponsor']")),
            inputDialogPanel = $(AppiumBy.xpath(".//*[@resource-id='userInput']")),
            askButton = $(AppiumBy.xpath(".//*[@text='Ask']")),
            answerText = $(AppiumBy.xpath(".//*[@text='1. webdriver.io/docs/gettingstarted']"));


    @Step("Переходим на вкладку Webview")
    public WebviewTabModel clickWebviewTab() {
        webviewTab.click();
        Selenide.sleep(6000);
        return this;
    }

    @Step("Проверяем что видим логотип робота вкладки Webview")
    public WebviewTabModel checkWebviewTabLogo() {
        startWebviewLogo.shouldBe(visible);
        return this;
    }

    @Step("Кликаем Get Started")
    public WebviewTabModel clickGetStarted() {
        getStarted.scrollTo().shouldBe(visible).click();
        return this;
    }

    @Step("Видим текст на странице Get Started")
    public WebviewTabModel checkGettingStartedText() {
        gettingStartedText.shouldBe(visible);
        return this;
    }

    @Step("Кликаем иконку Home page")
    public WebviewTabModel clickHomePageIcon() {
        homePageIcon.click();
        return this;
    }

    @Step("Кликаем Why WebdriverIO?")
    public WebviewTabModel clickWhyWebdriver() {
        whyWebdriver.scrollTo().click();
        return this;
    }

    @Step("Видим текст на странице Why WebdriverIO?")
    public WebviewTabModel checkWebdriverIOText() {
        whyWebdriverText.shouldBe(visible);
        return this;
    }

    @Step("Кликаем View on GitHub")
    public WebviewTabModel clickViewOnGitHub() {
        viewOnGitHub.scrollTo().click();
        return this;
    }

    @Step("Проверяем что перешли на страницу webdriverio в GitHub ")
    public WebviewTabModel checkToGoGitHub() {
        CombinedAttribute combinedAttribute = CombinedAttribute.android("text");
        gitHubURLText.shouldHave(attribute(combinedAttribute, "github.com/webdriverio"));
        return this;
    }

    @Step("Кликаем Watch on YouTube")
    public WebviewTabModel clickWatchOnYouTube() {
        watchOnYouTube.scrollTo().click();
        return this;
    }

    @Step("Проверяем что перешли в YouTube")
    public WebviewTabModel checkYouTubeChanel() {
        youTubeChanel.scrollTo().shouldBe(visible);
        return this;
    }

    @Step("Кликаем BrowserStack")
    public WebviewTabModel clickBrowserStack() {
        browserStack.scrollTo().click();
        return this;
    }

    @Step("Проверяем что перешли на страницу automation-webdriverio в browserstack.com")
    public WebviewTabModel checkToBrowserStackCom() {
        CombinedAttribute combinedAttribute = CombinedAttribute.android("text");
        browserStackURLText.shouldHave(attribute(combinedAttribute, "browserstack.com/automation-webdriverio"));
        return this;
    }

    @Step("Клмкаем меню navigation bar")
    public WebviewTabModel clickNavigationBar() {
        navigationBar.click();
        mainNavigationBar.shouldBe(visible);
        return this;
    }

    @Step("Кликаем пункту Docs и проверяем что перешли на страницу Getting Started")
    public WebviewTabModel clickDocsInNavigationBar() {
        docs.click();
        gettingStartedText.shouldBe(visible);
        return this;
    }

    @Step("Кликаем пункту Sponsor и проверяем что перешли на страницу Become a WebdriverIO Sponsor")
    public WebviewTabModel clickSponsorInNavigationBar() {
        sponsor.click();
        sponsorPageText.shouldBe(visible);
        return this;
    }

    @Step("Кликаем плавающую кнопку Help")
    public WebviewTabModel clickHelpButton() {
        msFloatingButton.click();
        return this;
    }

    @Step("Проверяем что открылось диалоговое окно Assistant")
    public WebviewTabModel checkAssistantWindow() {
        inputDialogPanel.shouldBe(visible);
        return this;
    }

    @Step("Вводим текст в поле input диалогового окна Assistant: {0}")
    public WebviewTabModel setInputAssistantWindow(String value) {
        inputDialogPanel.setValue(value);
        return this;
    }

    @Step("Кликаем кнопку Ask")
    public WebviewTabModel clickAskButton() {
        askButton.click();
        return this;
    }

    @Step("Сравниваем ответ диалогового окна Assistant: {0}")
    public WebviewTabModel checkInputAssistantWindow(String value) {
        back();
        CombinedAttribute combinedAttribute = CombinedAttribute.android("text");
        answerText.scrollTo().shouldHave(attribute(combinedAttribute, value));
        return this;
    }


}
