package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainPage {

    public static final String url = "https://www.n11.com/";

    static WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='menuTitle nobg']")
    WebElement btnSignIn;

    @FindBy(id = "searchData")
    WebElement searchBar;

    @FindBy(className = "resultText")
    WebElement resultText;

    @FindBy(xpath = "//div[@class='pagination']//a[contains(text(),'2')]")
    WebElement secondPage;

    @FindBy(xpath = "//*[@id=\"p-429757157\"]/div[1]/span")
    WebElement addFavThirdProductIcon;

    @FindBy(xpath = "//a[contains(text(),'Favorilerim')]")
    WebElement myFavorites;

    @FindBy(css = ".closeBtn")
    WebElement skipPopUpButton;

    public void navigateTo_Page(String url) {
        driver.get(url);
    }

    public void clickLogin() {

        btnSignIn.click();
    }

    public void searchText() {

        searchBar.sendKeys("samsung");
        searchBar.sendKeys(Keys.ENTER);
    }

    public void validateTitle() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "n11.com - Alışverişin Uğurlu Adresi");

    }

    public void skipPopup()  {

        driver.manage().window().setSize(new Dimension(1440, 845));
        skipPopUpButton.click();

    }

    public String getResultText() {

      String searchResultText = resultText.getText();
      return searchResultText;
    }

    public String navigateToSecondPage() {
        secondPage.click();
        driver.getCurrentUrl();
        String urlText = driver.getCurrentUrl();
        return urlText;

    }

    public void addThirdProductToFav() {
        addFavThirdProductIcon.click();

    }

    public void goToFavorites() {
        myFavorites.click();

    }

}
