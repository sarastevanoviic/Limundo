package pages;

import constants.Constants;
import locators.Locators;
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

    public void setSearhBar(String text) {
        set(locators.searchBar, text);
        clickByJs(locators.searchButton);
    }

    public void setCategory() {
        waitForClickable(locators.category);
        clickByJs(locators.category);
    }

    public void sortByPrice() {
        selectBootstrapDropdownOption(locators.filterBtn, locators.sortByPriceAsc);
    }

    public void clickOnFirstAuction() {
        waitForClickable(locators.firstAuctionItem);
        locators.firstAuctionItem.click();
    }

    public String getNoResultsMessageText() {
        waitForVisible(locators.noResultMessage);
        return locators.noResultMessage.getText();
    }

    public void selectFilter() {
        waitForClickable(locators.purchaseMethodFilterLink).click();
        waitForClickable(locators.buyNow);
        clickByJs(locators.buyNow);
    }

    public boolean isBuyNowFilterSelected() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Constants.ALL_BUY_NOW_FILTERS)));
        return element.isSelected();
    }

    public boolean isBuyNowOptionAndPriceVisible() {
        boolean isBtnVisible = locators.buyNowBtn.isDisplayed();
        boolean isPriceVisible = locators.buyNowPrices.isDisplayed();
        return isBtnVisible && isPriceVisible;
    }
}
