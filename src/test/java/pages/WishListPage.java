package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends MainPage  {


    public WishListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//ul[@class='listItemProductList']//li//a//img")
    WebElement favoriteProduct;

    public boolean isFavProductDisplayed() {

    return favoriteProduct.isDisplayed();
}

}
