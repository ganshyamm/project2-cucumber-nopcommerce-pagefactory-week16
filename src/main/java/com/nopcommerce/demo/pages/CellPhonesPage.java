package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.UtilityClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CellPhonesPage extends UtilityClass {
    private static final Logger log = LogManager.getLogger(CellPhonesPage.class.getName());




    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1[text() = 'Cell phones']")
    WebElement cellphonesText;
    @CacheLookup
    @FindBy(xpath = "//div/a[text()='List']")
    WebElement listView;
    @CacheLookup
    @FindBy(xpath = "//h2/a[text()='Nokia Lumia 1020']")
    WebElement nokiaLumia;

    public CellPhonesPage() {
        PageFactory.initElements(driver, this);
    }
    public String verifyCellPhoneText() {
        Reporter.log("Verify cellphone text" + cellphonesText.toString());
        return getTextFromElement(cellphonesText);
    }

    public void clickOnListView() {
        Reporter.log("click on list" + listView.toString());
        clickOnElement(listView);
    }

    public void clickOnNokia() throws InterruptedException {
        Reporter.log("click on nokia" + nokiaLumia.toString());
        Thread.sleep(5000);
        clickOnElement(nokiaLumia);
    }
}
