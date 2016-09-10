package qa.example;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.Rule;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class TestBase
{
	TestBase()
	{
		WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(1000, 1000));
		WebDriverRunner.getWebDriver().manage().window().setPosition(new Point(10,10));
	}

	@Rule
	public ScreenShooter photographer = ScreenShooter.failedTests();
}
