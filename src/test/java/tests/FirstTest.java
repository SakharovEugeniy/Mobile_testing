package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class FirstTest extends TestBase {

    @Test
    void successfulSearchTest() {

        Selenide.executeJavaScript("mobile: swipe",
                Map.of("direction", "up"));
    }

}
