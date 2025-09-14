package models;

import com.codeborne.selenide.appium.SelenideAppiumElement;
import com.codeborne.selenide.appium.conditions.CombinedAttribute;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.appium.AppiumClickOptions.tap;
import static com.codeborne.selenide.appium.AppiumCondition.attribute;
import static com.codeborne.selenide.appium.AppiumSelectors.withText;
import static com.codeborne.selenide.appium.SelenideAppium.$;
import static io.appium.java_client.AppiumBy.accessibilityId;


public class FormsTabModel {


    private final SelenideAppiumElement formsTab = $(accessibilityId("Forms")),
            startFormsTabText = $(AppiumBy.xpath(".//*[@text='Form components']")),
            textInput = $(accessibilityId("text-input")),
            inputTextResult = $(accessibilityId("input-text-result")),
            switchWidget = $(accessibilityId("switch")),
            switchText = $(accessibilityId("switch-text")),
            dropdown = $(AppiumBy.xpath(".//*[@resource-id='text_input']")),
            dropdownContextMenu = $(AppiumBy.xpath(".//*[@resource-id='com.wdiodemoapp:id/select_dialog_listview']")),
            buttonActive = $(accessibilityId("button-Active")),
            buttonInactive = $(accessibilityId("button-Inactive")),
            windowThisButtonIs = $(withText("This button is")),
            buttonOk = $(AppiumBy.xpath(".//*[@resource-id='android:id/button1']")),
            buttonCancel = $(AppiumBy.xpath(".//*[@resource-id='android:id/button2']")),
            buttonAskMeLater = $(AppiumBy.xpath(".//*[@resource-id='android:id/button3']"));


    @Step("Переходим на вкладку Forms")
    public FormsTabModel clickFormsTab() {
        formsTab.click();
        return this;
    }

    @Step("Проверяем что видим текст Form components на вкладке Forms")
    public FormsTabModel checkFormsTabText() {
        startFormsTabText.shouldBe(visible);
        return this;
    }

    @Step("Вводим в поле Input Field значение: {0}")
    public FormsTabModel setInputField(String value) {
        textInput.click(tap()).setValue(value);
        return this;
    }

    @Step("Проверяем что в поле Input Field значение: {0} ")
    public FormsTabModel checkInputField(String value) {
        CombinedAttribute combinedAttribute = CombinedAttribute.android("text");
        inputTextResult.shouldHave(attribute(combinedAttribute, value));
        return this;
    }

    @Step("Кликаем переключатель Switch")
    public FormsTabModel clickSwitch() {
        switchWidget.click();
        return this;
    }

    @Step("Проверяем что значение Switch переключателя ON")
    public FormsTabModel checkSwitchON() {
        CombinedAttribute combinedAttribute = CombinedAttribute.android("text");
        switchText.shouldHave(attribute(combinedAttribute, "Click to turn the switch ON"));
        return this;
    }

    @Step("Проверяем что значение Switch переключателя OFF")
    public FormsTabModel checkSwitchOFF() {
        CombinedAttribute combinedAttribute = CombinedAttribute.android("text");
        switchText.shouldHave(attribute(combinedAttribute, "Click to turn the switch OFF"));
        return this;
    }

    @Step("Проверяем что значение в dropdown меню: {0} ")
    public FormsTabModel checkTextInDropdown(String value) {
        CombinedAttribute combinedAttribute = CombinedAttribute.android("text");
        dropdown.shouldHave(attribute(combinedAttribute, value));
        return this;
    }

    @Step("Выбираем пункт {0} в dropdown меню")
    public FormsTabModel selectDropdownMenuItem(String value) {
        dropdown.click();
        dropdownContextMenu.shouldBe(visible);
        $(withText(value)).click();
        return this;
    }

    @Step("Кликаем кнопку Active")
    public FormsTabModel clickButtonActive() {
        buttonActive.click();
        windowThisButtonIs.shouldBe(visible);
        return this;
    }

    @Step("Кликаем неактивную но кликабельную кнопку Inactive")
    public FormsTabModel clickButtonInactive() {
        buttonInactive.click();
        buttonInactive.shouldBe(clickable);
        return this;
    }

    @Step("Окно This button is отображается")
    public FormsTabModel checkActiveWindowTrue() {
        windowThisButtonIs.shouldBe(visible);
        return this;
    }

    @Step("Окно This button is не отображается")
    public FormsTabModel checkActiveWindowFalse() {
        windowThisButtonIs.shouldBe(hidden);
        return this;
    }

    @Step("Кликаем кнопку Ok в окне This button is")
    public FormsTabModel clickButtonOk() {
        buttonOk.click();
        return this;
    }

    @Step("Кликаем кнопку CANSEL в окне This button is")
    public FormsTabModel clickButtonCancel() {
        buttonCancel.click();
        return this;
    }

    @Step("Кликаем кнопку ASK ME LATER в окне This button is")
    public FormsTabModel clickButtonAskMeLater() {
        buttonAskMeLater.click();
        return this;
    }


}