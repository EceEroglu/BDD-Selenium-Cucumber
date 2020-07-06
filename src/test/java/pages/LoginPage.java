package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends MainPage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    WebElement txtbx_Email;

    @FindBy(id = "password")
    WebElement txtbx_Password;

    @FindBy(xpath = "//div[@id='loginButton']")
    WebElement Btn_Login;


    public WebElement get_Txtbx_Email() {
        return txtbx_Email;
    }

    public WebElement get_Txtbx_Password() {
        return txtbx_Password;
    }

    public void validateTitle() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "Giriş Yap - n11.com");

    }

    public void click_On_LogIn_Button() throws InterruptedException {
        Btn_Login.click();
        Thread.sleep(5000);
    }

    public void enter_Email() {
        get_Txtbx_Email().clear();
        get_Txtbx_Email().sendKeys("erogluece@yandex.com");
    }

    public void enter_Password() {
        get_Txtbx_Password().clear();
        get_Txtbx_Password().sendKeys("test12345");
    }


}