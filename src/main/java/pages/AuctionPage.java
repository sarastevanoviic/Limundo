package pages;

import locators.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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

    public boolean isPriceDisplayed() {
        waitForVisible(locators.currentPrice);
        return locators.currentPrice.isDisplayed();
    }

    public boolean isTimeLeftDisplayed() {
        waitForVisible(locators.timeLeft);
        return locators.timeLeft.isDisplayed();
    }

    public boolean isBidCountDisplayed() {
        waitForVisible(locators.bidCount);
        return locators.bidCount.isDisplayed();
    }
}
