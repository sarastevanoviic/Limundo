package constants;

public class Constants {


    //URL
    public static final String LIMUNDO_URL = "https://www.limundo.com/";

    //LOCATORS
    public static final String SEARCH_BAR = "//input[@name='txtPretraga']";
    public static final String SEARCH_BUTTON = "//button[text()='Traži']";
    public static final String CATEGORY = "//h3[text()='Mobilni telefoni']";
    public static final String FILTER_BUTTON = "button.dropdown-toggle[aria-label='Sortiraj po']";
    public static final String SORT_BY_PRICE_ASC = "a[data-type='cena_ASC']";
    public static final String FRIST_AUCTION_ITEM = ".list-view-listing-item:first-of-type .content-top h3 a";
    public static final String AUCTION_TITLE = "h1.product-title.hidden-md-down";
    public static final String CURRENT_PRICE = "najveci_bid";
    public static final String TIME_LEFT = "preostaloVreme";
    public static final String BID_COUNT = "broj-bidova-prikaz";
    public static final String NO_RESULT_MESSAGE = ".did-you-mean-info p:nth-of-type(2)";
    public static final String BUY_NOW = "//label[@for='JeKOFP_kupi_odmah']";
    public static final String PURCHASE_METHOD_FILTER_LINK = "//a[contains(., 'Način kupovine')]";
    public static final String ALL_BUY_NOW_FILTERS = "JeKOFP_kupi_odmah";
    public static final String BUY_NOW_BTN = "product-buy-now";
    public static final String BUY_NOW_PRICE =".//span[contains(text(), 'RSD')]";


    //SEARCH TERMS
    public static final String VALID_SEARCH_TERM = "iphone 14";
    public static final String NEW_SEARCH_TERM = "iphone 11";
    public static final String INVALID_SEARCH_TERM = "xyzproizvod999";

    //ASSERT MESSAGES
    public static final String TITLE_NOT_CONTAIN_IPHONE_ERROR = "The title does not contain Iphone 14";
    public static final String PRICE_NOT_DISPLAYED_ERROR = "The price is not displayed";
    public static final String TIME_LEFT_NOT_DISPLAYED_ERROR = "Time left is not displayed";
    public static final String BID_COUNT_NOT_DISPLAYED_ERROR = "The number of bids is not displayed";
    public static final String NO_RESULTS_SUBSTRING = "trenutno nema predmeta";
    public static final String NO_RESULTS_MSG_ERROR = "The message text does not contain the expected text!";
    public static final String BUY_NOW_FILTER_NOT_SELECTED_MSG = "The 'Kupi odmah' filter is not selected!";
    public static final String BUY_NOW_OPTION_MISSING_MSG = "The 'Kupi odmah' option is not visible";


    //EXCEPTION MESSAGE
    public static final String ELEMENT_NOT_FOUND_MSG = "None of the elements are available!";
}

