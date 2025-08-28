package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class FirstTest extends TestBase {


    @Test
    void successfulSearchTest() {

/*        Map<String, Object> params = new HashMap<>();
        params.put("left", 0);
        params.put("top", 135);
        params.put("width", 1080);
        params.put("height", 1842);
        params.put("direction", "up");
        params.put("percent", 0.75);
        Selenide.executeJavaScript("mobile: scrollGesture", params);*/

        SwipeActions.swipeUp();

        $("(//android.widget.TextView[parent::android.view.ViewGroup])[1]").shouldHave(text("WEBDRIVER"));


    }

}
