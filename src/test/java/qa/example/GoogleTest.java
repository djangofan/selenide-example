package qa.example;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest extends TestBase
{
    @Test
    public void searchInGoogleUsingXPath()
    {
        open("http://google.com");
        $(By.name("q")).val("selenide").pressEnter();

        // verify 10 rc divs
        $$(By.xpath(".//div[@id='ires']//div[@class='rc']")).shouldHave(size(10));

        // verify 10 unclassified result divs
        $$(By.xpath(".//div[@id='res']/div/div/div/div/div/div")).shouldHave(size(10));

        // verify 10 h3 anchor links
        $$(By.xpath(".//div[@id='rso']/div/div/div/h3/a")).shouldHave(size(10));

        // verify first link is selenide.org
        $(By.xpath(".//h3/a[contains(@href,'selenide.org')]")).shouldBe(visible);
    }

}
