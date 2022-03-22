package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainContributorTest {
    @Test
    void shouldFindMainContributorTest() {

        // открыть страницу репозитория selenide
        open("https://github.com/selenide/selenide");

        // навести указатель мыши на первый элемент в области Contributors
        $(".Layout-sidebar").$(byText("Contributors")).closest("div").$("li").hover();

        // ОР: в появившемся окошке (overlay) текст Andrei Solntsev
        $$(".Popover-message").find(visible).shouldHave(text("Andrei Solntsev"));
    }
}
