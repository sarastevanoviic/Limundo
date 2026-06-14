package tests;

import base.BaseTest;
import constants.Constants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.AuctionPage;
import pages.HomePage;

import static constants.Constants.BUY_NOW_OPTION_MISSING_MSG;

public class SearchTest extends BaseTest {

    @Test
    public void testSearchAndSortAuctionsThenVerifyProductDetailsTest() {
        HomePage homePage = new HomePage(driver);
        AuctionPage auctionPage = new AuctionPage(driver);
        homePage.setSearhBar(Constants.VALID_SEARCH_TERM);
        homePage.setCategory();
        homePage.sortByPrice();
        homePage.clickOnFirstAuction();

        String actualTitle = auctionPage.getAuctionTitleText().toLowerCase();
        Assertions.assertTrue(actualTitle.contains(Constants.VALID_SEARCH_TERM),
                Constants.TITLE_NOT_CONTAIN_IPHONE_ERROR);
        Assertions.assertTrue(auctionPage.isPriceDisplayed(),
                Constants.PRICE_NOT_DISPLAYED_ERROR);
        Assertions.assertTrue(auctionPage.isTimeLeftDisplayed(),
                Constants.TIME_LEFT_NOT_DISPLAYED_ERROR);
        Assertions.assertTrue(auctionPage.isBidCountDisplayed(),
                Constants.BID_COUNT_NOT_DISPLAYED_ERROR);
    }

    @Test
    public void invalidSearchTermTest() {
        HomePage homePage = new HomePage(driver);
        homePage.setSearhBar(Constants.INVALID_SEARCH_TERM);

        String actualMessage = homePage.getNoResultsMessageText();
        Assertions.assertTrue(actualMessage.toLowerCase().contains(Constants.NO_RESULTS_SUBSTRING),
                Constants.NO_RESULTS_MSG_ERROR);
    }

    @Test
    public void applyFilterAndVerifyTest() {
        HomePage homePage = new HomePage(driver);
        homePage.setSearhBar(Constants.VALID_SEARCH_TERM);
        homePage.selectFilter();

        boolean isSelected = homePage.isBuyNowFilterSelected();
        Assertions.assertTrue(isSelected, Constants.BUY_NOW_FILTER_NOT_SELECTED_MSG);

        homePage.clickOnFirstAuction();
        Assertions.assertTrue(homePage.isBuyNowOptionAndPriceVisible(), BUY_NOW_OPTION_MISSING_MSG);
    }
}
