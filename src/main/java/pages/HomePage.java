package pages;

import constants.Constants;
import locators.Locators;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage {

    private Locators locators;

    public HomePage(WebDriver driver) {
        super(driver);
        this.locators = new Locators();
        PageFactory.initElements(driver, this.locators);
    }

    public HomePage setSearhBar(String text) {
        set(locators.searchBar, text);
        click(locators.searchButton);
        return this;
    }

    public HomePage setCategory() {
        waitForClickable(locators.category);
        click(locators.category);
        return this;
    }

    public HomePage sortByPrice() {
        selectBootstrapDropdownOption(locators.filterBtn, locators.sortByPriceAsc);
        return this;
    }

    public AuctionPage clickOnFirstAuction() {
        waitForClickable(locators.firstAuctionItem);
        locators.firstAuctionItem.click();
        return new AuctionPage(driver);
    }

    public HomePage verifyNoResultsMessage(String expectedSubstring) {
        waitForVisible(locators.noResultMessage);
        String actualMessage = locators.noResultMessage.getText().toLowerCase();

        Assertions.assertTrue(
                actualMessage.contains(expectedSubstring.toLowerCase()),
                Constants.NO_RESULTS_MSG_ERROR
        );

        return this;
    }

    public HomePage selectFilter() {
        waitForClickable(locators.purchaseMethodFilterLink).click();
        waitForClickable(locators.buyNow);
        clickByJs(locators.buyNow);
        return this;
    }

    public HomePage verifyBuyNowFilterSelected() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Constants.ALL_BUY_NOW_FILTERS)));
        Assertions.assertTrue(element.isSelected(), Constants.BUY_NOW_FILTER_NOT_SELECTED_MSG);
        return this;
    }

    public HomePage isBuyNowOptionAndPriceVisible() {
        boolean isBtnVisible = locators.buyNowBtn.isDisplayed();
        boolean isPriceVisible = locators.buyNowPrices.isDisplayed();
        Assertions.assertTrue(isBtnVisible && isPriceVisible, Constants.BUY_NOW_OPTION_MISSING_MSG);
        return this;
    }
}
