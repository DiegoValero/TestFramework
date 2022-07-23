import browser.Browser;
import com.codeborne.selenide.Condition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTest {

    @Before
    public void setUp() {
        open("https://www.youtube.com/");
    }

    @Test
    public void firstTest() {
        $(By.xpath("//input[@id= 'search']")).setValue("perros bailando").pressEnter();
        $(By.id("contents")).shouldBe(Condition.visible);
    }

    @Test
    public void secondTest() {
        $(By.xpath("//yt-icon[@id= 'guide-icon']")).shouldBe(Condition.visible);
    }

    @After
    public void tearDown() {
        Browser.closeDriver();
    }
}
