package browser;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    private static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        if (webDriver == null) loadDriver();
        return webDriver;
    }

    public static void setDriver(WebDriver driver) {
        webDriver = driver;
    }

    private static void loadDriver() {
        System.setProperty("webdriver.chrome.driver", "Project/src/main/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        setDriver(driver);
        WebDriverRunner.setWebDriver(driver);
    }

    public static void closeDriver() {
        if (webDriver != null) {
            getWebDriver().quit();
            setDriver(null);
            WebDriverRunner.setWebDriver(null);
        }
    }
}
