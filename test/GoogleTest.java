import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest
{
    @Test
    public void searchForSelenideInGoogle()
    {
        open("http://google.com");
        $(By.name("q")).val("selenide").pressEnter();

        $$("#ires li.g").shouldHave(size(10));

        // under #ires div, find first hyperlink with matching href
        $("#ires").find(By.linkText("http://selenide.org/")).shouldBe(visible);
    }

}
