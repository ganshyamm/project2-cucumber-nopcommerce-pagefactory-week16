package com.nopcommerce.demo.pages;
import com.nopcommerce.demo.utility.UtilityClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CompletedCheckOutPage extends UtilityClass {
    private static final Logger log = LogManager.getLogger(CompletedCheckOutPage.class.getName());




    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successText;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    public CompletedCheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyThankYouText() {
        Reporter.log("Verify Thank you Text " + thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

    public String verifySuccessOrderText() {
        Reporter.log("Verify success order text" + successText.toString());
        return getTextFromElement(successText);
    }

    public void clickOnContinue() {
        Reporter.log("Click on continue " + continueButton.toString());
        clickOnElement(continueButton);
    }
}
