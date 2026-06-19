package tests;

import base.BaseTest;
import constants.Constants;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class InvalidSearchTermTest extends BaseTest {


    @Test
    public void invalidSearchTermTest() {
        new HomePage(driver)
                .setSearhBar(Constants.INVALID_SEARCH_TERM)
                .verifyNoResultsMessage(Constants.NO_RESULTS_SUBSTRING);
    }
}
