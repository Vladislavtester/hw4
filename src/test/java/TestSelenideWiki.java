import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.*;

public class TestSelenideWiki {
    @Test
    void Softassertions() {
        open("https://github.com");
        $("[placeholder='Search GitHub']").setValue("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("#wiki-tab").click();
        $("#wiki-body").shouldHave(text("Soft assertions"));
        $(byLinkText("Soft assertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5"));
        sleep(3000);
    }
}
