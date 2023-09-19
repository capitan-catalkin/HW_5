package src.test.java;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchEnterprizeTest {


    @Test
    void solutionsTest(){
        open("https://github.com/");
        Configuration.pageLoadStrategy = "eager";
        $(byTagAndText("button", "Solutions")).hover();
        $(byTagAndText("a", "Enterprise")).click();
        $(".enterprise-hero").shouldHave(text("Build like the best"));

    }

}
