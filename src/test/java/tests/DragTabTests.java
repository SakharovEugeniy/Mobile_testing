package tests;

import models.DragElement;
import models.DragTabModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DragTabTests extends TestBase {

    DragTabModel dragTab = new DragTabModel();

    @Test
    @DisplayName("Проверка перехода на вкладку Drag и отображения текста Drag and Drop")
    void homeScreenTabSwipeTest() {
        dragTab.clickDragTab().checkDragTabText();
    }

    @Test
    @DisplayName("Проверка успешной DragAndDrop сборки робота")
    void successDragAndDropTest() {
        dragTab.clickDragTab()
                .checkDragTabText()
                .dragAndDropElement(DragElement.LEFT_EAR, DragElement.LEFT_EAR_PLACE, DragElement.LEFT_EAR.getName(), DragElement.LEFT_EAR_PLACE.getName())
                .dragAndDropElement(DragElement.HEAD, DragElement.HEAD_PLACE, DragElement.HEAD.getName(), DragElement.HEAD_PLACE.getName())
                .dragAndDropElement(DragElement.RIGHT_EAR, DragElement.RIGHT_EAR_PLACE, DragElement.RIGHT_EAR.getName(), DragElement.RIGHT_EAR_PLACE.getName())
                .dragAndDropElement(DragElement.LEFT_HAND, DragElement.LEFT_HAND_PLACE, DragElement.LEFT_HAND.getName(), DragElement.LEFT_HAND_PLACE.getName())
                .dragAndDropElement(DragElement.TORSO, DragElement.TORSO_PLACE, DragElement.TORSO.getName(), DragElement.TORSO_PLACE.getName())
                .dragAndDropElement(DragElement.RIGHT_HAND, DragElement.RIGHT_HAND_PLACE, DragElement.RIGHT_HAND.getName(), DragElement.RIGHT_HAND_PLACE.getName())
                .dragAndDropElement(DragElement.LEFT_LEG, DragElement.LEFT_LEG_PLACE, DragElement.LEFT_LEG.getName(), DragElement.LEFT_LEG_PLACE.getName())
                .dragAndDropElement(DragElement.STOMACH, DragElement.STOMACH_PLACE, DragElement.STOMACH.getName(), DragElement.STOMACH_PLACE.getName())
                .dragAndDropElement(DragElement.RIGHT_LEG, DragElement.RIGHT_LEG_PLACE, DragElement.RIGHT_LEG.getName(), DragElement.RIGHT_LEG_PLACE.getName())
                .checkSuccessDragTab();
    }

    @Test
    @DisplayName("Проверка роботы кнопки Retry после успешной сборки робота")
    void successClickRetryButtonTest() {
        dragTab.clickDragTab()
                .checkDragTabText()
                .dragAndDropElement(DragElement.LEFT_EAR, DragElement.LEFT_EAR_PLACE, DragElement.LEFT_EAR.getName(), DragElement.LEFT_EAR_PLACE.getName())
                .dragAndDropElement(DragElement.HEAD, DragElement.HEAD_PLACE, DragElement.HEAD.getName(), DragElement.HEAD_PLACE.getName())
                .dragAndDropElement(DragElement.RIGHT_EAR, DragElement.RIGHT_EAR_PLACE, DragElement.RIGHT_EAR.getName(), DragElement.RIGHT_EAR_PLACE.getName())
                .dragAndDropElement(DragElement.LEFT_HAND, DragElement.LEFT_HAND_PLACE, DragElement.LEFT_HAND.getName(), DragElement.LEFT_HAND_PLACE.getName())
                .dragAndDropElement(DragElement.TORSO, DragElement.TORSO_PLACE, DragElement.TORSO.getName(), DragElement.TORSO_PLACE.getName())
                .dragAndDropElement(DragElement.RIGHT_HAND, DragElement.RIGHT_HAND_PLACE, DragElement.RIGHT_HAND.getName(), DragElement.RIGHT_HAND_PLACE.getName())
                .dragAndDropElement(DragElement.LEFT_LEG, DragElement.LEFT_LEG_PLACE, DragElement.LEFT_LEG.getName(), DragElement.LEFT_LEG_PLACE.getName())
                .dragAndDropElement(DragElement.STOMACH, DragElement.STOMACH_PLACE, DragElement.STOMACH.getName(), DragElement.STOMACH_PLACE.getName())
                .dragAndDropElement(DragElement.RIGHT_LEG, DragElement.RIGHT_LEG_PLACE, DragElement.RIGHT_LEG.getName(), DragElement.RIGHT_LEG_PLACE.getName())
                .checkSuccessDragTab()
                .clickButtonRetry()
                .checkDragTabText();
    }

    @Test
    @DisplayName("Проверка роботы кнопки обновить картинку (Renew)")
    void successClickRenewButtonTest() {
        dragTab.clickDragTab()
                .checkDragTabText()
                .dragAndDropElement(DragElement.LEFT_EAR, DragElement.LEFT_EAR_PLACE, DragElement.LEFT_EAR.getName(), DragElement.LEFT_EAR_PLACE.getName())
                .clickButtonRenew()
                .dragAndDropElement(DragElement.LEFT_EAR, DragElement.LEFT_EAR_PLACE, DragElement.LEFT_EAR.getName(), DragElement.LEFT_EAR_PLACE.getName())
                .dragAndDropElement(DragElement.HEAD, DragElement.HEAD_PLACE, DragElement.HEAD.getName(), DragElement.HEAD_PLACE.getName())
                .dragAndDropElement(DragElement.RIGHT_EAR, DragElement.RIGHT_EAR_PLACE, DragElement.RIGHT_EAR.getName(), DragElement.RIGHT_EAR_PLACE.getName())
                .dragAndDropElement(DragElement.LEFT_HAND, DragElement.LEFT_HAND_PLACE, DragElement.LEFT_HAND.getName(), DragElement.LEFT_HAND_PLACE.getName())
                .dragAndDropElement(DragElement.TORSO, DragElement.TORSO_PLACE, DragElement.TORSO.getName(), DragElement.TORSO_PLACE.getName())
                .dragAndDropElement(DragElement.RIGHT_HAND, DragElement.RIGHT_HAND_PLACE, DragElement.RIGHT_HAND.getName(), DragElement.RIGHT_HAND_PLACE.getName())
                .dragAndDropElement(DragElement.LEFT_LEG, DragElement.LEFT_LEG_PLACE, DragElement.LEFT_LEG.getName(), DragElement.LEFT_LEG_PLACE.getName())
                .dragAndDropElement(DragElement.STOMACH, DragElement.STOMACH_PLACE, DragElement.STOMACH.getName(), DragElement.STOMACH_PLACE.getName())
                .dragAndDropElement(DragElement.RIGHT_LEG, DragElement.RIGHT_LEG_PLACE, DragElement.RIGHT_LEG.getName(), DragElement.RIGHT_LEG_PLACE.getName())
                .checkSuccessDragTab();
    }

    @Test
    @DisplayName("Проверка несоответствия  DragAndDrop элементов")
    void mismatchDragAndDropTest() {
        dragTab.clickDragTab()
                .checkDragTabText()
                .dragAndDropElement(DragElement.LEFT_EAR, DragElement.LEFT_EAR_PLACE, DragElement.LEFT_EAR.getName(), DragElement.LEFT_EAR_PLACE.getName())
                .dragAndDropElement(DragElement.HEAD, DragElement.HEAD_PLACE, DragElement.HEAD.getName(), DragElement.HEAD_PLACE.getName())
                .dragAndDropElement(DragElement.RIGHT_EAR, DragElement.RIGHT_EAR_PLACE, DragElement.RIGHT_EAR.getName(), DragElement.RIGHT_EAR_PLACE.getName())
                .dragAndDropElement(DragElement.LEFT_HAND, DragElement.LEFT_HAND_PLACE, DragElement.LEFT_HAND.getName(), DragElement.LEFT_HAND_PLACE.getName())
                .dragAndDropElement(DragElement.TORSO, DragElement.TORSO_PLACE, DragElement.TORSO.getName(), DragElement.TORSO_PLACE.getName())
                .dragAndDropElement(DragElement.RIGHT_HAND, DragElement.RIGHT_HAND_PLACE, DragElement.RIGHT_HAND.getName(), DragElement.RIGHT_HAND_PLACE.getName())
                .dragAndDropElement(DragElement.LEFT_LEG, DragElement.LEFT_LEG_PLACE, DragElement.LEFT_LEG.getName(), DragElement.LEFT_LEG_PLACE.getName())

                .dragAndDropElement(DragElement.STOMACH, DragElement.RIGHT_LEG_PLACE, DragElement.STOMACH.getName(), DragElement.RIGHT_LEG_PLACE.getName())
                .dragAndDropElement(DragElement.RIGHT_LEG, DragElement.STOMACH_PLACE, DragElement.RIGHT_LEG.getName(), DragElement.STOMACH_PLACE.getName())
                .checkDragTabText();
    }


}
