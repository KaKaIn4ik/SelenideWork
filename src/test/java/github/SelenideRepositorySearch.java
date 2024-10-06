package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {

        open("https://github.com/");

        sleep(5000);
        $("[placeholder='Search or jump to...']").click();
        $("[id=query-builder-test]").setValue("selenide").pressEnter();

        sleep(5000);
        $("a[href^=\"/selenide/selenide\"]").click();

        $("#repository-container-header").shouldHave(text("selenide / selenide"));


        sleep(5000);

    }

}
