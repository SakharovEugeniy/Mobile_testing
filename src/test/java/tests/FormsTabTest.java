package tests;

import models.FormsTabModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FormsTabTest extends TestBase {

    private static final String DEFAULT_ITEM = "Select an item...";
    private static final String WEBDRIVER_ITEM = "webdriver.io is awesome";
    private static final String APPIUM_ITEM = "Appium is awesome";
    private static final String THISAPP_ITEM = "Appium is awesome";

    FormsTabModel formsTab = new FormsTabModel();


    @Test
    @DisplayName("Проверка перехода на вкладку Forms и отображения текста Form components")
    void homeScreenTabFormsTest() {
        formsTab.clickFormsTab().checkFormsTabText();
    }

    @Test
    @DisplayName("Проверка Input Field поля")
    void homeScreenTabSwipeTest() {
        formsTab.clickFormsTab().setInputField("something").checkInputField("something");
    }

    @Test
    @DisplayName("Проверка переключателя Switch")
    void switchWidgetTest() {
        formsTab.clickFormsTab().checkSwitchON()
                .clickSwitch().checkSwitchOFF()
                .clickSwitch().checkSwitchON();
    }

    @Test
    @DisplayName("Проверка dropdown меню")
    void dropdownMenuTest() {
        formsTab.clickFormsTab().checkTextInDropdown(DEFAULT_ITEM)
                .selectDropdownMenuItem(WEBDRIVER_ITEM).checkTextInDropdown(WEBDRIVER_ITEM)
                .selectDropdownMenuItem(APPIUM_ITEM).checkTextInDropdown(APPIUM_ITEM)
                .selectDropdownMenuItem(THISAPP_ITEM).checkTextInDropdown(THISAPP_ITEM);
    }

    @Test
    @DisplayName("Проверка кнопки Active")
    void buttonActiveTest() {
        formsTab.clickFormsTab()
                .clickButtonActive().checkActiveWindowTrue().clickButtonOk().checkActiveWindowFalse()
                .clickButtonActive().checkActiveWindowTrue().clickButtonCancel().checkActiveWindowFalse()
                .clickButtonActive().checkActiveWindowTrue().clickButtonAskMeLater().checkActiveWindowFalse()
                .checkFormsTabText();
    }

    @Test
    @DisplayName("Проверка кнопки Inactive")
    void buttonInactiveTest() {
        formsTab.clickFormsTab()
                .clickButtonInactive().checkActiveWindowFalse().checkFormsTabText();
    }
}
