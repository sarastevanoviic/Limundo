package tests;

import base.BaseTest;
import constants.Constants;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class SearchAndAuctionTest extends BaseTest {

    @Test
    public void testSearchAndSortAuctionsThenVerifyProductDetailsTest() {
        new HomePage(driver)
                .setSearhBar(Constants.VALID_SEARCH_TERM) // 1. Ukucaj pojam
                .sortByPrice()                             // 2. Sortiraj
                .clickOnFirstAuction()                     // 3. Klikni (prelazi na AuctionPage)
                .verifyAuctionTitle(Constants.VALID_SEARCH_TERM) // 4. Verifikuj naslov
                .verifyPriceDisplayed()                    // 5. Verifikuj cenu
                .verifyTimeLeftDisplayed()                 // 6. Verifikuj vreme
                .verifyBidCountDisplayed();
    }

}
