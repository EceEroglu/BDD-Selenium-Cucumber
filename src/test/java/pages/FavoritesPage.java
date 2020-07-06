package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FavoritesPage extends MainPage {

    public FavoritesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//span[@class='deleteProFromFavorites']")
    WebElement deleteFromFavorites;

    @FindBy(xpath = "//div[@class='emptyWatchList hiddentext']")
    WebElement emptyWishList;

    public void deleteProduct() {

        deleteFromFavorites.click();

    }

    public void skipPopUp() {

        try {
            WebDriverWait wait = new WebDriverWait(driver, 2);
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            //exception handling
        }

    }

    public boolean emptyWishListTextisDisplayed() {

       return emptyWishList.isDisplayed();

    }

}
