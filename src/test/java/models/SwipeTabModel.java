package models;

import com.codeborne.selenide.appium.AppiumScrollOptions;
import com.codeborne.selenide.appium.SelenideAppiumElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.appium.AppiumSwipeOptions.right;
import static com.codeborne.selenide.appium.SelenideAppium.$;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class SwipeTabModel {

    private final SelenideAppiumElement swipeTab = $(accessibilityId("Swipe")),
            fullyOpenSource = $(AppiumBy.xpath(".//*[@text='FULLY OPEN SOURCE']")),
            greatCommunity = $(AppiumBy.xpath(".//*[@text='GREAT COMMUNITY']")),
            jsFoundation = $(AppiumBy.xpath(".//*[@text='JS.FOUNDATION']")),
            supportVideos = $(AppiumBy.xpath(".//*[@text='SUPPORT VIDEOS']")),
            extendable = $(AppiumBy.xpath(".//*[@text='EXTENDABLE']")),
            compatible = $(AppiumBy.xpath(".//*[@text='COMPATIBLE']")),
            webdriverLogo = $(accessibilityId("WebdriverIO logo"));


    @Step("Переходим на вкладку Swipe")
    public SwipeTabModel clickSwipeTab() {
        swipeTab.click();
        fullyOpenSource.shouldBe(visible);
        return this;
    }

    @Step("Свайпаем экран вправо 1 раз и находим иконку GREAT COMMUNITY")
    public SwipeTabModel swipeToGreatCommunity() {
        greatCommunity.swipe(right(1)).shouldBe(visible);
        return this;
    }

    @Step("Свайпаем экран вправо 2 раза и находим иконку JS.FOUNDATION")
    public SwipeTabModel swipeToJsFoundation() {
        jsFoundation.swipe(right(2)).shouldBe(visible);
        return this;
    }

    @Step("Свайпаем экран вправо 3 раза и находим иконку SUPPORT VIDEOS")
    public SwipeTabModel swipeToSupportVideos() {
        supportVideos.swipe(right(3)).shouldBe(visible);
        return this;
    }

    @Step("Свайпаем экран вправо 4 раза и находим иконку EXTENDABLE")
    public SwipeTabModel swipeToExtendable() {
        extendable.swipe(right(4)).shouldBe(visible);
        return this;
    }

    @Step("Свайпаем экран вправо 5 раз и находим иконку COMPATIBLE")
    public SwipeTabModel swipeToCompatible() {
        compatible.swipe(right(5)).shouldBe(visible);
        return this;
    }

    @Step("Скролим экран вниз до иконки робота WebdriverIO")
    public SwipeTabModel scrollToWebdriverLogo() {
        webdriverLogo.scroll(AppiumScrollOptions.down(0.09f, 0.39f))
                .scrollTo().shouldBe(visible);
        ;
        return this;
    }


}
