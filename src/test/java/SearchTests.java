import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://www.ya.ru/");
        $("[name=text]").setValue("selenide").pressEnter();
        $("html").shouldHave(text("ru.selenide.org"));
    }
}
