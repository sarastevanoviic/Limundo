package locators;

import constants.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Locators {

    @FindBy(xpath = Constants.SEARCH_BAR)
    public WebElement searchBar;

    @FindBy(xpath = Constants.SEARCH_BUTTON)
    public WebElement searchButton;

    @FindBy(xpath = Constants.CATEGORY)
    public WebElement category;

    @FindBy(css = Constants.FILTER_BUTTON)
    public WebElement filterBtn;

    @FindBy(css = Constants.SORT_BY_PRICE_ASC)
    public WebElement sortByPriceAsc;

    @FindBy(css = Constants.FRIST_AUCTION_ITEM)
    public WebElement firstAuctionItem;

    @FindBy(css = Constants.AUCTION_TITLE)
    public WebElement auctionTitle;

    @FindBy(id = Constants.CURRENT_PRICE)
    public WebElement currentPrice;

    @FindBy(id = Constants.TIME_LEFT)
    public WebElement timeLeft;

    @FindBy(id = Constants.BID_COUNT)
    public WebElement bidCount;

    @FindBy(css = Constants.NO_RESULT_MESSAGE)
    public WebElement noResultMessage;

    @FindBy(xpath = Constants.BUY_NOW)
    public WebElement buyNow;

    @FindBy(xpath = Constants.PURCHASE_METHOD_FILTER_LINK)
    public WebElement purchaseMethodFilterLink;

    @FindBy(id = Constants.ALL_BUY_NOW_FILTERS)
    public List<WebElement> allBuyNowFilters;

    @FindBy(className = Constants.BUY_NOW_BTN)
    public WebElement buyNowBtn;

    @FindBy(xpath = Constants.BUY_NOW_PRICE)
    public WebElement buyNowPrices;
}
