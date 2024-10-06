package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorSelenide {
    @Test
    void andreiSolntsevShouldBeTheFirstContributor() {

        open("https://github.com/selenide/selenide");

        sleep(5000);

//        $("div.Layout-sidebar").scrollTo();
        $("div.Layout-sidebar").$(byText("Contributors"))
//            .closest(".BorderGrid-cell").$$("ul li").first().hover();
            .closest("h2").sibling(0).$$("li").first().hover();

        $(".Popover-message").shouldHave(text("Andrei Solntsev"));
    }
}
