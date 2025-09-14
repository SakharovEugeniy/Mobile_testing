package models;

import com.codeborne.selenide.appium.SelenideAppiumElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.appium.AppiumClickOptions.tap;
import static com.codeborne.selenide.appium.SelenideAppium.$;
import static io.appium.java_client.AppiumBy.accessibilityId;

public class DragTabModel {

    private final SelenideAppiumElement dragTab = $(accessibilityId("Drag"));
    private final SelenideAppiumElement startDragTabText = $(AppiumBy.xpath(".//*[@text='Drag and Drop']"));
    private final SelenideAppiumElement successDragAndDrop = $(AppiumBy.xpath(".//*[@text='You made it, click retry if you want to try it again.']"));
    private final SelenideAppiumElement renewButton = $(accessibilityId("renew"));
    private final SelenideAppiumElement retryButton = $(accessibilityId("button-Retry"));


    @Step("Переходим на вкладку Drag")
    public DragTabModel clickDragTab() {
        dragTab.click();
        return this;
    }

    @Step("Проверяем что видим текст Drag and Drop на вкладке Drag")
    public DragTabModel checkDragTabText() {
        startDragTabText.shouldBe(visible);
        return this;
    }

    @Step("Проверяем что картинка с роботом успешна собралась")
    public DragTabModel checkSuccessDragTab() {
        successDragAndDrop.shouldBe(visible);
        return this;
    }
    

    public DragTabModel dragAndDropElement(DragElement source, DragElement target) {
        source.getElement().dragAndDrop(to(target.getElement()));
        return this;
    }

    @Step("Перетаскивание {sourceName} на {targetName}")
    public DragTabModel dragAndDropElement(DragElement source, DragElement target,
                                           String sourceName, String targetName) {
        source.getElement().dragAndDrop(to(target.getElement()));
        return this;
    }

    @Step("Кликаем кнопку Retry")
    public DragTabModel clickButtonRetry() {
        retryButton.shouldBe(visible).click();
        return this;
    }

    @Step("Кликаем значок обновить картинку (Renew)")
    public DragTabModel clickButtonRenew() {
        renewButton.shouldBe(visible).click();
        return this;
    }
}
