package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepoTest {

    @Test
    void shouldFindSelenideInGitHubTest() {

        // открыть страницу github.com
        open("https://github.com");

        // ввести в поле поиска selenide и нажать Enter
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();

        // перейти по ссылке от первого результата поиска
        $$(".repo-list li").first().$("a").click();

        // ОР: в заголовке встречается selenide/selenide
        $("#repository-container-header h1").shouldHave(text("selenide / selenide"));
    }
}
