package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {


    static final String exePath = "src/test/resources/Binaries/chromedriver_5";

    public static WebDriver createWebDriver() {
        String geckodriverPath = System.getProperty("GeckoDriverPath", "src/test/resources/Binaries/geckodriver");
        String webdriver = System.getProperty("browser", "chrome");

        if ("firefox".equals(webdriver)) {
            System.setProperty("webdriver.gecko.driver", geckodriverPath);
            return new FirefoxDriver();
        } else if ("chrome".equals(webdriver)) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/Binaries/chromedriver_5");
            return new ChromeDriver();
        }
        throw new RuntimeException("Unsupported webdriver: " + webdriver);
    }
}
