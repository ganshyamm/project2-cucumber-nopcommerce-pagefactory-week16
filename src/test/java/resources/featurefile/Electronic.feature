Feature: Electronic
  As user I want to navigate to Electronic page

  @smoke @regression
  Scenario: user Should Navigate To Cell Phones Page Successfully
    Given I am on homepage
    When I click on Electronic tab
    And I click on CellPhone tab
    Then  I verify cell phone text

  @sanity @regression
  Scenario: user Should Add Product And Place Order Successfully
    Given I am on homepage
    When I click on Electronic tab
    And I click on CellPhone tab
    And I click on List View Tab
    And I click On Nokia Lumia Product
    And I verify Nokia Lumia Text
    And I verify Price
    And I change The Quantity
    And I click On Add To Cart Buttons
    And I verify Product Added In Shopping Cart Text
    And I click On Close Button
    And I hover On Shopping Cart And Click On Go To Cart Button
    And I verify Shopping Cart Text
    And I verify The Quantity Is two
    And I verify The Total
    And I click On Check Box
    And I click On Check out Button
    And I verify Welcome Message
    And I click On Register Tab
    And I verify Register Text
    And I enter text in mandatory Fields
    And I click On Registration Button
    And I verify Registration Text
    And I click On Continue Tab
    And I check Shopping Cart Text

    And I click On Terms And Services Box
    And I click On Checkout Last
    And I fill Delivery Address Fields
    And I click On Continues Button
    And I click On second Day Air Button
    And I click Continue
    And I select Credit Card Radio Button
    And I click Con
    And I select Visa From DropDown
    And I fill Card Details
    And I click Con Btn
    And I verify Credit Card Text
    And I verify second Day Air Text
    And I verify Final Total
    And I click On Confirm Button
    And I verify Thank You Text
    And I verify Successfully Processed Message
    And I click On Continue
    And I verify Welcome To Our Store Text
