package pages;

import constants.Constants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    protected WebElement waitForVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected WebElement waitForClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void set(WebElement element, String text) {
        waitForVisible(element).clear();
        waitForVisible(element).sendKeys(text);
    }

    protected void click(WebElement element) {
        waitForClickable(element).click();
    }

    protected String getText(WebElement element) {
        return waitForVisible(element).getText().trim();
    }

    protected void clickByJs(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }

    protected void selectBootstrapDropdownOption(WebElement dropdownButton, WebElement optionLink) {
        waitForClickable(dropdownButton).click();
        waitForClickable(optionLink).click();
    }

    protected WebElement getFirstEnabledElement(List<WebElement> elements) {
        for (WebElement element : elements) {
            try {
                if (element.isEnabled()) {
                    return element;
                }
            } catch (Exception e) {
                continue;
            }
        }
        throw new RuntimeException(Constants.ELEMENT_NOT_FOUND_MSG);
    }

}
