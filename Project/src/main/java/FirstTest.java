import com.codeborne.selenide.Condition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        open("https://www.youtube.com/");
    }

    @Test
    public void userCanLoginByUsername() {
        $(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")).setValue("perros bailando").pressEnter();
        $(By.id("text")).shouldBe(Condition.visible);
    }

    @After
    public void tearDown() {
        Browser.closeDriver();
    }


}
