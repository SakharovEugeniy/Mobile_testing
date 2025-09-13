package tests;

import models.SwipeTabModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SwipeTabTests extends TestBase {

    SwipeTabModel swipeTab = new SwipeTabModel();

    @Test
    @DisplayName("Проверка перехода на вкладку Swipe и отображения иконки FULLY OPEN SOURCE")
    void homeScreenTabSwipeTest() {
        swipeTab.clickSwipeTab();
    }

    @Test
    @DisplayName("Проверка что иконка GREAT COMMUNITY находится в пределах одного свайпа вправо")
    void searchIconByOneSwipeTest() {
        swipeTab.clickSwipeTab().swipeToGreatCommunity();
    }

    @Test
    @DisplayName("Проверка что иконка JS.FOUNDATION находится в пределах двух свайпов вправо")
    void searchIconByTwoSwipeTest() {
        swipeTab.clickSwipeTab().swipeToJsFoundation();
    }

    @Test
    @DisplayName("Проверка что иконка SUPPORT VIDEOS находится в пределах трёх свайпов вправо")
    void searchIconByThreeSwipeTest() {
        swipeTab.clickSwipeTab().swipeToSupportVideos();
    }

    @Test
    @DisplayName("Проверка что иконка EXTENDABLE находится в пределах четырёх свайпов вправо")
    void searchIconByFourSwipeTest() {
        swipeTab.clickSwipeTab().swipeToExtendable();
    }

    @Test
    @DisplayName("Проверка что иконка COMPATIBLE находится в пределах пяти свайпов вправо")
    void searchIconByFiveSwipeTest() {
        swipeTab.clickSwipeTab().swipeToCompatible();
    }

    @Test
    @DisplayName("Проверка вертикального скрола до иконки робота WebdriverIO")
    void searchIconWebdriverIOByScrollTest() {
        swipeTab.clickSwipeTab().scrollToWebdriverLogo();
    }
}
