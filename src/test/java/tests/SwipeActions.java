package tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class SwipeActions extends TestBase {

    // Метод для свайпа вверх
    public static void swipeUp() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        Dimension size = driver.manage().window().getSize();

        int startX = size.width / 2;
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);

        performSwipe(startX, startY, startX, endY);
    }

    // Метод для свайпа вниз
    public static void swipeDown() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        Dimension size = driver.manage().window().getSize();

        int startX = size.width / 2;
        int startY = (int) (size.height * 0.2);
        int endY = (int) (size.height * 0.8);

        performSwipe(startX, startY, startX, endY);
    }

    // Метод для свайпа влево
    public static void swipeLeft() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        Dimension size = driver.manage().window().getSize();

        int startX = (int) (size.width * 0.8);
        int startY = size.height / 2;
        int endX = (int) (size.width * 0.2);

        performSwipe(startX, startY, endX, startY);
    }

    // Метод для свайпа вправо
    public static void swipeRight() {
        WebDriver driver = WebDriverRunner.getWebDriver();
        Dimension size = driver.manage().window().getSize();

        int startX = (int) (size.width * 0.2);
        int startY = size.height / 2;
        int endX = (int) (size.width * 0.8);

        performSwipe(startX, startY, endX, startY);
    }

    // Универсальный метод для выполнения свайпа
    private static void performSwipe(int startX, int startY, int endX, int endY) {
        WebDriver driver = WebDriverRunner.getWebDriver();

        // Приведение к правильному типу
        PerformsTouchActions touchDriver = (PerformsTouchActions) driver;

        new TouchAction<>(touchDriver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
    }

    // Метод для свайпа от элемента к элементу
    public static void swipeFromElementToElement(String fromElementSelector, String toElementSelector) {
        WebElement fromElement = Selenide.$(fromElementSelector);
        WebElement toElement = Selenide.$(toElementSelector);

        int startX = fromElement.getLocation().getX() + (fromElement.getSize().getWidth() / 2);
        int startY = fromElement.getLocation().getY() + (fromElement.getSize().getHeight() / 2);
        int endX = toElement.getLocation().getX() + (toElement.getSize().getWidth() / 2);
        int endY = toElement.getLocation().getY() + (toElement.getSize().getHeight() / 2);

        performSwipe(startX, startY, endX, endY);
    }

    // Метод для свайпа до появления элемента
    public static void swipeUntilElementVisible(String elementSelector, int maxSwipes, SwipeDirection direction) {
        int attempts = 0;

        while (attempts < maxSwipes && !Selenide.$(elementSelector).isDisplayed()) {
            switch (direction) {
                case UP:
                    swipeUp();
                    break;
                case DOWN:
                    swipeDown();
                    break;
                case LEFT:
                    swipeLeft();
                    break;
                case RIGHT:
                    swipeRight();
                    break;
            }
            attempts++;
            Selenide.sleep(1000); // Пауза между свайпами
        }
    }

    public enum SwipeDirection {
        UP, DOWN, LEFT, RIGHT
    }
}
