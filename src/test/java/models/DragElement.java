package models;

import com.codeborne.selenide.appium.SelenideAppiumElement;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static com.codeborne.selenide.appium.SelenideAppium.$;
import static io.appium.java_client.AppiumBy.accessibilityId;

@Getter
@RequiredArgsConstructor
public enum DragElement {

    LEFT_EAR("Левое ухо", $(accessibilityId("drag-l1"))),
    HEAD("Голова", $(accessibilityId("drag-c1"))),
    RIGHT_EAR("Правое ухо", $(accessibilityId("drag-r1"))),
    LEFT_HAND("Левая рука", $(accessibilityId("drag-l2"))),
    TORSO("Торс", $(accessibilityId("drag-c2"))),
    RIGHT_HAND("Правая рука", $(accessibilityId("drag-r2"))),
    LEFT_LEG("Левая нога", $(accessibilityId("drag-l3"))),
    STOMACH("Живот", $(accessibilityId("drag-c3"))),
    RIGHT_LEG("Правая нога", $(accessibilityId("drag-r3"))),

    LEFT_EAR_PLACE("место для левого уха", $(accessibilityId("drop-l1"))),
    HEAD_PLACE("место для головы", $(accessibilityId("drop-c1"))),
    RIGHT_EAR_PLACE("место для правого уха", $(accessibilityId("drop-r1"))),
    LEFT_HAND_PLACE("место для левой руки", $(accessibilityId("drop-l2"))),
    TORSO_PLACE("место для торса", $(accessibilityId("drop-c2"))),
    RIGHT_HAND_PLACE("место для правой руки", $(accessibilityId("drop-r2"))),
    LEFT_LEG_PLACE("место для левой ноги", $(accessibilityId("drop-l3"))),
    STOMACH_PLACE("место для живота", $(accessibilityId("drop-c3"))),
    RIGHT_LEG_PLACE("место для правой ноги", $(accessibilityId("drop-r3")));

    private final String name;
    private final SelenideAppiumElement element;
}
