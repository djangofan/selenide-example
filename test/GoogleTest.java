import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
    @Test
    public void search_selenide_in_google() {
        open("http://google.com");
        $(By.name("q")).val("selenide").pressEnter();
        $$("#ires li.g").shouldHave(size(10));
        $("#ires").find(By.linkText("selenide.org")).shouldBe(visible);
    }
}