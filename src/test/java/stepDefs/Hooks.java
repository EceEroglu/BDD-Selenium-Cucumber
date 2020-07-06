package stepDefs;

import factory.WebDriverFactory;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;


    @Before(order=1)
    public void initializeTest() {
        System.out.println("Start the browser and Clear the cookies");
        launchbrowser();
    }

    @Before(order=0)
    public void beforeScenarioStart() {
        System.out.println("-----------------Start of Scenario-----------------");

    }

    @After(order=0)
    public void afterScenarioFinish() {
        System.out.println("-----------------End of Scenario-----------------");
    }

    @After(order=1)
    public void afterScenario(Scenario scenario) {
        System.out.println("close the browser");
        if (scenario.isFailed()) {
            try {
                byte[] screenShot = ((TakesScreenshot)Hooks.driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenShot, "image/png");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }

    public void launchbrowser() {
        driver = WebDriverFactory.createWebDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void closeBrowser() {
        driver.quit();
    }
}