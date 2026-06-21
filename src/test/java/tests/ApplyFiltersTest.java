package tests;

import base.BaseTest;
import constants.Constants;
import org.junit.jupiter.api.Test;
import pages.HomePage;


public class ApplyFiltersTest extends BaseTest {
    @Test
    public void applyFilterAndVerifyTest() {

        new HomePage(driver)
                .setSearhBar(Constants.VALID_SEARCH_TERM)
                .selectFilter()
                .verifyBuyNowFilterSelected()
                .clickOnFirstItem()
                .verifyBuyNowBtnDisplayed()
                .verifyBuyNowPriceDisplayed();
    }
}
