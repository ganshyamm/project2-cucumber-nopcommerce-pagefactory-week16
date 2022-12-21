Feature: Computer
  As a user I want to visit computer page into nopcommerce website

  Scenario: User Should navigate to computer page successfully
    Given I am on homepage
    When I click on Computer tab "Computer"

  Scenario: user should verify Product Arrange In Alphabetical Order
    Given I am on homepage
    When I click on Computer tab "Computer"
    And I click on Desktop tab "Desktops"
    And I click on sort by z to a
    Then I should see books sorted in z to a order





