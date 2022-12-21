package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.DeskTopPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.runner.Computer;

public class ComputerSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on Computer tab \"([^\"]*)\"$")
    public void iClickOnComputerTab(String computer) {
        new HomePage().verifyPageNavigation(computer);
    }

    @And("^I click on Desktop tab \"([^\"]*)\"$")
    public void iClickOnDesktopTab(String Desktop) {
        new HomePage().clickOnDeskTop();

    }


    @Then("^I should see books sorted in z to a order$")
    public void iShouldSeeBooksSortedInZToAOrder() {
        new DeskTopPage().arrangeProductInDescendingOrder();

    }


    @And("^I click on sort by z to a$")
    public void iClickOnSortByZToA() {
        new DeskTopPage().arrangeProductInDescendingOrder();
    }
}
