package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.UtilityClass;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends UtilityClass {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktop;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutButton;
    @CacheLookup
    @FindBy(xpath = "//div/ul[@class='top-menu notmobile']/li[2]/a[@href='/electronics']")
    WebElement electronicMouseHover;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void selectMenu(String menu) {
        String mainMenu = menu.toLowerCase();
        String expression = "//a[@href ='/" + mainMenu + "']";
        driver.findElement(By.xpath(expression)).click();
        String currentUrl = driver.getCurrentUrl();
        //  Assert.assertEquals("Navigated successfully", currentUrl,"Do not Navigate" + menu);

    }

    @FindBy(xpath = "//a[@href='/computers']")
    WebElement computer;

    public void verifyPageNavigation(String Computer) {
        mouseHoverToElementAndClick(computer);

    }

    public void clickOnDeskTop() {
        Reporter.log("Click on Desktop" + desktop.toString());
        clickOnElement(desktop);
    }

    public void mouseHoverOnElectronics() {
        Reporter.log("Mouse hover on electronics" + electronicMouseHover.toString());
        mouseHoverToElementAndClick(electronicMouseHover);

    }
    @CacheLookup
    @FindBy(xpath = "//ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement clickOnCellPhone;


    public void clickOnCellPhones() {
        Reporter.log("click on cellphone" + clickOnCellPhone.toString());
        mouseHoverToElementAndClick(clickOnCellPhone);

    }

    public String verifyWelComeText() {
        Reporter.log("Verify welcome Text" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnLogOut() {
        Reporter.log("Click on Logout" + logoutButton.toString());
        clickOnElement(logoutButton);
    }
}
