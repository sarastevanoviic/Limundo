package tests;

import base.BaseTest;
import constants.Constants;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class SearchAndAuctionTest extends BaseTest {

    @Test
    public void testSearchAndSortAuctionsThenVerifyProductDetailsTest() {
        new HomePage(driver)
                .setSearhBar(Constants.VALID_SEARCH_TERM)
                .sortByPrice()
                .clickOnFirstAuction()
                .verifyAuctionTitle(Constants.VALID_SEARCH_TERM)
                .verifyPriceDisplayed()
                .verifyTimeLeftDisplayed()
                .verifyBidCountDisplayed();
    }

}
