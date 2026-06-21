package pages;

import constants.Constants;
import locators.Locators;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AuctionPage extends BasePage {
    private Locators locators;

    public AuctionPage(WebDriver driver) {
        super(driver);
        this.locators = new Locators();
        PageFactory.initElements(driver, this.locators);
    }

    public String getAuctionTitleText() {
        waitForVisible(locators.auctionTitle);
        return locators.auctionTitle.getText();
    }

    public AuctionPage verifyAuctionTitle(String expectedTerm) {
        String actualTitle = getAuctionTitleText().toLowerCase();
        assertTrue(actualTitle.contains(expectedTerm.toLowerCase()), Constants.TITLE_NOT_CONTAIN_IPHONE_ERROR);
        return this;
    }

    public AuctionPage verifyPriceDisplayed() {
        waitForVisible(locators.currentPrice);
        assertTrue(locators.currentPrice.isDisplayed(), Constants.PRICE_NOT_DISPLAYED_ERROR);
        return this;
    }

    public AuctionPage verifyTimeLeftDisplayed() {
        boolean isPresent = !driver.findElements(By.id("preostaloVreme")).isEmpty();
        assertTrue(isPresent, Constants.TIME_LEFT_NOT_DISPLAYED_ERROR);

        waitForVisible(locators.timeLeft);
        assertTrue(locators.timeLeft.isDisplayed(), Constants.TIME_LEFT_NOT_DISPLAYED_ERROR);
        return this;
    }

    public AuctionPage verifyBidCountDisplayed() {
        boolean isPresent = !driver.findElements(By.id("broj-bidova-prikaz")).isEmpty();
        assertTrue(isPresent, Constants.BID_COUNT_NOT_DISPLAYED_ERROR);

        waitForVisible(locators.bidCount);
        assertTrue(locators.bidCount.isDisplayed(), Constants.BID_COUNT_NOT_DISPLAYED_ERROR);
        return this;
    }

    public AuctionPage verifyBuyNowBtnDisplayed() {
        waitForVisible(locators.buyNowBtn);
        assertTrue(locators.buyNowBtn.isDisplayed(), Constants.BUY_NOW_OPTION_MISSING_MSG);
        return this;
    }

    public AuctionPage verifyBuyNowPriceDisplayed() {
        waitForVisible(locators.buyNowPrices);
        assertTrue(locators.buyNowPrices.isDisplayed(), Constants.BUY_NOW_OPTION_MISSING_MSG);
        return this;
    }
}
