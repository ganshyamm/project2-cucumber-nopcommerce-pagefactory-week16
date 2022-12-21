package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ElectronicSteps {

    @When("^I click on Electronic tab$")
    public void iClickOnElectronicTab() {
        new HomePage().mouseHoverOnElectronics();

    }

    @And("^I click on CellPhone tab$")
    public void iClickOnCellPhoneTab() {
        new HomePage().clickOnCellPhones();
    }

    @Then("^I verify cell phone text$")
    public void iVerifyCellPhoneText() {
        new CellPhonesPage().verifyCellPhoneText();

    }

    @And("^I click on List View Tab$")
    public void iClickOnListViewTab() {
        new CellPhonesPage().clickOnListView();


    }

    @And("^I click On Nokia Lumia Product$")
    public void iClickOnNokiaLumiaProduct() throws InterruptedException {
        Thread.sleep(1000);
        new CellPhonesPage().clickOnNokia();
    }

    @And("^I verify Nokia Lumia Text$")
    public void iVerifyNokiaLumiaText() {
        Assert.assertEquals("Nokia Lumia 1020 is not displayed", "Nokia Lumia 1020",
                new NokiaLumiaPage().verifyNokiaLumiaText());


    }

    @And("^I verify Price$")
    public void iVerifyPrice() {
        Assert.assertEquals("$349.00 is not displayed", "$349.00", new NokiaLumiaPage().verifyPrice());

    }

    @And("^I change The Quantity$")
    public void iChangeTheQuantity() {
        new NokiaLumiaPage().updateNokiaQuantity("2");
    }

    @And("^I click On Add To Cart Buttons$")
    public void iClickOnAddToCartButtons() {
        new NokiaLumiaPage().nokiaAddToCartButton();
    }

    @And("^I verify Product Added In Shopping Cart Text$")
    public void iVerifyProductAddedInShoppingCartText() {
        Assert.assertEquals("Product add in shopping cart is not displayed", "The product has been added to your shopping cart",
                new NokiaLumiaPage().verifyProductAddedToTheCartMessage());
    }

    @And("^I click On Close Button$")
    public void iClickOnCloseButton() {
        new NokiaLumiaPage().clickOnCrossButton();

    }

    @And("^I hover On Shopping Cart And Click On Go To Cart Button$")
    public void iHoverOnShoppingCartAndClickOnGoToCartButton() {
        new NokiaLumiaPage().clickOnShoppingCart();

    }

    @And("^I verify Shopping Cart Text$")
    public void iVerifyShoppingCartText() {
        Assert.assertEquals("Shopping cart is not displayed", "Shopping cart", new ShoppingCartPage().verifyTheShoppingCartText());


    }

    @And("^I verify The Quantity Is two$")
    public void iVerifyTheQuantityIsTwo() {
        Assert.assertEquals("Number is not displayed", "2", new ShoppingCartPage().verifyProductQuantity());

    }

    @And("^I verify The Total$")
    public void iVerifyTheTotal() {
        Assert.assertEquals("number is not displayed", "$698.00", new ShoppingCartPage().verifyTotalPrice());
    }

    @And("^I click On Check Box$")
    public void iClickOnCheckBox() {
        new ShoppingCartPage().clickOnCheckBox();

    }

    @And("^I click On Check out Button$")
    public void iClickOnCheckOutButton() {
        new CheckOutAsGuestPage().clickOnAsGuestButton();
    }

    @And("^I verify Welcome Message$")
    public void iVerifyWelcomeMessage() {

    }

    @And("^I click On Register Tab$")
    public void iClickOnRegisterTab() {
        new CheckOutAsGuestPage().clickOnARegisterTab();

    }

    @And("^I verify Register Text$")
    public void iVerifyRegisterText() {
        Assert.assertEquals("Welcome message is not displayed", "Welcome, Please Sign In!",
                new CheckOutAsGuestPage().VerifyTheWelComeText());


    }

    @And("^I enter text in mandatory Fields$")
    public void iEnterTextInMandatoryFields() {
        new RegisterPage().mandatoryFields();

    }

    @And("^I click On Registration Button$")
    public void iClickOnRegistrationButton() {
        new RegisterPage().clickOnRegisterButton();


    }

    @And("^I verify Registration Text$")
    public void iVerifyRegistrationText() {
        Assert.assertEquals("Registration text is not displayed", "Your registration completed",
                new RegisterPage().verifyRegistration());

    }

    @And("^I click On Continue Tab$")
    public void iClickOnContinueTab() {
        new RegisterPage().clickOnContinueTab();
    }

    @And("^I check Shopping Cart Text$")
    public void iCheckShoppingCartText() {
        Assert.assertEquals("Shopping cart is not displayed", "Shopping cart",
                new ShoppingCartPage().verifyTheShoppingCartText());

    }
//
//    @And("^I click on Login$")
//    public void iClickOnLogin() {
//
//    }
//
//    @And("^I enter userName$")
//    public void iEnterUserName() {
//    }
//
//    @And("^I enter password$")
//    public void iEnterPassword() {
//    }
//
//    @And("^I click on login button$")
//    public void iClickOnLoginButton() {
//    }

    @And("^I click On Terms And Services Box$")
    public void iClickOnTermsAndServicesBox() {
        new ShoppingCartPage().clickOnTermsOfService();

    }

    @And("^I click On Checkout Last$")
    public void iClickOnCheckoutLast() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }

    @And("^I fill Delivery Address Fields$")
    public void iFillDeliveryAddressFields() {
        new BillingCheckOutPage().fillDeliveryAddressFields();

    }

    @And("^I click On Continues Button$")
    public void iClickOnContinuesButton() {
        new RegisterPage().clickOnContinueTab();
    }

    @And("^I click On second Day Air Button$")
    public void iClickOnSecondDayAirButton() {
        new ShippingMethodCheckOutPage().clickOn2ndDayAir();
    }

    @And("^I click Continue$")
    public void iClickContinue() {
        new ShippingMethodCheckOutPage().clickOnContinue();
    }

    @And("^I select Credit Card Radio Button$")
    public void iSelectCreditCardRadioButton() {
        new PaymentMethodCheckOutPage().clickOnCreditCard();
    }

    @And("^I click Con$")
    public void iClickCon() {
        new PaymentMethodCheckOutPage().clickOnContinue();
    }

    @And("^I select Visa From DropDown$")
    public void iSelectVisaFromDropDown() {
        new PaymentCheckOutPage().selectCardTypeFromDropDown("visa");
    }

    @And("^I fill Card Details$")
    public void iFillCardDetails() {
        new PaymentCheckOutPage().fillCardDetails();

    }

    @And("^I click Con Btn$")
    public void iClickConBtn() {
        new PaymentCheckOutPage().clickOnContinueButton();
    }

    @And("^I verify Credit Card Text$")
    public void iVerifyCreditCardText() {
        Assert.assertEquals("Credit Card is not displayed", "Credit Card",
                new ConfirmOrderPage().VerifyCreditCardPaymentMethod());

    }

    @And("^I verify second Day Air Text$")
    public void iVerifySecondDayAirText() {
        Assert.assertEquals("2nd Day Air is not displayed", "2nd Day Air",
                new ConfirmOrderPage().VerifyShippingMethod2ndDayAir());
    }

    @And("^I verify Final Total$")
    public void iVerifyFinalTotal() {
        Assert.assertEquals("$698.00 is not displayed", "$698.00", new ConfirmOrderPage().verifyTheTotalPrice());
    }


    @And("^I click On Confirm Button$")
    public void iClickOnConfirmButton() {
        new ConfirmOrderPage().clickOnConFirm();
    }

    @And("^I verify Thank You Text$")
    public void iVerifyThankYouText() {



    }

    @And("^I verify Successfully Processed Message$")
    public void iVerifySuccessfullyProcessedMessage() {
        Assert.assertEquals("Successfully processed message is not displayed", "Your order has been successfully processed!",
                new CompletedCheckOutPage().verifySuccessOrderText());

    }

    @And("^I click On Continue$")
    public void iClickOnContinue() {
       new CompletedCheckOutPage().clickOnContinue();
    }

    @And("^I verify Welcome To Our Store Text$")
    public void iVerifyWelcomeToOurStoreText() {
        Assert.assertEquals("Welcome to our store is not displayed", "Welcome to our store",
                new HomePage().verifyWelComeText());

    }

    @Then("^I click On Logout Link$")
    public void iClickOnLogoutLink() {
        new HomePage().clickOnLogOut();
    }

}
